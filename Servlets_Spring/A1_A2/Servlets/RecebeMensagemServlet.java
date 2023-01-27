package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RecebeMensagemServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2938125702736911919L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String cidade = request.getParameter("cidade");
		String uf = request.getParameter("estado");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Minha Mensagem</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<p> Nome: " + nome +"</p>");
		out.println("		<p> Idade: " + idade +"</p>");
		out.println("		<p> Cidade: " + cidade +"</p>");
		out.println("		<p> Estado: " + uf +"</p>");
		out.println("	</body>");
		out.println("</html>");
	}

	
	
}
