package br.edu.ifce.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("Class");
	// O método getEntityManager() da classe JPAUtil retorna uma instância do EntityManager.
	public static EntityManager getEntityManager() {
		
		return factory.createEntityManager();
	}
}
