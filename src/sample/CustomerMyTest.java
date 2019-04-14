package sample;

import sample.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerMyTest {
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static  final String login = "root" ;
    private final static String password = "Awek1987fk";


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionDB connectionDB = new ConnectionDB();
        Connection conn = connectionDB.getConnection(url, login, password);

        String query = "select * from new_schema.in2_termin1";
        Statement statement = conn.createStatement();
        ResultSet set = statement.executeQuery(query);
        while (set.next()) {

            int ID = set.getInt("ID_Nummer");
            String firstName = set.getString("firstName");
            String familyName = set.getString("familyName");
            int age = set.getInt("age");

            System.out.println(ID + "\t" + firstName + "\t" + familyName + "\t" + age);
        }

        statement.close();
        conn.close();

    }
}
