package com.absattarov.eSchool.models;

import java.time.LocalDate;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private String phoneNumber;

    public Student() {
    }

    public Student(String firstname, String lastname, LocalDate birthDate,String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
