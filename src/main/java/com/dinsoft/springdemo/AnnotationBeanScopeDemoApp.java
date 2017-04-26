package com.dinsoft.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by din on 04.04.17.
 */
public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they are the same
        boolean result = (theCoach == alphaCoach);

        // print out the result
        System.out.println("\nPointing to the same object: "+result);

        System.out.println("\nMemory location for theCoach"+theCoach);

        System.out.println("\nMemory location for alphaCoach"+alphaCoach+"\n");

        // close the context
        context.close();
    }
}
