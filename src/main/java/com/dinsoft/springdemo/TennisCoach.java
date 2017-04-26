package com.dinsoft.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by din on 03.04.17.
 */
@Component()
//@Scope("prototype")
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define my init method
    @PostConstruct
    public void  doMyStartupStuff(){
        System.out.println(">> TennisCoach: inside of doMyStartupStuff() method");
    }

    // define my destroy method
    @PreDestroy
    public void  doMyCleanupStuff(){
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff() method");
    }

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }*/

    public String getDailyWorkout() {
        return "\nPractice your backhard volley";
    }

    public String getDeilyFortune() {
        return fortuneService.getFortune();
    }

}
