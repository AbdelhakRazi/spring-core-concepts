package com.demo.spring.core.learning.models;

import org.springframework.stereotype.Component;

@Component
public class VoleyballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Voleyball coach";
    }
}
