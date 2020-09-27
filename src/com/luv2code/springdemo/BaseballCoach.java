package com.luv2code.springdemo;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/26/20 12:11 PM
 */

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return "Baseball :: " + fortuneService.getFortune();
    }

}
