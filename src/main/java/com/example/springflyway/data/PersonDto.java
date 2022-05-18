package com.example.springflyway.data;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public record PersonDto(int id, String name, int age, String lastName) implements Serializable {

}
