package com.spring.salute.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerData {
	
	@GetMapping("/")
	public ResponseEntity<String> Index() {
		return ResponseEntity.ok("saludos");
	}
}
