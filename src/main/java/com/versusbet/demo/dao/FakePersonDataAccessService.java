package com.versusbet.demo.dao;

import com.versusbet.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("fakeDao")
public class FakePersonDataAccessService implements  PersonDao{
    private static List<Person> db  = new ArrayList<>();
    @Override
    public int insertPerson(UUID ID, Person pers) {
        db.add(new Person(ID,pers.getName()));
        return 0;
    }

    @Override
    public List<Person> getPeople() {
        return db;
    }

    @Override
    public int updatePersonById(UUID id, Person pers) {
        return 0;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return db.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        return db.remove(db.);
    }

}
