package com.shhdq;

import java.sql.*;

public class DBlogic {

    // login workbench variables
    String DB = "jdbc:mysql://localhost:3306/todo_cmd";
    String USER = "root";
    String PASS = "biskviits";

    String test;

    // insert
    public void insert(String insert_data) {
        try(
                Connection conn = DriverManager.getConnection(DB, USER, PASS);
                Statement stmt = conn.createStatement();
        ) {

            // Execute
            String sql = "INSERT INTO users (username) VALUES ('"+insert_data+"')";

            stmt.executeUpdate(sql);


        } catch (SQLException e) {

            System.out.println("test");

        }
    }

    // delete
    public void delete(int delete_data) {
        try(
                Connection conn = DriverManager.getConnection(DB, USER, PASS);
                Statement stmt = conn.createStatement();
        ) {

            // Execute
            String sql = "DELETE FROM users WHERE id='"+delete_data+"'";

            stmt.executeUpdate(sql);


        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    // update
    public void update(int update_data, String text_data) {
        try(
                Connection conn = DriverManager.getConnection(DB, USER, PASS);
                Statement stmt = conn.createStatement();
        ) {

            // Execute
            String sql = "UPDATE users SET username = '"+text_data+"' WHERE id = '"+update_data+"'";

            stmt.executeUpdate(sql);

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    // select
    public void select() {
        try(
                Connection conn = DriverManager.getConnection(DB, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet resultSet = stmt.executeQuery("SELECT id, username FROM users");
        ) {

            // Execute
           while(resultSet.next()) {

               // Display result from db table
               System.out.println("id: " + resultSet.getInt("id"));
               System.out.println("Username: " + resultSet.getString("username"));
               System.out.println(" ");

           }


        } catch (SQLException e) {

            e.printStackTrace();

        }
    }



}
