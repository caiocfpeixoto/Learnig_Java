package br.edu.ifce.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tabela_professor")
public class Professor {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email_professor")
	private String email;
	
	@OneToMany
	private Collection<Turma> turma = new ArrayList<Turma>();
	
	private String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
