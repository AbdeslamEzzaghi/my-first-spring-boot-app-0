package com.luv2code.springboot.demo.mycoolapp.common;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor :"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return " practice some deep diving !!!!!!!";
    }
}
