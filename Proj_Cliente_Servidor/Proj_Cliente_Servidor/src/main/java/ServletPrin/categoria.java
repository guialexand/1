package ServletPrin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.BD;

@WebServlet("/categoria")
public class categoria extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public categoria() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conexao=null;
		ResultSet reS=null;
		Statement Sta=null;
		List<String> dados=new ArrayList<>();
		try 
		{
			String cate =request.getParameter("catego");
			conexao = BD.getConnection();
			Sta=conexao.createStatement();
			if(cate.equals("Arquitetura"))
			{
				reS=Sta.executeQuery("SELECT titulo FROM tblivros WHERE categoria LIKE 'arquitetura'");
			}else if(cate.equals("Desgin"))
			{
				reS=Sta.executeQuery("SELECT titulo FROM tblivros WHERE categoria LIKE 'Desgin'");

			}else if(cate.equals("Inf"))
			{
				reS=Sta.executeQuery("SELECT titulo FROM tblivros WHERE categoria LIKE 'Informática'");

			}else if(cate.equals("Lbr" ))
			{
				reS=Sta.executeQuery("SELECT titulo FROM tblivros WHERE categoria LIKE 'Literatura brasileira'");

			}else if(cate.equals("Lti"))
			{
				reS=Sta.executeQuery("SELECT titulo FROM tblivros WHERE categoria LIKE 'Literatura infantil'");

			}else if(cate.equals("Ltun"))
			{
				reS=Sta.executeQuery("SELECT titulo FROM tblivros WHERE categoria LIKE 'Literatura universal'");

			}else if(cate.equals("Msa"))
			{
				reS=Sta.executeQuery("SELECT titulo FROM tblivros WHERE categoria LIKE 'Música e arte'");

			}
			while(reS.next()) 
				{dados.add(reS.getString("titulo"));
				}
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		PrintWriter out = response.getWriter(); response.setContentType("text/html");
		out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset=\"utf-8\">");
	    out.println("<title>CATEGORIA</title>");
	    out.println("<style type=\"text/css\"> p{ text-align:center; color: white; font-size: 25px;}  body{margin: 0;}.Header{background-color: #01386e;height:150px;padding-top: 5px;}.tit{font-size: 25px;margin-top: ;margin-left: 10px;display:inline-block;color: white;}.ops{margin-top: 27px;float:right;display:inline-block;margin-right:10px;}.fundo{height: 500px;background-image: url(\"c.jpg\");background-repeat: no-repeat;background-position: center center;}.button{padding: 5px;}form{color: white;text-align: center; margin-top: -30px;}label{font-size: 20px;display:inline-block;font-size: 15px;margin: 10px;}select{display:inline-block;}input{display:inline-block;}</style>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<div class='Header'>");
	    out.print("<p>Livros da categoria:</p>");
    	out.print("<p>");
    	for (int i=0; i<=dados.size() - 1; i++) 
    	{out.println(dados.get(i)); 
			}
	    out.print("</p>");
	    out.println("<form action='index.jsp'><br>	<input class='btn' type='submit' value='VOLTAR'> </form>");
	    out.println("</div>");
	    out.println("<div class='fundo'>");
	    out.println("</div>");
	    out.println("</body>");
	    out.println("</html>");
	}

}
