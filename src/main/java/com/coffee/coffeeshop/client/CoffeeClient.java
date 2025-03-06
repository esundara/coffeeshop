package com.coffee.coffeeshop.client;
import com.coffee.coffeeshop.dto.CoffeeDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import static org.springframework.http.MediaType.APPLICATION_JSON;

public class CoffeeClient {

    public static void main(String argv[]) {
        RestClient restClient = RestClient.create();
        String response = restClient.get()
                .uri("http://localhost:8080/v1/getCoffee")
                .retrieve()
                    .body(String.class);

        ObjectMapper objMapper = new ObjectMapper();

        try {
            CoffeeDTO cDTO = objMapper.readValue(response, CoffeeDTO.class);
            String dtoAsJson = objMapper.writeValueAsString(cDTO);
            System.out.println("JSON " + dtoAsJson);
        }catch (com.fasterxml.jackson.core.JsonProcessingException jsx) {
            System.out.println("Error Writing JSON");
        }


    }

}
