package com.bridgelabz.mygreetingapp.service;

import com.bridgelabz.mygreetingapp.entity.Greeting;

import java.util.Optional;

public interface IGreeting {
    public Greeting addGreeting(Greeting greets);

    public Optional<Greeting> findGreeting(int id);
}
