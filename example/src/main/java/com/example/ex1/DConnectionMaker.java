package com.example.ex1;

import java.sql.Connection;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

  @Override
  public Connection makeConnection() throws ClassNotFoundException, SQLException {
    // 구현체 마다 다른 Connection 연결 방법을 구현
    return null;
  }
}
