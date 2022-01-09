package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerPerson {

  private final Person modelPerson;

  @GetMapping("api/name/{name}/{age}")
  public Person getName(@PathVariable String name, @PathVariable int age){
    modelPerson.setName(name);
    modelPerson.setAge(age);
    return modelPerson;
  }
}
