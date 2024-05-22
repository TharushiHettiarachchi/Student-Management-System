package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MYSQL {
      
    private static Connection c;
    private static final String username = "root";
    private static final String password = "T200275701170h@";
    private static final String database = "learningms";

    public static Statement createConnection() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, username, password);
        }
        Statement s = c.createStatement();
        return s;
    }

    public static void iud(String query) {
        try {
            createConnection().executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static ResultSet search(String query) throws Exception {

        ResultSet r = createConnection().executeQuery(query);
        return r;

    }
}
