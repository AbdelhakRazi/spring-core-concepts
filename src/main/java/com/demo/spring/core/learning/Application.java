package com.demo.spring.core.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication(
        scanBasePackages = {"com.component.scanning",
        "com.demo.spring.core.learning"} // give packages for spring boot to scan
)
// this annotation is using : @SpringBootConfiguration // to be able to register extra beans
//@EnableAutoConfiguration
//@ComponentScan
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        for (String c : run.getBeanDefinitionNames()) {
            System.out.println(c);
        }
    }
	// Use constructor dependency injection when possible as it is first option for spring team
	// use setter methods dependency injection when you have optional dependencies
	// Spring Auto Wiring: spring looks for a class and inject it by class type or interface
	// Spring look for @Component and inject the correct one that implements interface we're looking
	// for

}
