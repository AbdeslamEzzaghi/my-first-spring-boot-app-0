package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary -- we use this one to specify that this is the component that we want to inject
@Component
public class FootballCoach implements Coach{
    public FootballCoach() {
        //System.out.println("In constructor :"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice some freekicks !!!!!";
    }
}
