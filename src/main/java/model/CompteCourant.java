package model;

import javax.persistence.Entity;

/**
 * @author AB_NC: La classe CompteCourant est une classe qui h�rite les
 *         attributs et m�thodes de la classe Compte. nous souhaitons la
 *         persister. En plus des attributs et m�thodes h�rit�s, elle a une
 *         particularit� de plafondDecouvert.
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
