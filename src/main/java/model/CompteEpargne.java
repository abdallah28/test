package model;

import javax.persistence.Entity;

/**
 * @author AB_NC: La classe CompteEpargne est une classe qui hérite les
 *         attributs et méthodes de la classe Compte. nous souhaitons la
 *         persister. En plus des attributs et méthodes hérités, elle a une
 *         particularité d'avoir un attributs tauxInteret.
 *
 */
@Entity
public class CompteEpargne extends Compte {
	

	private Double tauxInteret;

	public CompteEpargne(int iDCompte, String dateDeCreation, Double solde, Double tauxInteret) {
		super(iDCompte, dateDeCreation, solde);
		this.tauxInteret = tauxInteret;
	}

	public CompteEpargne() {
		super();
	}

	@Override
	public String toString() {
		return "CompteEpargne [tauxInteret=" + tauxInteret + "]";
	}

	public Double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}


}
