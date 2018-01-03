package model;

import javax.persistence.Entity;

/**
 * @author AB_NC: La classe CompteCourant est une classe qui hérite les
 *         attributs et méthodes de la classe Compte. nous souhaitons la
 *         persister. En plus des attributs et méthodes hérités, elle a une
 *         particularité de plafondDecouvert.
 *
 */
@Entity
public class CompteCourant extends Compte {

	private Double plafondDecouvert;

	public CompteCourant(int iDCompte, String dateDeCreation, Double solde, Double plafondDecouvert) {
		super(iDCompte, dateDeCreation, solde);
		this.plafondDecouvert = plafondDecouvert;
	}

	public CompteCourant() {
		super();
	}

	public Double getPlafondDecouvert() {
		return plafondDecouvert;
	}

	public void setPlafondDecouvert(Double plafondDecouvert) {
		this.plafondDecouvert = plafondDecouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [plafondDecouvert=" + plafondDecouvert + "]";
	}

}
