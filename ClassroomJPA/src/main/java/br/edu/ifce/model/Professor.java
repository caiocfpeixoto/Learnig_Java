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
	private String professor_nome;
	
	@Column(name="email_professor")
	private String email;
	
	@OneToMany
	private Collection<Turma> turma = new ArrayList<Turma>();
	
	
	public String getProfessor_nome() {
		return professor_nome;
	}
	public void setProfessor_nome(String professor_nome) {
		this.professor_nome = professor_nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Professor [id=" + id + ", nome=" + professor_nome + ", email=" + email + ", turma=" + turma + "]";
	}
	
}
