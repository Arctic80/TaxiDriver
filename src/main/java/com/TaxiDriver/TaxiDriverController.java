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
    public Iterable<User> listUsers()
    {
        return userRepository.findAll();
    }

    @RequestMapping(value = ("/users"), method = RequestMethod.DELETE)
    public String deleteUsers()
    {
        userRepository.deleteAll();

        return "All deleted";
    }

    @RequestMapping(value = ("/users/customers"), method = RequestMethod.GET)
    public Iterable<User> listCustomers()
    {
        return userRepository.findByType("Customer");
    }

    @RequestMapping(value = ("/users/customers"), method = RequestMethod.POST)
    public String registerClient(@RequestBody Customer customer)
    {
        userRepository.save(customer);

        return "Registered Customer with DNI: " + customer.getDni();
    }

    @RequestMapping(value = ("/users/drivers"), method = RequestMethod.GET)
    public Iterable<User> listDrivers()
    {
        return userRepository.findByType("Driver");
    }

    @RequestMapping(value = ("/users/drivers"), method = RequestMethod.POST)
    public String registerDriver(@RequestBody Driver driver)
    {
        userRepository.save(driver);

        return "Driver Registered with DriverId:" + driver.getDriverId();
    }
}