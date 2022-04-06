package com.myjava.housingrecord.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/hc_housingrecord")
@RestController
public class HealthCheckController {

	@GetMapping(value="/health")
	public ResponseEntity<String> getHealth(){
		
		String message = "-- Ping from housing record ---";
		
		log.info(message);
		
		
		return ResponseEntity.ok(message);
		
		
	}
}