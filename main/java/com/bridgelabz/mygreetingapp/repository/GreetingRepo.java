package com.bridgelabz.mygreetingapp.repository;

import com.bridgelabz.mygreetingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepo extends JpaRepository<Greeting, Integer> {

}

