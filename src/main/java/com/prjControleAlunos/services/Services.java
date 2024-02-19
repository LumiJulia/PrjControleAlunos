package com.prjControleAlunos.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prjControleAlunos.entities.Entities;
import com.prjControleAlunos.repository.Repository;

@Service
public class Services {
	private final Repository repository;
	
	@Autowired
	public Services(Repository repository) {
		this.repository=repository;
	}
	
	public Entities saveEntities(Entities entities) {
		return repository.save(entities);
    }

	public Entities getEntitiesById (Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Entities> getAllEntities(){
		return repository.findAll();
	}
	
	public void deleteEntities(Long id) {
		repository.deleteById(id);
	}
}