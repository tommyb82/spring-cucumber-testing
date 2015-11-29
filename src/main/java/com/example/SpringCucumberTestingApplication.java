package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCucumberTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCucumberTestingApplication.class, args);
    }
    
    @Bean
    public String developerName(){
    	return "Tommy Bunters";
    }
}
