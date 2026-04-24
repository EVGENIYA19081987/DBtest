package main;


import drivers.ConnectionDriver;
import drivers.HeadDriver;

import java.sql.*;

import static drivers.ConnectionDriver.connection;
//тест
public class MainPostgreSQLEx {

    public static void main(String[] args) throws SQLException {
        Employee emp1 = new Employee("Jane", 4353);
        Employee emp2 = new Employee("Gorge", 45894);
        Employee emp3 = new Employee("Stepan", 456);
        Employee emp4 = new Employee("Irina", 876442);
        Employee emp5 = new Employee("ДГ", 98763);
        HeadDriver.setDriver();
        ConnectionDriver.openConnection();

        String str = String.format("insert into persons(lastname,telnumber) VALUES('%s',%d)",emp1.getName(),emp1.getTelNumber());
        String str2 = String.format("insert into persons(lastname,telnumber) VALUES('%s',%d)",emp2.getName(),emp2.getTelNumber());
        String str3 = String.format("insert into persons(lastname,telnumber) VALUES('%s',%d)",emp3.getName(),emp2.getTelNumber());
        String str4 = String.format("insert into persons(lastname,telnumber) VALUES('%s',%d)",emp4.getName(),emp2.getTelNumber());
        String str5 = String.format("insert into persons(lastname,telnumber) VALUES('%s',%d)",emp5.getName(),emp2.getTelNumber());
        Statement statement = connection.createStatement();
        statement.execute(str);
        statement.execute(str2);
        statement.execute(str3);
        statement.execute(str4);
        statement.execute(str5);
        ConnectionDriver.closeConnection();

    }
}

