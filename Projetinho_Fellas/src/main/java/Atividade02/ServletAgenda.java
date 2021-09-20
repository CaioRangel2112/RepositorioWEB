package Atividade02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		java.io.PrintWriter saida = response.getWriter();

		saida.write("<HTML><BODY>Agenda"
				+ 
				""
				+ "<p>Nome:Caio Rangel<p>"
				+ ""
				+ "<p>Telefone:(61)9912345678<p>"
				+ ""
				+ "<p>Nascimento:21/12/2001<p></BODY></HTML>");

		saida.close();

	}

}

