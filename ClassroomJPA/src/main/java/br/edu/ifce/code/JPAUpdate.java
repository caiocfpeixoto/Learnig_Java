package br.edu.ifce.code;

import javax.persistence.EntityManager;

import br.edu.ifce.model.Aluno;
import br.edu.ifce.model.Turma;
import br.edu.ifce.utils.JPAUtils;

public class JPAUpdate {

	public static void main(String[] args) {
		EntityManager manager = JPAUtils.getEntityManager();
		Turma t = manager.find(Turma.class, 11L);
		t.setConteudo("JPA");
		manager.persist(t);
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		manager.close();

	}

}
