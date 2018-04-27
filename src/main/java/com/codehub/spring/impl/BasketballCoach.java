package com.codehub.spring.impl;

import com.codehub.spring.Coach;

public class BasketballCoach implements Coach {


    public static final String PERFORM_BASKET_BALL_30_MIN_WORKOUT = "perform BasketBall 30 min workout";

    @Override
    public String performDailyWorkout() {
        return PERFORM_BASKET_BALL_30_MIN_WORKOUT;
    }

}
