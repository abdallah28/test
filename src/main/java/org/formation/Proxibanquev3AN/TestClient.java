package org.formation.Proxibanquev3AN;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Client;
import model.Conseiller;

public class TestClient {

	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		
		try {
			txn.begin();
			
			Conseiller cons1 = new Conseiller("Einstein", "Albert" );
			Conseiller cons2 = new Conseiller("Lee", "Bruce");
			
			
			Client cli1 = new Client("Simpson", "Bart", cons1);
			Client cli2 = new Client("Skywalker", "Luke", cons2);
			
			cons1.getListClient().add(cli1);
			cons2.getListClient().add(cli2);
			
			em.persist(cons1);
			em.persist(cons2);
			
			txn.commit();
			
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if(em != null) { em.close(); }
		}
		
	}
}
