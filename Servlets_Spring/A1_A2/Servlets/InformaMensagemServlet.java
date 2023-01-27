package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InformaMensagemServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1593743863385340448L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Informe seus dados</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<form action=\"receberMensagem\">");
		out.println("			<p>Nome:</p>");
		out.println("			<p><input type=\"text\" name=\"nome\"></p>");
		out.println("			<p>Idade:</p>");
		out.println("			<p><input type=\"text\" name=\"idade\"></p>");
		out.println("			<p>Cidade:</p>");
		out.println("			<p><input type=\"text\" name=\"cidade\"></p>");
		out.println("			<p>Estado:</p>");
		out.println("			<p><input type=\"text\" name=\"estado\"></p>");
		out.println("			<p><button type=\"submit\">Enviar!</button></p>");
		out.println("		</form>");
		out.println("	</body>");
		out.println("</html>");
	}
	
	

}
