package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/26/20 9:16 PM
 */

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        Coach myCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

        // print literal values
        TrackCoach trackCoach = context.getBean("myCoach", TrackCoach.class);
        System.out.println(trackCoach.getEmail());
        System.out.println(trackCoach.getTeamName());

        // close the context
        context.close();
    }
}
