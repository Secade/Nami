package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class AccountService {
    private JDBCConnectionPool pool;

    public AccountService() {
        pool = new JDBCConnectionPool();
    }

    //adds account to the database. Must be COMPLETE information
    public boolean add(Object o) throws SQLException {
        Account a = (Account) o;

        // Get a connection:
        Connection connection = pool.checkOut();

        String query = "INSERT INTO accounts VALUE (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        try {
            statement.setString(1, a.getUsername());
            statement.setString(2, a.getPassword());
            statement.setString(3, a.getPhoneNumber());


            boolean added = statement.execute();

            return added;
        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(statement != null) statement.close();
            if(connection != null)  connection.close();
        }
        // Return the connection
        pool.checkIn(connection);
        return false;
    }


}
