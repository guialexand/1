package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import bd.BDException;

public class BD {

	private static Connection conexao=null;
	public static Connection getConnection() throws ClassNotFoundException
		{
			if(conexao==null)
				{	try
					{
						Class.forName("com.mysql.cj.jdbc.Driver");
						conexao=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdlivraria?useTimezone=true&serverTimezone=UTC","root","15331533");
					}catch(SQLException e)
						{
							throw new BDException(e.getMessage());
						}
		
				}
		
			return conexao;
		}
	
	public static void closeConnection() 
	{
		if(conexao!=null)
		{
			try
			{
				conexao.close();
			}catch(SQLException e)
			{
				throw new BDException(e.getMessage());
			}
		}
		
	}
	
	public static void closeStatement(Statement sta)
	{
		if(sta!=null)
		{
			try
			{
				sta.close();
			}catch(SQLException e) 
			{
				throw new BDException(e.getMessage());
			}
		}
	}
	
	public static void closeResultSet(ResultSet reS) 
	{
		if(reS!=null)
		{
			try
			{
				reS.close();
			}catch(SQLException e) 
			{
				throw new BDException(e.getMessage());
			}
		}
	}
	
	
}
