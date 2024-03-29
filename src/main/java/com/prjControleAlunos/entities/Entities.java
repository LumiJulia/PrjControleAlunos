package com.prjControleAlunos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAluno;
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	
	public long getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(long idAluno) {
		this.idAluno = idAluno;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
