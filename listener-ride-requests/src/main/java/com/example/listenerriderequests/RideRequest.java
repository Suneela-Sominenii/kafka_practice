package com.example.listenerriderequests;

import java.io.Serializable;

public class RideRequest implements Serializable {
    private final long serialId = 1L;

    private String passengerName;
    private String pickupLocation;
    private String destination;
    private double fare;

    public RideRequest() {
        // Default constructor
    }

    public RideRequest(String passengerName, String pickupLocation, String destination, double fare) {
        this.passengerName = passengerName;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.fare = fare;
    }


    public long getSerialId() {
        return serialId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        passengerName = passengerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "RideRequest{" +
                "passengerName='" + passengerName + '\'' +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", destination='" + destination + '\'' +
                ", fare=" + fare +
                '}';
    }
}

