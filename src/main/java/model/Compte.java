package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author AB_NC: La classe abstract Compte est une classe qui ne peut être
 *         instanciée. Elle contient les informations des différents comptes et
 *         qui ont été factorisés dnas cette classe. c'est la classe mére des
 *         CompteEpargne et de Comptecourant
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int iDCompte;
	private String dateDeCreation;
	private Double solde;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	public Compte(int iDCompte, String dateDeCreation, Double solde) {
		super();
		this.iDCompte = iDCompte;
		this.dateDeCreation = dateDeCreation;
		this.solde = solde;
	}

	public Compte() {
		// TODO Auto-generated constructor stub
	}

	public int getiDCompte() {
		return iDCompte;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setiDCompte(int iDCompte) {
		this.iDCompte = iDCompte;
	}

	public String getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [iDCompte=" + iDCompte + ", dateDeCreation=" + dateDeCreation + ", solde=" + solde + "]";
	}

}