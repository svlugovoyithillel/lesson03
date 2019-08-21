package com.ithillel;

public class Runner {

    public static void main(String[] args) {

        Employee e1 = new Driver();
        Driver d1 = new Driver();
        Employee e2 = new Employee();

        e1.work();
        d1.work();
        e2.work();



    }
}

class Employee {
    private Long id;
    private String firstName;
    private String lastName;


    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void hello() {
        System.out.println("Hello, my full name is  " + fullName());
    }

    void work(){
        System.out.println("Working....");
    }

    private String fullName() {
        return this.firstName + " " + this.lastName;
    }
}

class Driver extends Employee {

    private String driverLicence;

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    @Override
    void work() {
        System.out.println("Driving....");
    }
}

class Programmer extends Employee {

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    void work() {
        System.out.println("Programming....");
    }
}