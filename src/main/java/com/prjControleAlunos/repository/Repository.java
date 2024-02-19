package com.prjControleAlunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prjControleAlunos.entities.Entities;

public interface Repository extends JpaRepository<Entities, Long> {

}
