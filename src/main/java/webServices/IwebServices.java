package webServices;

import java.util.Collection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import model.Client;

/**
 * @author Ab_NC: WebServices c'est méthodes et des annotations qui ont été
 *         ajoutés qui nous permettront de réaliser le CRUDE
 *
 */
@Produces({ "application/xml", "application/json" })
public interface IwebServices {

	@GET
	@Path("/clients/{id}/")
	Client getClient(@PathParam("id") String id);

	@GET
	@Path("/clients/")
	Collection<Client> getAllClients();

	@PUT
	@Path("/clients/")
	Response updateClient(Client client);

	@POST
	@Path("/clients/")
	Response addClients(Client client);

	@DELETE
	@Path("/clients/{id}/")
	Response deleteClients(@PathParam("id") String id);

}