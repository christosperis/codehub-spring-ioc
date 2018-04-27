package com.codehub.spring.config;

import com.codehub.spring.Coach;
import com.codehub.spring.impl.BasketballCoach;
import com.codehub.spring.impl.SoccerCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

    @Bean
    public Coach soccerCoach() {
        return new SoccerCoach();
    }

    @Bean
    public Coach basketballCoach() {
        return new BasketballCoach();
    }

}
