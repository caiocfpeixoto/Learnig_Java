package br.edu.ifce.code;

import javax.persistence.EntityManager;

import br.edu.ifce.model.Aluno;
import br.edu.ifce.model.Professor;
import br.edu.ifce.model.Turma;
import br.edu.ifce.utils.JPAUtils;

public class JPADelete {
	public static void main(String args[]) {
		EntityManager manager = JPAUtils.getEntityManager();
		Aluno a = manager.getReference(Aluno.class, 12L);
		Turma t = manager.getReference(Turma.class, 11L);
		Professor p=manager.getReference(Professor.class, 13L);
		/*
		 * O método find recupera os dados desejados imediatamente 
		 * Já o método getReference posterga a tarefa até a primeira chamada
		 * de um método get no objeto desejado. 
		 * */
		manager.remove(a);
		manager.remove(t);
		manager.remove(p);
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		manager.close();
	}
}

