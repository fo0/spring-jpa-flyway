package com.example.springflyway.data;

import java.util.List;
import java.util.stream.StreamSupport;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

  private final PersonRepository repository;
  private final ConversionService conversionService;

  public List<PersonDto> getPersons() {
    return StreamSupport.stream(repository.findAll()
                                          .spliterator(), false)
                        .map(e -> conversionService.convert(e, PersonDto.class))
                        .toList();
  }

}
