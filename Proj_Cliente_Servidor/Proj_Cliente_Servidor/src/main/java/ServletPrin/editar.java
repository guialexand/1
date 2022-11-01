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
@WebServlet("/editar")
public class editar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public editar() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conexao = null;
		PreparedStatement PreSta = null;
		int rowsAffected = 0;
		try 
		{
			conexao = BD.getConnection();
			if(request.getParameter("EDidlivro") == "" || request.getParameter("EDtitu") == "" ||  request.getParameter("EDaut") == "" || request.getParameter("EDcateg") == "" || request.getParameter("EDval") == "") 
			{
				PrintWriter out = response.getWriter();response.setContentType("text/html");
			    out.println("<!DOCTYPE html>");
			    out.println("<html>");
			    out.println("<head>");
			    out.println("<meta charset=\"utf-8\">");
			    out.println("<title>EDITAR</title>");
			    out.println("<style type=\"text/css\"> p{ text-align:center; color: white; font-size: 25px;}  body{margin: 0;}.Header{background-color: #01386e;height:110px;padding-top: 5px;}.tit{font-size: 25px;margin-top: ;margin-left: 10px;display:inline-block;color: white;}.ops{margin-top: 27px;float:right;display:inline-block;margin-right:10px;}.fundo{height: 500px;background-image: url(\"c.jpg\");background-repeat: no-repeat;background-position: center center;}.button{padding: 5px;}form{color: white;text-align: center; margin-top: -30px;}label{font-size: 20px;display:inline-block;font-size: 15px;margin: 10px;}select{display:inline-block;}input{display:inline-block;}</style>");
			    out.println("</head>");
			    out.println("<body>");
			    out.println("<div class='Header'>");
			    out.println("<p>Digite todos os dados do livro para alterar!<p>");
			    out.println("<form action='index.jsp'><br>	<input class='btn' type='submit' value='VOLTAR'> </form>");
			    out.println("</div>");
			    out.println("<div class='fundo'>");
			    out.println("</div>");
			    out.println("</body>");
			    out.println("</html>");	
			}else 
			{
			int EDidlivro = Integer.parseInt(request.getParameter("EDidlivro"));
			String EDtitu = request.getParameter("EDtitu");
			String EDaut =request.getParameter("EDaut");
			String EDcateg =request.getParameter("EDcateg");
			float EDval = Float.parseFloat(request.getParameter("EDval"));
			PreSta = conexao.prepareStatement("UPDATE `bdlivraria`.`tblivros` SET `titulo` = ?, `autor` = ?, `categoria` = ?, `valor` = ? WHERE (`codlivro` = ?)");
			PreSta.setString(1, EDtitu);
			PreSta.setString(2, EDaut);
			PreSta.setString(3, EDcateg);
			PreSta.setFloat(4, EDval);
			PreSta.setInt(5, EDidlivro);
			rowsAffected = PreSta.executeUpdate();
			PrintWriter out = response.getWriter(); response.setContentType("text/html");
		    out.println("<!DOCTYPE html>");
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<meta charset=\"utf-8\">");
		    out.println("<title>EDITAR</title>");
		    out.println("<style type=\"text/css\"> p{ text-align:center; color: white; font-size: 25px;}  body{margin: 0;}.Header{background-color: #01386e;height:110px;padding-top: 5px;}.tit{font-size: 25px;margin-top: ;margin-left: 10px;display:inline-block;color: white;}.ops{margin-top: 27px;float:right;display:inline-block;margin-right:10px;}.fundo{height: 500px;background-image: url(\"c.jpg\");background-repeat: no-repeat;background-position: center center;}.button{padding: 5px;}form{color: white;text-align: center; margin-top: -30px;}label{font-size: 20px;display:inline-block;font-size: 15px;margin: 10px;}select{display:inline-block;}input{display:inline-block;}</style>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println("<div class='Header'>");
		    out.println("<p>LIVRO ALTERADO COM SUCESSO!</p>");
		    out.println("<form action='index.jsp'><br>	<input class='btn' type='submit' value='VOLTAR'> </form>");
		    out.println("</div>");
		    out.println("<div class='fundo'>");
		    out.println("</div>");
		    out.println("</body>");
		    out.println("</html>");		
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		}

}
