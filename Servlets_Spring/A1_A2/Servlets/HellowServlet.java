package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HellowServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5551665695003944995L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Meu Primeiro Servlet</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<p>Olá Mundo</p>");
		out.println("	</body>");
		out.println("</html>");
	}
	
	

}
