package com.example.demo.services;
import com.example.demo.dao.UserDao;
import com.example.demo.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    UserDao us;

    @Autowired
    PersonService(@Qualifier("dummy") UserDao us) {
        this.us = us;
    }

    public int addPerson(Person person)
    {
        return us.insertPerson(person);
    }

    public List<Person> getAll() {
        return us.getAll();
    }



}
