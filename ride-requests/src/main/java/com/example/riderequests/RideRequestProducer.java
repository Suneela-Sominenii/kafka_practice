package com.example.riderequests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class RideRequestProducer {
    public String topic = "ride-requests";
    @Autowired
    private KafkaTemplate<String, RideRequest> kafkaTemplate;

    public void sendRideRequests(KafkaTemplate<String,RideRequest> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendRideRequest(RideRequest rideRequest){
        try{
            System.out.println("Sending event...");
            System.out.println(rideRequest);
            kafkaTemplate.send(topic,rideRequest);

        } catch (Exception e) {
            System.out.println("Error sending event...,,,,");
            throw new RuntimeException(e);
        }
    }
}
