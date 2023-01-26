package com.versusbet.demo.service;

import com.versusbet.demo.dao.PersonDao;
import com.versusbet.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonDao personDao;
    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }
    public List<Person> getAllpeople(){
        return personDao.getPeople();
    }
    public int addPerson(Person pers){
     return personDao.insertPerson(pers);
    }
    public Optional<Person> getPersonById(UUID id){
        return personDao.selectPersonById(id);
    }
}
