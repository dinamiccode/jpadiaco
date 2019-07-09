package oc.model.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf;
		EntityManager em;
		
		emf = Persistence.createEntityManagerFactory("jpadiaco");
		
		em = emf.createEntityManager();
		

	}

}
