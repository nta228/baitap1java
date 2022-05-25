package fpt.aptech.t2009m1helloworld.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionHelper {
    public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/t2009m1helloworld";
    public static final  String DATABASE_USERNAME ="root";
    public static final  String DATABASE_PASSWORD ="";
    private static Connection connection;
    public static Connection getConnection(){
        try {
            if (connection == null || connection.isClosed()){
                connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
