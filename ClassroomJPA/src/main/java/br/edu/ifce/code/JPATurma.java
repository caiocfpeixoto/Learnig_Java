package br.edu.ifce.code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.model.Aluno;
import br.edu.ifce.model.Turma;
import br.edu.ifce.model.Professor;
import br.edu.ifce.utils.JPAUtils;
public class JPATurma {
	public static void main(String args[]) {
		EntityManager manager = JPAUtils.getEntityManager();
		
		manager.getTransaction().begin();
		
		Turma t= new Turma();
		t.setNome("TJW");
		t.setCodigo("123a456");
		t.setConteudo("servlets");
		
		Aluno a= new Aluno();
		a.setNome("JuJubinha");
		a.setEmail_institucional("jujubinha.com");
		
		Professor p= new Professor();
		p.setNome("Cornelli");
		p.setEmail("corneli.com");
		
		manager.persist(t);
		manager.persist(a);
		manager.persist(p);
		manager.getTransaction().commit();
		manager.close();
	}
}
