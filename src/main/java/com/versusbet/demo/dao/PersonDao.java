package com.versusbet.demo.dao;

import com.versusbet.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID ID, Person pers);
    List<Person> getPeople();
    default int insertPerson(Person pers){
        UUID id = UUID.randomUUID();
        return insertPerson(id,pers);
    }
    int deletePersonById(UUID id);
    int updatePersonById(UUID id,Person pers);
    Optional<Person> selectPersonById(UUID id);
}
