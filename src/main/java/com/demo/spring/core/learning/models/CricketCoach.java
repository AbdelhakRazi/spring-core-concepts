package com.demo.spring.core.learning.models;

import org.springframework.stereotype.Component;

@Component // marks the class as a spring bean
// spring bean is just a regular java class that is managed by spring
// makes it available for dependecy injection
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice for Cricket Coach";
    }
}
