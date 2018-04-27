package com.codehub.spring.packageProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.codehub.spring.impl.SoccerCoach;

@Component
public class CoachBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {

        if (o instanceof SoccerCoach) {
            ((SoccerCoach) o).beforeInit();
        }

        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {

        if (o instanceof SoccerCoach) {
            ((SoccerCoach) o).afterInit();
        }

        return o;
    }
}
