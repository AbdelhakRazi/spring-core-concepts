package com.demo.spring.core.learning.controllers;

import com.demo.spring.core.learning.models.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
    private final Coach coach;
    @Autowired // optional if we have only one constructor
    public DemoController(@Qualifier("cricketCoach") Coach coach){
        this.coach = coach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
