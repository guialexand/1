<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDITAR</title>
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
		display: flex;
		color: white;
		text-align: center;
		margin: 35px;
		margin-left: 80px;
		
	}
	label{
		font-size: 20px;
		display:inline-block;
		font-size: 15px;
		margin: 10px;
	}
	select{
		display:inline-block;
	}

	input{
		display:inline-block;
	
	}
</style>
</head>
<body>
	<div class="Header">
		<form action="/Proj_Cliente_Servidor/editar">
				<label>Codigo do Livro:</label><br>
					<input class="textarea" type="text" name="EDidlivro"><br>
				<label>Titulo:</label><br>
					<input class="textarea" type="text" name="EDtitu"><br>
				<label>Autor:</label><br>
					<input  class="textarea" type="text" name="EDaut"><br>
				<label>Categoria:</label><br>
					<select  class="textarea"  Name="EDcateg">
			  		  <option value="Arquitetura">Arquitetura</option>
					  <option value="Desgin">Desgin</option>
					  <option value="Informatica">Informática</option>
					  <option value="Literatura brasileira">Literatura brasileira</option>
					  <option value="Literatura infantil">Literatura infantil</option>
					  <option value="Literatura universal">Literatura universal</option>
					  <option value="Musica e arte">Música e arte</option>
					</select> <br>
				<label>Valor:</label><br>
					<input  class="textarea"  type="text" name="EDval"><br>
					<input class="buttOn" type="submit" value="EDITAR">
		</form>
	</div>
	<div  class="fundo" ></div>
</body>
</html>