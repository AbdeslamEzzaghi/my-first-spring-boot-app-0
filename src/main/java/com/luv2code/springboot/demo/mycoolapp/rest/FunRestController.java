package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    private Coach myCoach;
    // define a constructor for dependency injection
    @Autowired // for injections
    public FunRestController(@Qualifier("basketballCoach") Coach theCoach){
        System.out.println("In constructor :"+getClass().getSimpleName());
        myCoach = theCoach;
    }

    /*
    // this works the same way constructor injection works
    // it also works the same even tho we gave the method any name
    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }*/

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
