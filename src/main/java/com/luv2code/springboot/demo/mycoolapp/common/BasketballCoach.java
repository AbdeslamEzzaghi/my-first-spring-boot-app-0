package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
    public BasketballCoach() {
        System.out.println("In constructor :"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 3pts shots !!!!!";
    }
}
