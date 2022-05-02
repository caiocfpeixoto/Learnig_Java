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
	private String aluno_nome;
	
	@Column(name="email_aluno")
	private String email_institucional;
	
	@ManyToMany
	private Collection<Turma> turma = new ArrayList<Turma>();
	
	@ManyToMany
	private Collection<Professor> prof = new ArrayList<Professor>();
	
	
	public String getAluno_nome() {
		return aluno_nome;
	}
	public void setAluno_nome(String aluno_nome) {
		this.aluno_nome = aluno_nome;
	}
	public String getEmail_institucional() {
		return email_institucional;
	}
	public void setEmail_institucional(String email_institucional) {
		this.email_institucional = email_institucional;
	}
	
}
