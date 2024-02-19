package com.prjControleAlunos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.prjControleAlunos.entities.Entities;
import com.prjControleAlunos.services.Services;

public class Controller {
	private final Services services;
	
	@Autowired
	public Controller(Services services) {
		this.services = services;
	}
	
	@PostMapping
	public Entities createEntities(@RequestBody Entities entities) {
		return services.saveEntities(entities);
	}
	
	@GetMapping("/{id}")
	public Entities getEntities(@PathVariable Long id) {
		return services.getEntitiesById(id);
	}
	
	@GetMapping
	public List<Entities> getAllEntities(){
		return services.getAllEntities();
	}
	
	@PutMapping("/{id}")
    public Entities<Entities> updateEntities(@PathVariable Long id, @RequestBody Entities entities) {
        Optional<Entities> updatedEntities = Optional.ofNullable(services.updateEntities(id, entities));
        return updatedEntities.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
	@DeleteMapping("/{id}")
	public void deleteEntities(@PathVariable Long id) {
		services.deleteEntities(id);
	}
}
