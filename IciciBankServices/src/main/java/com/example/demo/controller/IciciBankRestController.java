package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IciciBankRestController {

    @GetMapping("/icici/processPayment")
    public String processPayment() {
        return "Payment processed by ICICI BANK SERVICE";
    }
}