package com.dinsoft.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by din on 04.04.17.
 */
@Component
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
