package com.ubs.f35.servicecapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceCController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/call-services")
    public String callServices() {
        System.out.println("Service C");
        String serviceBResponse = restTemplate.getForObject("http://service-b/hello", String.class);
        String serviceAResponse = restTemplate.getForObject("http://service-a/hello", String.class);

        return "Service A says: " + serviceAResponse + " | Service B says: " + serviceBResponse;
    }
}