package com.dani.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")


    public String index() {
        return "Greetings from Spring Boot!";
    }
}
