package com.example.springflyway.data;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends CrudRepository<Person, Integer>,
    PagingAndSortingRepository<Person, Integer> {

  List<Person> findAllBy();

}
