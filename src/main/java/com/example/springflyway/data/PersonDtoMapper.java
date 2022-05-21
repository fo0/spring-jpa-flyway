package com.example.springflyway.data;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = SpringMapper.class)
public interface PersonDtoMapper extends Converter<Person, PersonDto> {

  // default all fields will be mapped
  // but add the missing "changed" field
  @Mapping(source = "name", target = "changed")
  PersonDto convert(Person person);

}
