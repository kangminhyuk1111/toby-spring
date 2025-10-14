package com.example.ex2;

import com.example.ex1.ConnectionMaker;
import com.example.ex1.DConnectionMaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

  @Bean
  public ConnectionMaker connectionMaker() {
    return new DConnectionMaker();
  }
}
