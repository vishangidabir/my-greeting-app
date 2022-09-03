package com.bridgelabz.mygreetingapp.entity;

import javax.persistence.*;

@Entity

public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private long id;
    private String firstName;
    private String lastName;
    private String message="Hello " +firstName +" " + lastName;



    public Greeting(long id, String firstName, String lastName, String message) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
    }

    public Greeting() {

    }

    public void setId(int id) {
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
    public String getMessage() { return message;}

    public void setMessage(String message) {this.message = message;}

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
