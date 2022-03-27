package com.example.demo.models;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private final UUID ID;
    private String name;

    public Person(@JsonProperty("id") UUID ID, @JsonProperty("name") String name) {
        this.ID = ID;
        this.name = name;

    }

    public UUID getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
