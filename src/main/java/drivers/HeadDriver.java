package drivers;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HeadDriver {
    private static Driver driver;
    public static void setDriver() throws SQLException {
        driver = new org.postgresql.Driver();
        DriverManager.registerDriver(driver);
        System.out.println("Соединение с драйвером установлено");
    }
}
