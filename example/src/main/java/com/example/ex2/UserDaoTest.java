package com.example.ex2;

import com.example.ex1.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoTest {

  public static void main(String[] args) {
    final ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);

    final UserDao userDao = context.getBean("userDao", UserDao.class);
  }
}
