package com.codehub.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {


    public static void main(String[] args) {

        //load application context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

        //retrieve bean from spring container
        Coach coach = ctx.getBean("coach", Coach.class);

        //retrieve the same bean and assign to a different object
        Coach anotherCoach = ctx.getBean("coach", Coach.class);

        //check equality
        boolean result = (coach == anotherCoach);
        System.out.println("Pointing to the same location: " + result);
        System.out.println("Object location of coach " + coach);
        System.out.println("Object location of anotherCoach " + anotherCoach);

        //retrieve bean from spring container
        Coach basketCoach = ctx.getBean("prototypeCoach", Coach.class);

        //retrieve the same bean and assign to a different object
        Coach anotherBasketCoach = ctx.getBean("prototypeCoach", Coach.class);

        //check equality
        boolean anotherResult = (basketCoach == anotherBasketCoach);
        System.out.println("Pointing to the same location: " + anotherResult);
        System.out.println("Object location of basketCoach " + basketCoach);
        System.out.println("Object location of basketCoach " + anotherBasketCoach);

        //call methods on the bean
        System.out.println(coach.performDailyWorkout());
        System.out.println(basketCoach.performDailyWorkout());

        //close
        ctx.close();


    }

}
