package br.edu.ifce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tabela_turma")
public class Turma {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="conteudo")
	private String conteudo;
	
	private String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public String toString() {
		return "Turma [id=" + id + ", nome=" + nome + ", codigo=" + codigo + ", conteudo=" + conteudo + "]";
	}
	
	
}
