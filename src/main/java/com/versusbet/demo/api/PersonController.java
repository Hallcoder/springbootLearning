package com.versusbet.demo.api;

import com.versusbet.demo.model.Person;
import com.versusbet.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private final PersonService personService;
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping("/person")
    public void addPerson(@RequestBody Person pers){
        personService.addPerson(pers);
    }
    @GetMapping("/people")
    public List<Person> getPeople(){
        return personService.getAllpeople();
    }
}
