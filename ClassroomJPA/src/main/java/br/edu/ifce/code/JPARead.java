package br.edu.ifce.code;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifce.model.Aluno;
import br.edu.ifce.model.Professor;
import br.edu.ifce.model.Turma;
import br.edu.ifce.utils.JPAUtils;

public class JPARead {

	public static void main(String[] args) {
		EntityManager manager = JPAUtils.getEntityManager();
		
		//get all aluno , professor and turma
		
		/*
		 * String query = "select a from Aluno a"; 
		TypedQuery<Aluno> typedQuery = manager.createQuery(query,Aluno.class);
		List<Aluno> alunoList = typedQuery.getResultList();
		for(Aluno a : alunoList ) {
			System.out.println(a);
		}
		String query2 = "select p from Professor p"; 
		TypedQuery<Professor> typedQuery2 = manager.createQuery(query2,Professor.class);
		List<Professor> profList = typedQuery2.getResultList();
		for(Professor p : profList ) {
			System.out.println(p);
		}
		String query3 = "select t from Turma t"; 
		TypedQuery<Turma> typedQuery3 = manager.createQuery(query3,Turma.class);
		List<Turma> turmaList = typedQuery3.getResultList();
		for(Turma t : turmaList ) {
			System.out.println(t);
		}
		 */
		
		
		//get aluno , professor and turma by id 
		/*
		 * 	Aluno a = manager.find(Aluno.class,1L);
			Professor p = manager.find(Professor.class,2L);
			Turma t = manager.find(Turma.class,3L);
		 * */
	
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		manager.close();

	}

}
