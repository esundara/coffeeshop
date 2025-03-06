package com.coffee.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class CoffeeshopApplication {


	public static void main(String[] args) {

		SpringApplication.run(CoffeeshopApplication.class, args);

	}

}
