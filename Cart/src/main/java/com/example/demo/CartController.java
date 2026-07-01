package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CartController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/cart")
    public String cart() {
        // calling ProductService by name (Eureka resolves it)
        String productData = restTemplate.getForObject("http://Product/products", String.class);
        return "CART SERVICE : 2 ITEMS IN CART || " + productData;
    }
}