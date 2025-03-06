package com.coffee.coffeeshop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yml")
public class AppConfig {

    @Value("${app.message}")
    private String applicationMessage;

    @Bean
    public String applicationMessage() {
        return applicationMessage;
    }

    @Bean
    public Coffee getCoffeeComp() {
        return new Coffee();
    }

}
