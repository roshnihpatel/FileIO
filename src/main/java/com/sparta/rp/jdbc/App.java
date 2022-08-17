package com.sparta.rp.jdbc;

import java.sql.*;

public class App {
    public static void main(String[] args) {
        Connection postgresConn = ConnectionManager.connectionToDB();
        UserDAO userDAO = new UserDAO(postgresConn);
//        userDAO.createUser(4,"mike", "mike@spartaglobal.com");
//        userDAO.createUser(5,"ella", "ella@spartaglobal.com");
        //userDAO.createUser(3,"Eralia", "elarlia@spartaglobal.com");
        userDAO.updateUserName(4, "Jake", "jake@spartaglobal.com");
        //userDAO.deleteUser(10);
        userDAO.printAllUsers();
        ConnectionManager.closeConnection();
    }



}
