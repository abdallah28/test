package org.formation.Proxibanquev3AN;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Client;
import model.Compte;
import model.CompteCourant;
import model.CompteEpargne;
import service.ServiceProxiSI;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		
		System.out.println("Hello World!");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager(); // idem session en HIBERNATE
		EntityTransaction txn = em.getTransaction();
		// BigDecimal solde2=100.0;
		ArrayList<Client> listC=new ArrayList<>();
		CompteCourant c1 = new CompteCourant();
		CompteEpargne c2 = new CompteEpargne();

		c1.setSolde(101.1);
		c2.setSolde(202.2);
		System.out.println("solde : " + c1.getSolde());
		Client cl1 = new Client();
		Client cl2 = new Client();
		cl1.setNomClient("bob");
		cl2.setNomClient("john");
		cl1.addCompte(c1);
		cl1.addCompte(c2);
		System.out.println(cl1);
		System.out.println(c1);
		System.out.println(c2);

		try {

			txn.begin();
			em.persist(cl1);
			TypedQuery<Client> query = em.createQuery("from Client", Client.class); // !! nom des CLASSES
			List cls = query.getResultList();
			System.out.println(cls);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		ServiceProxiSI s = new ServiceProxiSI();
//		listC=s.getListeClient();

	}



	public static void init() {
		// Compte c1 = new CompteCourant();
		// Compte c2 = new CompteEpargne();
		// c1.setSolde(100.0);
		// c1.setSolde(200.0);
		// Client cl1 = new Client();
		// Client cl2 = new Client();
		// cl1.setNomClient("bob");
		// cl2.setNomClient("john");
		// System.out.println(c1);
	}
}
