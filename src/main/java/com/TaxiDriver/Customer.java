package com.TaxiDriver;

import javax.persistence.Entity;


@Entity
public class Customer extends User {

    String dni;

    public Customer() {
        super();
    }

    public Customer(String email, String password, String dni) {

        super(email, password);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
}