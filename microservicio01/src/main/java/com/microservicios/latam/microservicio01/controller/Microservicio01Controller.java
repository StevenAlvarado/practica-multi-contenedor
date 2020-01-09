package com.microservicios.latam.microservicio01.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/informacion-general")
public class Microservicio01Controller {

	@GetMapping
	private String obtenerInformacion() {
		
		RestTemplate restTemplate = new RestTemplate();
		URI uri = URI.create("http://microservicio02:8282/informacion-detalle");
		ResponseEntity<String> detalle = restTemplate.getForEntity(uri, String.class);
		
		return "Información general generada correctamente, " + detalle.getBody();
	}
}
