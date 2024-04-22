package com.example.demo.service;

import com.example.demo.repository.TestRepository;
import org.springframework.stereotype.Service;

@Service
public class TestService {
  private TestRepository testRepository;

  public TestService(TestRepository testRepository) {
    this.testRepository = testRepository;
  }

  public String execute() {
    return testRepository.generateWord();
  }
}
