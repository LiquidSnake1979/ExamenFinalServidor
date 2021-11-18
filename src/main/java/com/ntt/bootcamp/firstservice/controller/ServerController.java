package com.ntt.bootcamp.firstservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntt.bootcamp.firstservice.model.Persona;

@RestController
public class ServerController {

	private Persona persona = new Persona();

	@PostMapping("/setName")
	public String setName(@RequestBody String newName) {
		persona.setNombre(newName);
		return newName;
	}
	
	@PostMapping("/setApellidos")
	public String setApellidos(@RequestBody String newApellidos) {
		persona.setApellidos(newApellidos);
		return newApellidos;
	}
	
	@PostMapping("/setEdad")
	public Integer setEdad(@RequestBody Integer newEdad) {
		persona.setEdad(newEdad);
		return newEdad;
	}
	
	@GetMapping("/name")
	public ResponseEntity<String> setName() {
		persona.setNombre("Alejandro");
		return ResponseEntity.status(HttpStatus.OK).body(persona.getNombre());		
	}
	
	@GetMapping("/surname")
	public ResponseEntity<String> setApellidos() {
		persona.setApellidos("Moyano Montiel");
		return ResponseEntity.status(HttpStatus.OK).body(persona.getApellidos());
	}

	@GetMapping("/age")
	public ResponseEntity<Integer> setEdad() {
		persona.setEdad(42);
		return ResponseEntity.status(HttpStatus.OK).body(persona.getEdad());
	}

	@GetMapping("/getPersona")
	public Persona getStatus() {
		return persona;
	}
}
