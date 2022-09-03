package com.bridgelabz.mygreetingapp.service;

import com.bridgelabz.mygreetingapp.entity.Greeting;
import com.bridgelabz.mygreetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreeting{
    @Autowired
    GreetingRepo greetingRepo;
    public Greeting addGreeting(Greeting greets){
        return greetingRepo.save(greets);
    }


}
