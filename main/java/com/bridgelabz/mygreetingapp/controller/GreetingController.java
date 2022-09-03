package com.bridgelabz.mygreetingapp.controller;

import com.bridgelabz.mygreetingapp.entity.Greeting;
import com.bridgelabz.mygreetingapp.service.GreetingService;
import com.bridgelabz.mygreetingapp.service.IGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

    @Autowired
    IGreeting greets;

    @Autowired
    GreetingService greetingService;
//    UC1 :  http://localhost:8080/greeting?name=Vishangi
//    @GetMapping(value = {"","/","/hello"})
//    public Greeting greeting(@RequestParam(value="name", defaultValue="world") String name){
//        return new Greeting(counter.incrementAndGet(),
//                   String.format(template, name));
//    }

//    UC2 : http://localhost:8080/greeting/param/Vishangi
//    @GetMapping("/param/{name}")
//    public Greeting greetingParam(@PathVariable String name){
//        return new Greeting(counter.incrementAndGet(),
//                   String.format(template, name));
//    }

//    http://localhost:8080/greeting/post
//    @PostMapping("/post")
//    public Greeting sayHelloUc4(@RequestBody String name){
//        return new Greeting(counter.incrementAndGet(),
//                   String.format(template, name));
//    }
//
//    @PostMapping("/post")
//    public Greeting createGreeting(@RequestBody Greeting msg){
//        return greets.addGreeting(msg);
//    }

//    @PostMapping("/post")
//    public Greeting createSecGreeting(@RequestBody Greeting msg){
//        //return greetingService.addGreeting(msg);
//        return new Greeting(counter.incrementAndGet(),
//                String.format(template, msg));
//    }

//    @GetMapping("/post")
//    public Greeting sayHello(@RequestBody Greeting name) {
//        return new Greeting(counter.incrementAndGet(),
//                name.getFirstName(), name.getLastName());
//    }

    @PostMapping("/add")
    public Greeting addGreeting(@RequestBody Greeting greet){
        return greets.addGreeting(greet);
    }

    @GetMapping("/{id}")
    public Optional<Greeting> findGreeting(@PathVariable int id){
        return greets.findGreeting(id);
    }

}
