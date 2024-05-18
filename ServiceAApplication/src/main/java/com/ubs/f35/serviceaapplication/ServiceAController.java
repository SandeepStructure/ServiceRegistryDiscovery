package com.ubs.f35.serviceaapplication;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Service A";
    }
}
