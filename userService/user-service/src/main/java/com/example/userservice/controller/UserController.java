package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Chavindu
 * created : 11/30/2023-2:45 PM
 **/

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String saveUser() {
//        return "User Get";
        return restTemplate.getForObject("http://localhost:8082/api/v1/order", String.class);

    }
}

