package com.example.apirestv3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class ApiRestv3Application {

    @GetMapping
    public String welcome() {
        return "Welcome to APIRestv3";
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        System.out.println("username: " + principal.getName());
        return principal;
    }
    public static void main(String[] args) {
        SpringApplication.run(ApiRestv3Application.class, args);
    }

}
