package com.example.springflyway;

import com.example.springflyway.data.Person;
import com.example.springflyway.data.PersonRepository;
import com.example.springflyway.data.PersonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Log4j2
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @Bean
  CommandLineRunner run(PersonRepository repository, PersonService service) {
    return e -> {
      repository.save(Person.builder()
                            .name("John")
                            .lastName("Doe")
                            .build());

      log.info("converted personDto: {}", service.getPersons());
    };
  }

}
