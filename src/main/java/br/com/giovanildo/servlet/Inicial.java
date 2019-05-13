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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		response.getWriter().println(paramAcao);
		
//		String [] tipoEEndereco = nome.split(":");
//		if(tipoEEndereco[0].equals("forward")) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
//			rd.forward(request, response);
//		} else {
//			response.sendRedirect(tipoEEndereco[1]);
//		}
//	
		
		if(paramAcao=="torneios") {
			response.getWriter().println("mostrando torneios");
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/torneios.jsp");
//			rd.forward(request, response);
		}
		
//		if(paramAcao.equals("listaEmpresas")) {
//		nome = listaEmpresas(request, response);
//		System.out.println("listando empresa");
//	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
