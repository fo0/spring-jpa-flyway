package com.example.springflyway.controller;

import com.example.springflyway.data.PersonDto;
import com.example.springflyway.data.PersonService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PersonController {

  private final PersonService service;

  @GetMapping
  public List<PersonDto> getPersons() {
    return service.getPersons();
  }

}
