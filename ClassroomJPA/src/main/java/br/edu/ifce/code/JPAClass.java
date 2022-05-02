package br.edu.ifce.code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.model.Aluno;
import br.edu.ifce.model.Turma;
import br.edu.ifce.model.Professor;
import br.edu.ifce.utils.JPAUtils;
public class JPAClass {
	public static void main(String args[]) {
		EntityManager manager = JPAUtils.getEntityManager();
		
		manager.getTransaction().begin();
		
		
		
		Aluno a= new Aluno();
		a.setAluno_nome("JuJubinha");
		a.setEmail_institucional("jujubinha.com");
		Aluno a2= new Aluno();
		a2.setAluno_nome("bibi");
		a2.setEmail_institucional("binha.com");
		Aluno a3= new Aluno();
		a3.setAluno_nome("Junha");
		a3.setEmail_institucional("junha.com");
		
		Professor p= new Professor();
		p.setProfessor_nome("Cornelli");
		p.setEmail("corneli.com");
		
		Turma t= new Turma();
		t.setNome("TJW");
		t.setCodigo("123a456");
		t.setConteudo("servlets");

		manager.persist(t);
		manager.persist(a);
		manager.persist(a2);
		manager.persist(a3);
		manager.persist(p);
		manager.getTransaction().commit();
		manager.close();
	}
}
