package service;

import java.util.Collection;

import dao.DaoClient;
import dao.IDao;
import model.Client;
import model.Conseiller;

/**
 * @author AB_NC: une classe services qui permet de r�aliser les m�thodes du
 *         CRUDE, Gr�ce � l'interface Idao et la classe qu'on instanci� la
 *         classe Daoclient
 *
 */
public class ServiceProxiSI {

	IDao dao = new DaoClient();

	public void postClient(Client client) {
		dao.postClient(client);
	}

	public Client getClient(Client client) {
		return dao.getClientById(client);
	}

	public Collection<Client> getAllClients(Conseiller conseiller) {
		return dao.getAllClientsByIdConseiller(conseiller);
	}

	public void putClient(Client client) {
		dao.putClient(client);
	}

	public void deleteClient(Client client) {
		dao.deleteClient(client);
	}

}
