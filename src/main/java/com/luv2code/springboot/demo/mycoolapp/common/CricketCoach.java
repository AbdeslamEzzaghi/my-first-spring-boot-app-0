package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
//@Lazy to make not load until it's needed
@Component // marks the class as a spring bean
public class CricketCoach implements Coach{
    public CricketCoach() {
        //System.out.println("In constructor :"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 10 min !!!!!";
    }
}
