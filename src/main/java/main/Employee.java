package main;


public class Employee {
    String name;
    int telNumber;

    public Employee(String name, int telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }
public void setInfo(Employee employee){
        employee.getName();
        employee.getTelNumber();
}
    @Override
    public String toString() {
        return "main.MainPostgreSQLEx.Employee{" +
                "name='" + name + '\'' +
                ", telNumber=" + telNumber +
                '}';
    }
}
