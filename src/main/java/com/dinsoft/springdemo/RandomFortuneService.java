package com.dinsoft.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by din on 04.04.17.
 */
@Component
public class RandomFortuneService implements FortuneService {
    // create array of strings
    private String[] data = {
            "Beware",
            "Diligence",
            "The journey"
    };
    // create a random number generator
    private Random random = new Random();

    public String getFortune() {
    // pick a random string from the array
        int index = random.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
