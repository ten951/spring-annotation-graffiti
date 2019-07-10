package com.wyt.graffiti.annotation.annodrive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Darcy
 * @date 2019-07-10 11:23
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello, World";
    }
}
