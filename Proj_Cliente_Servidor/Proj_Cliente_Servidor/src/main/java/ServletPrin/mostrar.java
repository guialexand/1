package ServletPrin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.BD;
@WebServlet("/mostrar")
public class mostrar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public mostrar() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Connection conexao=null;
			ResultSet reS=null;
			PreparedStatement PreSta=null;
			List<String> dados=new ArrayList<>();
			try 
			{
				String cod =request.getParameter("IDLivro");
				conexao = BD.getConnection();
				PreSta = conexao.prepareStatement("SELECT * FROM bdlivraria.tblivros WHERE (`codlivro` = ?)");
				PreSta.setString(1, cod);
				reS = PreSta.executeQuery();
			 
					while(reS.next()==true) 
					{
						dados.add(reS.getString("titulo"));
						dados.add(reS.getString("autor"));
						dados.add(reS.getString("categoria"));
						dados.add(Float.toString(reS.getFloat("valor")));
					}
					
					PrintWriter out = response.getWriter(); response.setContentType("text/html");
				    
					out.println("<!DOCTYPE html>");
				    out.println("<html>");
				    out.println("<head>");
				    out.println("<meta charset=\"utf-8\">");
				    out.println("<title>MOSTRAR</title>");
				    out.println("<style type=\"text/css\"> p{ text-align:center; color: white; font-size: 25px;}  body{margin: 0;}.Header{background-color: #01386e;height:150px;padding-top: 5px;}.tit{font-size: 25px;margin-top: ;margin-left: 10px;display:inline-block;color: white;}.ops{margin-top: 27px;float:right;display:inline-block;margin-right:10px;}.fundo{height: 500px;background-image: url(\"c.jpg\");background-repeat: no-repeat;background-position: center center;}.button{padding: 5px;}form{color: white;text-align: center; margin-top: -30px;}label{font-size: 20px;display:inline-block;font-size: 15px;margin: 10px;}select{display:inline-block;}input{display:inline-block;}</style>");
				    out.println("</head>");
				    out.println("<body>");
				    out.println("<div class='Header'>");
				    if(dados.size()!=0)
			    	{out.print("<p>Informações sobre o livro:</p>");
			    	out.print("<p>");
			    	for (int i=0; i<=dados.size()-1; i++) 
			    	{
						   out.println(dados.get(i)); 
						}
			    	}else
			    		{
			    	out.println("<p>Dados Incorretos!</p>");
			    		}
				    out.print("</p>");
				    out.println("<form action='index.jsp'><br>	<input class='btn' type='submit' value='VOLTAR'> </form>");
				    out.println("</div>");
				    out.println("<div class='fundo'>");
				    out.println("</div>");
				    out.println("</body>");
				    out.println("</html>");
				    
			}catch(SQLException e){
				e.printStackTrace();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	
	}

}
