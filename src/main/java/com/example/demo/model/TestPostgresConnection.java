package com.example.demo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestPostgresConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/myiki";
        String user = "sebas";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("¡Conexión exitosa a PostgreSQL!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

