package com.example.listenerriderequests;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RideRequestConsumer {

    @KafkaListener(topics = "ride-requests", groupId = "ride-request-consume-group")
    public void consumerRideRequest(String rideRequestJson){

        System.out.println("This is ride request message..");
        System.out.println(rideRequestJson);
//        try{
//            RideRequest rideRequest = ObjectMapper.readValue(rideRequestJson, RideRequest.class)
//            System.out.println("received the ride request....");
//            System.out.println(rideRequest);
//        }
//        catch (Exception e){
//            System.out.println("Error while sending topic to listener");
//        }
    }
}
