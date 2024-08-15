package com.alibou.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@Configuration
public class ApplicationConfig {
    @Bean
    @Qualifier("bean1")
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("First bean");
    }

    @Bean
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("second bean");
    }

    @Bean
    public MyFirstClass myThirdBean(){
        return new MyFirstClass("Third bean");
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
