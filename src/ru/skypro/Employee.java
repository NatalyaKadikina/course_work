package ru.skypro;

public class Employee {
    private String firstName;
    private String lastName;
    private String patronymic;
    private int id;
    private int departmentNumber;
    private int salary;

    public Employee (int id, String lastName, String firstName, String patronymic, int departmentNumber, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public int getDepartmentNumber() {
        return departmentNumber;
    }
    public int getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    @Override
    public String toString() {
        return id + ":" + lastName + ":" + lastName + ":" + departmentNumber + ":" + salary;
    }
}
