package com.coffee.coffeeshop.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoffeeComponent {
    @Autowired
    private String coffeeComponentMessage;

    public void printMessage() {
        System.out.println(coffeeComponentMessage);
    }
}
