package com.microservicios.latam.microservicio02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/informacion-detalle")
public class Microservicio02Controller {

	@GetMapping
	private String obtenerInformacion() {
		return "Información detallada generada correctamente";
	}
	
}
