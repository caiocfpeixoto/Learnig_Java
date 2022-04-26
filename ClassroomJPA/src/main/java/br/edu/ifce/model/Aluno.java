package br.edu.ifce.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "tabela_aluno")
public class Aluno {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="nome_aluno")
	private String nome;
	
	@Column(name="email_aluno")
	private String email_institucional;
	
	@ManyToMany
	private Collection<Turma> turma = new ArrayList<Turma>();
	
	@ManyToMany
	private Collection<Professor> prof = new ArrayList<Professor>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail_institucional() {
		return email_institucional;
	}
	public void setEmail_institucional(String email_institucional) {
		this.email_institucional = email_institucional;
	}
	
}
