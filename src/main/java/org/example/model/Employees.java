package org.example.model;

public class Employees {
    private int Id;
    private String fullName;
    private String City;
    private String Phone;
    private int gender;
    private int salary;
    private String email;


    public Employees() {
    }

    public Employees(String fullName, String city, String phone, int gender, int salary, String email) {
        this.fullName = fullName;
        City = city;
        Phone = phone;
        this.gender = gender;
        this.salary = salary;
        this.email = email;
    }

    public Employees(int id, String fullName, String city, String phone, int gender, int salary, String email) {
        Id = id;
        this.fullName = fullName;
        City = city;
        Phone = phone;
        this.gender = gender;
        this.salary = salary;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "Id=" + Id +
                ", fullName='" + fullName + '\'' +
                ", City='" + City + '\'' +
                ", Phone='" + Phone + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}
