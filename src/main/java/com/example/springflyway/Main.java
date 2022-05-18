package com.example.springflyway;

import com.example.springflyway.data.Person;
import com.example.springflyway.data.PersonDto;
import com.example.springflyway.data.PersonDtoMapper;
import com.example.springflyway.data.PersonRepository;
import javax.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @Autowired
  private PersonRepository repository;

  @PostConstruct
  public void init() {
    final Person person = repository
        .save(Person.builder()
                    .build());
    log.info("saved entity: {}", person);

    final PersonDto personDto = PersonDtoMapper.INSTANCE.personToPersonDto(person);
    log.info("converted personDto: {}", personDto);
  }

}
