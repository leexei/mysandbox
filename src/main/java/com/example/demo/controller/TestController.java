package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  public String helloworld = "Hello World!";

  private final TestService testService;

  public TestController(TestService testService) {
    this.testService = testService;
  }

  @RequestMapping("/")
  public String init () {
    return testService.execute();
  }
}
