package com.codehub.spring.impl;

import com.codehub.spring.Coach;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Component("soccerCoach")
public class SoccerCoach implements Coach, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean{

    public static final String PERFORM_30_MIN_SOCCER_WORKOUT = "perform 30 min Soccer Workout";

    @Override
    public String performDailyWorkout() {
        return PERFORM_30_MIN_SOCCER_WORKOUT;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Inside Init Method annotated with PostConstruct");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Inside Destroy Method annotated with PreDestroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### Demo Bean has its properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("### Demo Bean has been destroyed");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("### Demo Bean name is " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### Demo Bean Factory has been set ");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("### Demo Bean display name is" + applicationContext.getDisplayName());
    }

    public void beforeInit() {
        System.out.println("### Before Init called by BeanPostProcessor");
    }

    public void afterInit() {
        System.out.println("### After Init called by BeanPostProcessor");
    }
}
