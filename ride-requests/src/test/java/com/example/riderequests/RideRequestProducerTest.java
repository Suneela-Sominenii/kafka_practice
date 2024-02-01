package com.example.riderequests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.kafka.core.KafkaTemplate;

import static org.mockito.Mockito.times;

@SpringBootTest
public class RideRequestProducerTest {

    @Autowired
    RideRequestProducer rideRequestProducer;

    @MockBean
    private KafkaTemplate<String, RideRequest> kafkaTemplate;

    @Test
    public void testSendRideRequest(){
        RideRequest rd = new RideRequest("Jay" , "Srikakulam", "Vizag", 1353);
        rideRequestProducer.sendRideRequest(rd);
    }

}
