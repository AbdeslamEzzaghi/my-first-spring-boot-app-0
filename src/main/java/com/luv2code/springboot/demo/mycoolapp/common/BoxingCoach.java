package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach{
    public BoxingCoach() {
        System.out.println("In constructor :"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice some overhooks !!!!!";
    }

}
