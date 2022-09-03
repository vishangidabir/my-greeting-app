package com.bridgelabz.mygreetingapp.repository;

import com.bridgelabz.mygreetingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepo extends JpaRepository<Greeting, Integer> {

}

