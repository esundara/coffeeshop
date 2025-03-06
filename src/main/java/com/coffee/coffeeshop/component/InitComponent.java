package com.coffee.coffeeshop.component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

@Component
public class InitComponent {

    @Value("${spring.datasource.url}")
    private String urlProperty;

    public void printProperty() {
        System.out.println("URL Property >  " + urlProperty);
    }

    @EventListener
    public void handleContextRefreshed(ContextRefreshedEvent event) {
        ConfigurableEnvironment env = (ConfigurableEnvironment) event.getApplicationContext().getEnvironment();
        System.out.println("DB Platform > " + env.getProperty("spring.jpa.database-platform"));
        printProperty();

    }
}