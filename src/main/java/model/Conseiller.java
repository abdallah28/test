package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author AB_NC: La classe conseiller est une classe qui regroupe tout les
 *         attributs et méthodes de nos conseillers. Elle contient différentes
 *         méthodes. et a une relation OneToMany. car un conseiller peut avoir
 *         plusieurs clients
 *
 */
@Entity
public class Conseiller {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConseiller;
	private String nomConseiller;
	private String prenomConseiller;

	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.PERSIST })
	private Collection<Client> listClient = new ArrayList<>();

	public Conseiller() {
		super();
	}

	public Conseiller(String nomConseiller, String prenomConseiller) {
		super();
		this.nomConseiller = nomConseiller;
		this.prenomConseiller = prenomConseiller;

	}

	public Long getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(Long idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getNomConseiller() {
		return nomConseiller;
	}

	public void setNomConseiller(String nomConseiller) {
		this.nomConseiller = nomConseiller;
	}

	public String getPrenomConseiller() {
		return prenomConseiller;
	}

	public void setPrenomConseiller(String prenomConseiller) {
		this.prenomConseiller = prenomConseiller;
	}

	public Collection<Client> getListClient() {
		return listClient;
	}

	public void setListClient(Collection<Client> listClient) {
		this.listClient = listClient;
	}

	public void addClient(Client client) {
		listClient.add(client);
		client.setConseiller(this);

	}

}
