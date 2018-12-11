package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.model.Empresa;

@WebServlet("/cadastrarEmpresa")
public class CadastrarEmpresa extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		Banco banco = new Banco();
		banco.adiciona(empresa);

		request.setAttribute("nomeDaEmpresa", empresa.getNome());
		RequestDispatcher rd = request.getRequestDispatcher("novaEmpresaCriada.jsp");
		rd.forward(request, response);
	}
	
	
	/*Teoricamente era pra funcionar, no entanto está descontinuado*/
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("formNovaEmpresa.html");
		requestDispatcher.forward(req, resp);
	}

}
