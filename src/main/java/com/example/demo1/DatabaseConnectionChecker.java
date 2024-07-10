package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class DatabaseConnectionChecker implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) {
        try {
            Connection connection = dataSource.getConnection();
            System.out.println("연결!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("실패: " + e.getMessage());
        }
    }
}