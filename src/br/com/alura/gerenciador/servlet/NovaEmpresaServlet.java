package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Deu certo!");
		
		String nome = request.getParameter("nome");
		
		response.getWriter()
				.println("" + 
						"<html>" + 
						"<body>" + 
						"<p>Empresa " + nome + " cadastrada com sucesso!</p>" + 
						"</body>" + 
						"</html>"
						);
	}

}
