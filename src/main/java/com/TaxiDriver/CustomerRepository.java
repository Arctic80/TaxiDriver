package com.TaxiDriver;


import org.springframework.data.repository.CrudRepository;

interface UserRepository extends CrudRepository<User, Integer> {}