package sample;

import com.mysql.fabric.jdbc.FabricMySQLConnection;
import com.mysql.fabric.jdbc.FabricMySQLDriver;
import com.mysql.jdbc.ConnectionFeatureNotAvailableException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private Connection connection;

    public ConnectionDB() throws SQLException, ClassNotFoundException {
        DriverManager.registerDriver(new FabricMySQLDriver());
       // Class.
        //Class.forName("com.mysql.jdbc.Driver");

    }

    public ConnectionDB(String url, String login, String password) {
    }

    public Connection getConnection(String url, String login, String pass) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        if (connection != null) {
            return connection;
        }
        return connection = DriverManager.getConnection(url, login, pass);
    }

}
