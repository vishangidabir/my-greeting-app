package com.bridgelabz.mygreetingapp.entity;

public class Greeting {
    private long id;
    private String firstName;
    private String lastName;
    private String message;

    public Greeting(long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
    }

    public long getId() {
        return id;
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
    
}
