package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/28/20 1:27 AM
 */

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach myBaseballCoach = context.getBean("myBaseballCoach", Coach.class);

        // call methods on the bean
        System.out.println(myBaseballCoach.getDailyWorkout());
        System.out.println(myBaseballCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
