package com.dinsoft.springdemo;

/**
 * Created by din on 04.04.17.
 */
public class SadFortuneService implements FortuneService {
    public String getFortune() {
        return "Today is a sad day";
    }
}
