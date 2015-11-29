package com.example;

import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCucumberTestingApplication {

    public static void main(String[] args) {
    	ApplicationContext applicationContext = new SpringApplication(SpringCucumberTestingApplication.class).run(args);
        CamelSpringBootApplicationController applicationController =
                applicationContext.getBean(CamelSpringBootApplicationController.class);
        applicationController.blockMainThread();
    }
    
    @Bean
    public String developerName(){
    	return "Tommy Bunters";
    }
}
