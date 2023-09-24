package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    private Coach myCoach;
    // define a constructor for dependency injection
    @Autowired // for injections
    public FunRestController(Coach theCoach){
        myCoach = theCoach;
    }
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
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return " Here's your candy";
    }



}
