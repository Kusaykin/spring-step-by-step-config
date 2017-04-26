package com.dinsoft.springdemo;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by din on 04.04.17.
 */
public class SwimCoach implements Coach{
    private FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;


    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public String getDeilyFortune() {
        return fortuneService.getFortune();
    }
}
