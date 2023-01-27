package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MensagemServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2505446593334399595L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Informe Mensagem...</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<form action=\"mensagem\" method=\"post\">");
		out.println("			<p>Digite sua Frase:</p>");
		out.println("			<p><input type=\"text\" name=\"mensagem\"></p>");
		out.println("			<p><button type=\"submit\">Enviar!</button></p>");
		out.println("		</form>");
		out.println("	</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mensagem = req.getParameter("mensagem");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println(" <meta charset=\"UTF-8\">");
		out.println("	<head>");
		out.println("		<title>Minha Mensagem</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<p> Mensagem: " + mensagem +"</p>");
		out.println("	</body>");
		out.println("</html>");
	}

	
	
}
