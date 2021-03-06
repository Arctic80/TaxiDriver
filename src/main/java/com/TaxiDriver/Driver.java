package com.TaxiDriver;

import javax.persistence.Entity;


@Entity
public class Driver extends User {

    String driverId;

    public Driver() {
        super();
    }

    public Driver(String email, String password, String driverId) {
        super(email, password);
        this.driverId = driverId;
    }

    public String getDriverId() {
        return driverId;
    }
}