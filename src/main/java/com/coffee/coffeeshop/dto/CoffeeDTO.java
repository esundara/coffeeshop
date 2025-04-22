package com.coffee.coffeeshop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CoffeeDTO {
    String color;
    String price;
    String type;
    CoffeeMetadataDTO coffeeMetaData;

}
