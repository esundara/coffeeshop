package com.coffee.coffeeshop.controller;

import com.coffee.coffeeshop.dto.CoffeeDTO;
import com.coffee.coffeeshop.dto.CoffeeMetadataDTO;
import com.coffee.coffeeshop.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

	@Autowired
	CoffeeService service;

	@GetMapping("/v1/start")
	public String index() {
		service.doSomething();
		return "started";

	}
	@GetMapping("/v1/getCoffee")
	public ResponseEntity<CoffeeDTO> getCoffee() {
		CoffeeDTO cDTO = service.getCoffee();
		cDTO.setColor("BLACK");
		cDTO.setPrice("5.99");
		CoffeeMetadataDTO coffeeMetadata = new CoffeeMetadataDTO();
		coffeeMetadata.setCity("Ashburn");
		coffeeMetadata.setShop("Claiborne");
		cDTO.setCoffeeMetaData(coffeeMetadata);

		return ResponseEntity.ok(cDTO);

	}
}
