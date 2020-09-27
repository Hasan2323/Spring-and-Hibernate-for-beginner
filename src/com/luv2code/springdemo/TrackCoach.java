package com.luv2code.springdemo;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/26/20 12:48 PM
 */

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

//    public TrackCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Track :: " + fortuneService.getFortune();
    }
}
