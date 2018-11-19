package com.TaxiDriver;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    String email;
    String password;

    public User(String email, String password)
    {
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
