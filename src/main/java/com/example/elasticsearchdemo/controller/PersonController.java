package com.example.elasticsearchdemo.controller;

import com.example.elasticsearchdemo.document.Person;
import com.example.elasticsearchdemo.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
@Slf4j
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/{id}")
    public Person getById(@PathVariable("id") String id){
        return personService.findById(id);
    }

    @PostMapping
    public Person save(@RequestBody final Person person){
            return personService.save(person);
    }
}
