package com.bridgelabz.mygreetingapp.service;

import com.bridgelabz.mygreetingapp.entity.Greeting;
import com.bridgelabz.mygreetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService implements IGreeting{
    @Autowired
    GreetingRepo greetingRepo;
    public Greeting addGreeting(Greeting greets){
        return greetingRepo.save(greets);
    }

    public Optional<Greeting> findGreeting(int id){
        return greetingRepo.findById(id);
    }

    public List<Greeting> findAllGreeting(){
        return greetingRepo.findAll();
    }

    public void deleteGreetingId(int id){
        greetingRepo.deleteById(id);
    }
}
