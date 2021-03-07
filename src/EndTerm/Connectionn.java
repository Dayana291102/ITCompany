package EndTerm;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionn implements IConnection{

    @Override
    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Workers", "postgres", "291102dayana");

            return connection;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
