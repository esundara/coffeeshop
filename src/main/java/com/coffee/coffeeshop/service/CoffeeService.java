package com.coffee.coffeeshop.service;

import com.coffee.coffeeshop.config.Coffee;
import com.coffee.coffeeshop.dto.CoffeeDTO;
import com.coffee.coffeeshop.dto.CoffeeMetadataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    @Autowired
    private Coffee getCoffeeComp;

    public void doSomething() {
        String c = getCoffeeComp.getCoffee();
        System.out.println("I Got My Coffee + "+ c);
    }

    public CoffeeDTO getCoffee() {

        CoffeeDTO cDTO = new CoffeeDTO();
        cDTO.setColor("BLACK");
        cDTO.setPrice("5.99");
        cDTO.setType("Capuccino");
        CoffeeMetadataDTO coffeeMetadata = new CoffeeMetadataDTO();
        coffeeMetadata.setCity("Ashburn");
        coffeeMetadata.setShop("Claiborne");
        cDTO.setCoffeeMetaData(coffeeMetadata);
        return cDTO;

    }
}
