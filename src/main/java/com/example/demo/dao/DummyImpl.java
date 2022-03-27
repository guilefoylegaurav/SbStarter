package com.example.demo.dao;
import com.example.demo.models.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("dummy")
public class DummyImpl implements UserDao{
    private List<Person> DB = new ArrayList<>();

    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    public List<Person> getAll()
    {
        return DB;
    }


}
