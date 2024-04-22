package com.example.demo.repository;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnProperty(name="using.mock", havingValue="false", matchIfMissing=true)
public class TestRepositoryImpl implements TestRepository{
  public String generateWord() {
    return "Hello World!";
  }
}
