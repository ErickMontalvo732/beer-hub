package com.beerhub.apigateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service
@RestController
public class ApiGatewayService {
	
	RestTemplate restTemplate;
    
    @Autowired
    public ApiGatewayService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public String getBeers() {
    	
        String url = "http://localhost:8081/api/beers";
        
        String domainMicroserviceResponse = restTemplate.getForObject(url, String.class);
        System.out.println("Response from API Gateway: " + domainMicroserviceResponse);
        return "Response from API Gateway: " + domainMicroserviceResponse;

    }

}
