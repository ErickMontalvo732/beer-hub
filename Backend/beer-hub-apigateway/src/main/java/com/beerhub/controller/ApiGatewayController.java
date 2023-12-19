package com.beerhub.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beerhub.controller.service.ApiGatewayService;

@CrossOrigin
@RestController
@RequestMapping("/apigateway")
public class ApiGatewayController {
	

	private final ApiGatewayService apiGatewayService;


	@Autowired
	public ApiGatewayController(ApiGatewayService apiGatewayService) {
		this.apiGatewayService = apiGatewayService;
	}

	@GetMapping("/beers")
	public ResponseEntity<?> getBeers() {
		Map<String, Object> response = new HashMap();
		
		System.out.println("LLEGO A GETBEERS");
		apiGatewayService.getBeers();
		return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
	}

}
