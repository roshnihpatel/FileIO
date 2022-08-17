package com.sparta.rp.jdbc;

import java.sql.*;

public class UserDAO {
    private final Connection postresConnection;
    private Statement statement;

    public UserDAO(Connection postgresConnection){
        this.postresConnection = postgresConnection;
        try {
            statement = postgresConnection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void printAllUsers(){
        try {
            ResultSet resultSet = statement.executeQuery(SQLQueries.SELECT_ALL);
            while(resultSet.next()){
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void createUser(int id, String name, String email){
        try {
            PreparedStatement preparedStatement = postresConnection.prepareStatement(SQLQueries.INSERT_INTO_DB);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, email);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void updateUserName(int id, String updatedName, String updateEmail){

        try {
            PreparedStatement preparedStatement = postresConnection.prepareStatement(SQLQueries.UPDATE_NAME);
            preparedStatement.setString(1,updatedName);
            preparedStatement.setString(2,updateEmail);
            preparedStatement.setInt(3,id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteUser(int id ){

        try {
            PreparedStatement preparedStatement = postresConnection.prepareStatement(SQLQueries.DELETE_USER);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
