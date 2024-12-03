package com.example.demo.services;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class conexion {
    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/myiki"); // Cambia por tu URL
        config.setUsername("sebas");
        config.setPassword("password");
        config.setMaximumPoolSize(10); // Número máximo de conexiones simultáneas
        config.setMinimumIdle(2); // Número mínimo de conexiones en reposo
        config.setIdleTimeout(30000); // Tiempo antes de liberar conexiones inactivas
        config.setMaxLifetime(1800000); // Vida útil máxima de una conexión
        dataSource = new HikariDataSource(config);
    }

    public static DataSource getDataSource() {
        return dataSource;
    }

}