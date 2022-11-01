<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MOSTRAR</title>
<style type="text/css">
	
	body{
		margin: 0;
	}
	.Header{
		background-color: #01386e;
		height:110px;
		padding-top: 5px;
	}
	.tit{
		font-size: 25px;
		margin-top: ;
		margin-left: 10px;
		display:inline-block;
		color: white;
		
	}
	.ops{
		margin-top: 27px;
		float:right;
		display:inline-block;
		margin-right:10px;
	}
	.fundo{
		height: 500px;
		background-image: url("c.jpg");
		background-repeat: no-repeat;
 		background-position: center center;
	}
	.button{
		padding: 5	px;
	}
	form{
		color: white;
		text-align: center;
		margin-top: 3px;
	
	}
	label{
		font-size: 20px;
	}
	select{
		margin-top: 10px;
	}
	.button{
	 	margin-top: 5px;
	}
</style>
</head>
<body>
	<div class="Header">
			<form action="/Proj_Cliente_Servidor/mostrar">
				<label>Digite o ID do Livro:</label><br>
					<input class="textarea" type="text" name="IDLivro"><br>
					<input class="button" type="submit" value="EXIBIR">
			</form>
			<form action="index.jsp">
				<input class="button" type="submit" value="VOLTAR">
			</form>
	</div>
		<div class="fundo"></div>
	
</body>
</html>