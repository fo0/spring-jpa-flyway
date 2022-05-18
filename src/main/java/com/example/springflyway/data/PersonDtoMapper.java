package com.example.springflyway.data;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonDtoMapper {

  PersonDtoMapper INSTANCE = Mappers.getMapper(PersonDtoMapper.class);

  PersonDto personToPersonDto(Person person);

}
