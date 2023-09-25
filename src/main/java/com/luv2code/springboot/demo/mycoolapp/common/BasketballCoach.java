package com.luv2code.springboot.demo.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)// default is singleton
public class BasketballCoach implements Coach{
    public BasketballCoach() {
        // print a message to test the lazy annotation
        System.out.println("In constructor :"+getClass().getSimpleName());
    }

    // init method
    @PostConstruct
    public void doMyStartUp(){
        System.out.println("In doMyStartUp() :"+getClass().getSimpleName());
    }
    // destroy method
    @PreDestroy
    public void doMyCleanUp(){
        System.out.println("In doMyCleanUp :"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice 3pts shots !!!!!";
    }
}
