package com.TaxiDriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TaxiDriverController
{

    @Autowired
    private UserRepository userRepository;


    @RequestMapping(value = ("/users"), method = RequestMethod.GET)
    public String listUsers()
    {
        return "List Users";
    }

    @RequestMapping(value = ("/users"), method = RequestMethod.DELETE)
    public String deleteUsers()
    {
        return "All deleted";
    }

    @RequestMapping(value = ("/users/customers"), method = RequestMethod.GET)
    public String listCustomers()
    {
        return "List Customers";
    }

    @RequestMapping(value = ("/users/customers"), method = RequestMethod.POST)
    public String registerClient(@RequestBody Customer customer)
    {
        userRepository.save(customer);

        return "Registered Customer with DNI: " + customer.getDni();
    }

    @RequestMapping(value = ("/users/drivers"), method = RequestMethod.GET)
    public String listDrivers()
    {
        return "List Drivers";
    }

    @RequestMapping(value = ("/users/drivers"), method = RequestMethod.POST)
    public String registerDriver(@RequestBody Driver driver)
    {
        userRepository.save(driver);

        return "Driver Registered with DriverId:" + driver.getDriverId();
    }
}