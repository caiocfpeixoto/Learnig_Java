package br.edu.ifce.code;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.model.Aluno;
import br.edu.ifce.utils.JPAUtil;


public class JpaAluno {
	public static void main(String args[]) {
		EntityManager manager = JPAUtil.getEntityManager();
		// representa a conexão com a unidade de persistencia*
		
		manager.getTransaction().begin();

		Aluno a = new Aluno();
		a.setNome("Caio Cesar");
		a.setRG("111111111111");
		a.setCPF("145.565.845.96");
		a.setCep("9574-200");
		a.setCidade("Amogus");
		a.setEndereco("sus");
		a.setBairro("sugoma");
		
		manager.persist(a);
		
		manager.getTransaction().commit();
		
		manager.close();
		
	}
}
