package Atividade02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletQualOMeuNome
 */
@WebServlet("/ServletQualOMeuNome")
public class ServletQualOMeuNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletQualOMeuNome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		java.io.PrintWriter saida = response.getWriter();

		saida.write("<HTML><BODY>Qual o Meu Nome?"
				+ 
				"<p><a>http://localhost:8080/Projetinho_Fellas/ServletMeuNome<a><p></BODY></HTML>");

		saida.close();

	}

}
