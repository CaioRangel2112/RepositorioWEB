package TrabalhocomSessões;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static final String USUARIO = "usuario";
    public static final String SENHA = "senha";
    public static final String SOBRENOME = "sobrenome";
    public static final String RUA = "rua";
    public static final String COMPLEMENTO = "complemento";
    public static final String CIDADE = "cidade";
    public static final String CEP = "cep";
    public static final String ESTADO = "estado";
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html><body>");
		
		String nomeUsuario = request.getParameter(USUARIO);
		String senhaUsuario = request.getParameter(SENHA);
		String sobrenomeUsuario = request.getParameter(SOBRENOME);
		String ruaUsuario = request.getParameter(RUA);
		String complementoUsuario = request.getParameter(COMPLEMENTO);
		String cidadeUsuario = request.getParameter(CIDADE);
		String cepUsuario = request.getParameter(CEP);
		String estadoUsuario = request.getParameter(ESTADO);
		
		if (autentica(nomeUsuario,senhaUsuario, sobrenomeUsuario, ruaUsuario, complementoUsuario, cidadeUsuario, cepUsuario, estadoUsuario)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, nomeUsuario);
			sessao.setAttribute(SOBRENOME, sobrenomeUsuario);
			sessao.setAttribute(RUA, ruaUsuario);
			sessao.setAttribute(COMPLEMENTO, complementoUsuario);
			sessao.setAttribute(CIDADE, cidadeUsuario);
			sessao.setAttribute(CEP, cepUsuario);
			sessao.setAttribute(ESTADO, estadoUsuario);

			
			resposta.write("Bem vindo " + nomeUsuario + " " + sobrenomeUsuario + " Seu endereço é: "+ "Rua nº: " + ruaUsuario + " Complemento:  " + complementoUsuario + " Cidade: " + cidadeUsuario +" CEP: " + cepUsuario + " Estado: " + estadoUsuario);
		} else {
			resposta.write("Nome de usuário e senha inválidos.");
		}
		
		resposta.write("</body></html>");
	}

	private boolean autentica(String usuario, String senha, String sobrenome, String rua, String complemento, String cidade, String cep, String estado) {
		if (!usuario.equals("") && usuario != null && senha != null && senha.equals("1234") && !sobrenome.equals("")&& !rua.equals("")&& !complemento.equals("")&& !cidade.equals("")&& !cep.equals("")&& !estado.equals("")) {
			return true;
		}
		
		return false;
	}

}