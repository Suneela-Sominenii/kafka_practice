package com.example.riderequests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RideRequestController {
    @Autowired
    RideRequestProducer rideRequestProducer;

    @PostMapping("/sendToLis")
    public void sendmessageToListener(RideRequest rideRequest){
        rideRequestProducer.sendRideRequest(rideRequest);
        System.out.println("Sending message to listener...");
    }

}
