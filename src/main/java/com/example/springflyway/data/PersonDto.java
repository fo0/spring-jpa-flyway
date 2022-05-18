package com.example.springflyway.data;

import java.io.Serializable;

public record PersonDto(int id, String name, int age, String lastName) implements Serializable {

}
