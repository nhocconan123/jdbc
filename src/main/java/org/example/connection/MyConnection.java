package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class MyConnection {
    private static final String DB_USER="sql10605522";
    private static final String BD_PASSWORD="3ZPX1VNKXx";

    private static final String DB_CONNECTION_URL="jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10605522";

//    private Connection connection=null;

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_CONNECTION_URL,DB_USER,BD_PASSWORD);

    }
}
