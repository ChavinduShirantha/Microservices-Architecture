package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Chavindu
 * created : 11/30/2023-2:42 PM
 **/

@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @GetMapping
    public String saveOrder(){
        return "Order Get";
    }
}
