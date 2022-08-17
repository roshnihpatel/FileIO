package com.sparta.rp.fileio.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

//read correct type - convert type
//Emp ID,Name Prefix,First Name,Middle Initial,Last Name,Gender,E Mail,Date of Birth,Date of Joining,Salary
public class EmployeeDTO {
    private String employeeID;
    private String namePrefix;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String gender;
    private String email;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    private Float salary;


    public EmployeeDTO(String employeeID, String namePrefix, String firstName, String middleInitial, String lastName, String gender, String email, String dateOfBirth, String dateOfJoining, String salary) {
        this.employeeID = employeeID;
        this.namePrefix = namePrefix;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dateOfBirth = LocalDate.parse(dateOfBirth,DateTimeFormatter.ofPattern("M/d/uuuu"));
        this.dateOfJoining = LocalDate.parse(dateOfJoining, DateTimeFormatter.ofPattern("M/d/uuuu"));
        this.salary = Float.valueOf(salary);
    }

    public EmployeeDTO(String[] records) {
        this.employeeID = records[0];
        this.namePrefix = records[1];
        this.firstName = records[2];
        this.middleInitial = records[3];
        this.lastName = records[4];
        this.gender = records[5];
        this.email = records[6];
        this.dateOfBirth = LocalDate.parse(records[7],DateTimeFormatter.ofPattern("M/d/uuuu"));
        this.dateOfJoining = LocalDate.parse(records[8], DateTimeFormatter.ofPattern("M/d/uuuu"));
        this.salary = Float.valueOf(records[9]);

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public Float getSalary() {
        return salary;
    }
}
