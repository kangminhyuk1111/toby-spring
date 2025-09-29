package com.example.ex1;

public class User {

  private String name;
  private String email;
  private Integer age;

  public User(final String name, final String email, final Integer age) {
    this.name = name;
    this.email = email;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(final Integer age) {
    this.age = age;
  }
}
