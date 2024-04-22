package com.example.demo.repository;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnProperty(name="using.mock", havingValue="true", matchIfMissing=false)
@Primary
public class TestRepositoryMockImpl implements TestRepository{
  public String generateWord() {
    return "hehehe!";
  }
}
