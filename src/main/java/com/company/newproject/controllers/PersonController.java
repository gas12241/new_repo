package com.company.newproject.controllers;

import com.company.newproject.models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Random;

public class PersonController {

    private Person[] people = {
            new Person(1, "Soldier 76", 25),
            new Person(1, "Ana", 25),
            new Person(1, "Mei", 25),
            new Person(1, "Zenyatta", 25)
    };

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Person getQuote() {

        Random rand = new Random();

        return people[rand.nextInt(4)];
    }
}
