package com.example.codeclan.employeeservice.models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long ID;

    @Column(name = "name")
    private String Name;

    @Column(name = "age")
    private int Age;

    @Column(name = "employee_number")
    private long EmployeeNumber;

    @Column(name = "email")
    private String email;

    public Employee(String name, int age, long employeeNumber, String email){
        Name = name;
        Age = age;
        EmployeeNumber = employeeNumber;
        this.email = email;
    }

    public Employee() {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public long getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(long employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
