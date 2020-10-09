package com.luv2code.springdemo;

import java.util.Random;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/1/20 7:46 PM
 */

public class RandomFortuneServiceImpl implements FortuneService {

    private String[] fortunes = {"Good luck", "Break a leg", "Best wishes"};

    private Random random = new Random();


    @Override
    public String getFortune() {

        // easy way to find Random value within specific range
        int randomNumber = random.nextInt(fortunes.length);// 0 - (upperBound-1)

        // Find Random number within specific range USING Calculation
        // Math.random() generally return double 0.0 - 1.0
        int max = 2, min = 0;
        int randomNum = (int) (Math.random() * (max - min + 1) + min);
        return fortunes[randomNum];

    }
}
