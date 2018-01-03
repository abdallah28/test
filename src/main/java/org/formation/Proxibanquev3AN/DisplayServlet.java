package org.formation.Proxibanquev3AN;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import service.ServiceProxiSI;



/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private ServiceProxiSI servicProx=new ServiceProxiSI();
	ArrayList<Client> listC;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		final PrintWriter out = response.getWriter();
		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Hello JAVAEE</title>");
			out.println("</head>");
			out.println("<br>");
			out.println("<div align='center'>");
			out.println("<h2>Hello JAVA EE</h2>");
			out.println("entrer un message JAVA qui traversera le web, EJB tier et BDD, et retournera");
			out.println("<br><br><br>");
			out.println("<form action='WriteServlet' method='POST'>");
			out.println("<input type='submit' value='enter'>");
			out.println("<input type='text' name='put_message'> ");
			out.println("</form>");
			out.println("<br>");
			String displayMessage;

			
				ArrayList<Client> listC = servicProx.getListeClient();
				
			
			out.println("Le client est : <br><b>" + listC + "</b>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		}

		finally {
			out.close();
		}
	}
}
