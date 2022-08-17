package com.sparta.rp.jdbc;

import com.sparta.rp.jdbc.utils.PropertiesLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
    private static Connection postgresConnection;
    public static Connection connectionToDB(){
        String url = PropertiesLoader.getProperty("url");
        String userName = PropertiesLoader.getProperty("userName");
        String password = PropertiesLoader.getProperty("password");

        try {
            postgresConnection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return postgresConnection;
    }


    public static void closeConnection() {
        try {
            postgresConnection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
