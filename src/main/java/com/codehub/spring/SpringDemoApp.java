package com.codehub.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

    public static void main(String[] args) {

        //load application context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

        //retrieve bean from spring container - default name used
        Coach coach = ctx.getBean("soccerCoach", Coach.class);

        //call methods on the bean
        System.out.println(coach.performDailyWorkout());

        //close
        ctx.close();
    }

}
