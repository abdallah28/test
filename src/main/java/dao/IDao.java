package dao;

import java.util.Collection;

import model.Client;
import model.Conseiller;


	
	public interface IDao {

		public void postClient(Client client);
		
		public Client getClientById(Client client);
		
		public Collection<Client> getAllClientsByIdConseiller(Conseiller conseiller);
		
		public void putClient(Client client);
		
		public void deleteClient(Client client);
		
	}
	
	
