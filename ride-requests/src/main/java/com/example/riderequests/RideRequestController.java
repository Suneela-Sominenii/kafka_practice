package com.example.riderequests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RideRequestController {
    @Autowired
    RideRequestProducer rideRequestProducer;

    @GetMapping("/sendToLis")
    public void sendmessageToListener(@RequestBody RideRequest rideRequest){
        System.out.println("Sending message to listener...");
        rideRequestProducer.sendRideRequest(rideRequest);
    }

}
