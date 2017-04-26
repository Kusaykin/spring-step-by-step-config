package com.dinsoft.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by din on 03.04.17.
 */
public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(theCoach.getDeilyFortune());

        // close the context
        context.close();
    }
}
