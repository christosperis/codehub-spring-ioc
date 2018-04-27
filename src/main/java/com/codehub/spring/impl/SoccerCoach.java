package com.codehub.spring.impl;

import com.codehub.spring.Coach;

public class SoccerCoach implements Coach {

    public static final String PERFORM_30_MIN_SOCCER_WORKOUT = "perform 30 min Soccer Workout";

    @Override
    public String performDailyWorkout() {
        return PERFORM_30_MIN_SOCCER_WORKOUT;
    }

    public void initMethod() {
        System.out.println("Inside Init Method");
    }

    public void destroyMethod() {
        System.out.println("Inside Destroy Method");
    }
}
