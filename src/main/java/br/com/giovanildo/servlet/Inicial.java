package br.com.giovanildo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Inicial
 */
public class Inicial extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");

		if (paramAcao.equals("torneios")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/torneios.jsp");
			rd.forward(request, response);
		}
		if (paramAcao.equals("partidas")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/partidas.jsp");
			rd.forward(request, response);
		}
		if (paramAcao.equals("cadastroClubes")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/cadastroClubes.jsp");
			rd.forward(request, response);
		}
		if (paramAcao.equals("listaClubes")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/listaClubes.jsp");
			rd.forward(request, response);
		}
		if (paramAcao.equals("cadastroEAtleta")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/CadastroEAtleta.jsp");
			rd.forward(request, response);
		}
		if (paramAcao.equals("mostraClube")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/mostraClube.jsp");
			rd.forward(request, response);
		}
		if (paramAcao.equals("removeClube")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/cadastroTimes.jsp");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
