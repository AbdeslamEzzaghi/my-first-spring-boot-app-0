package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coach ;

    @Value("${team.name}")
    private String team;

    @GetMapping("/")
    public String sayHello(){
        return "Hello "+coach+" of "+team;
    }

    @GetMapping("/workout")
    public String workoutDetails(){
        return coach+" told "+team+" players to run 5km in the morning";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return " Here's your candy";
    }
}
