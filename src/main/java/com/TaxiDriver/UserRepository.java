package com.TaxiDriver;

import org.springframework.data.repository.CrudRepository;


interface UserRepository extends CrudRepository<User, Integer>
{
    Iterable<User> findByType(String type);
}
