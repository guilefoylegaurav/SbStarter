package com.example.demo.dao;

import com.example.demo.models.Person;

import java.util.List;
import java.util.UUID;

public interface UserDao {
    int insertPerson(UUID ID, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> getAll();

}
