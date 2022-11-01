package ServletPrin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bd.BD;
@WebServlet("/cadastrar")
public class cadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public cadastrar() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conexao = null;
		PreparedStatement PreSta = null;		
		try 
		{
			int idlivro = Integer.parseInt(request.getParameter("idlivro"));
			String titu =request.getParameter("titu");
			String aut =request.getParameter("aut");
			String categ =request.getParameter("categ");
			float val = Float.parseFloat(request.getParameter("val"));
			conexao = BD.getConnection();
			PreSta= conexao.prepareStatement("Insert into tblivros (codlivro, titulo, autor, categoria, valor) values (?,?,?,?,?)");
			PreSta.setInt(1, idlivro);
			PreSta.setString(2, titu);
			PreSta.setString(3, aut);
			PreSta.setString(4, categ);
			PreSta.setFloat(5, val);
			PreSta.executeUpdate();
		}catch(SQLException e)
		{e.printStackTrace();
			
		}catch (ClassNotFoundException e)
		{e.printStackTrace();
		}
		PrintWriter out = response.getWriter();response.setContentType("text/html");
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"utf-8\">");
	    out.println("<title>CADASTRAR</title>");
	    out.println("<style type=\"text/css\"> p{ text-align:center; color: white; font-size: 25px;}  body{margin: 0;}.Header{background-color: #01386e;height:110px;padding-top: 5px;}.tit{font-size: 25px;margin-top: ;margin-left: 10px;display:inline-block;color: white;}.ops{margin-top: 27px;float:right;display:inline-block;margin-right:10px;}.fundo{height: 500px;background-image: url(\"c.jpg\");background-repeat: no-repeat;background-position: center center;}.button{padding: 5px;}form{color: white;text-align: center; margin-top: -30px;}label{font-size: 20px;display:inline-block;font-size: 15px;margin: 10px;}select{display:inline-block;}input{display:inline-block;}</style>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<div class='Header'>");
	    out.println("<p>LIVRO CADASTRADO!</p>");
	    out.println("<form action='index.jsp'><br>	<input class='btn' type='submit' value='VOLTAR'> </form>");
	    out.println("</div>");
	    out.println("<div class='fundo'>");
	    out.println("</div>");
	    
	    out.println("</body>");
	    out.println("</html>");	
	}

}
