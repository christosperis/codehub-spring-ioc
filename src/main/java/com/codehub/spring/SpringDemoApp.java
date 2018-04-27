package com.codehub.spring;

import com.codehub.spring.config.SportsConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoApp {

    public static void main(String[] args) {

        //load application context
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SportsConfig.class);

        //retrieve bean from spring container - default name used
        Coach coach = ctx.getBean("soccerCoach", Coach.class);

        //call methods on the bean
        System.out.println(coach.performDailyWorkout());

        //close
        ctx.close();
    }

}
