package com.bridgelabz.mygreetingapp.entity;

import javax.persistence.*;

@Entity

public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private long id;
    private String firstName;
    private String lastName;
    private String message;

    public Greeting(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = this.lastName;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

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
