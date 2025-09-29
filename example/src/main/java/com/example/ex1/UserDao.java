package com.example.ex1;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {

  private final ConnectionMaker connectionMaker;

  public UserDao(final ConnectionMaker connectionMaker) {
    this.connectionMaker = connectionMaker;
  }

  public void add(final User user) throws SQLException, ClassNotFoundException {
    // DAO에서는 커넥션을 어떻게하는지 누가하는지 고민할 필요가 없다. 그냥 담당 객체가 해줌. 책임 분리
    final Connection connection = connectionMaker.makeConnection();
  }
}
