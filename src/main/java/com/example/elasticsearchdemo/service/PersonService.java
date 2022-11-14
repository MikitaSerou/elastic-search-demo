package com.example.elasticsearchdemo.service;

import com.example.elasticsearchdemo.document.Person;
import com.example.elasticsearchdemo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public Person save(final Person person){
        Person a =  repository.save(person);
        System.out.println(a.toString());
        return a;
    }

    public Person findById(final String id){
        return repository.findById(id).orElse(null);
    }
}
