package drivers;

import main.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionDriver {
    public static String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
    private static String username = "postgres";
    private static String password = "19August1987";
    public static Connection connection;

    public static void openConnection() {

        {
            {
                try {
                    connection = DriverManager.getConnection(jdbcUrl, username, password);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    if (!connection.isClosed()) {
                        System.out.println("Соединение с БД установлено");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public static void closeConnection() {
        {
            {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    if (connection.isClosed()) {
                        System.out.println("Соединение закрыто");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
