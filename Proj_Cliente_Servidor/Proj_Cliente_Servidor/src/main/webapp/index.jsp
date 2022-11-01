<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INICIO</title>
<style type="text/css">
	
	body{
	
		margin: 0;
	}
	.Header{
		background-color: #01386e;
		height:80px;
	}
	.Header1{
		text-align: center;
		background-color: #01386e;
		height:270px;
		margin-top: -100px;
	}
	.tit{
		font-size: 25px;
		margin-top: ;
		margin-left: 15px;
		display:inline-block;
		color: white;
		
	}
	.tit1{
		font-size: 17px;
		margin-top: ;
		margin-left: 15px;
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
		padding: 5px;
	}
</style>
</head>
<body>
			<div class="Header" >
						<div class="tit">
							<p>Projeto Cliente/Servidor</p>
						</div>
						<div class="ops">
							<form action="categoria.jsp">
								  	<input class="button" type="submit" value="LIVROS POR CATEGORIA">
							</form>
						</div>
						<div class="ops">
							<form action="mostrar.jsp">
								  	<input class="button" type="submit" value="MOSTRAR LIVROS POR ID">
							</form>
						</div>
						<div class="ops">
							<form action="cadastrar.jsp">
								  	<input class="button" type="submit" value="CADASTRAR">
							</form>
						</div>
						<div class="ops">
							<form action="editar.jsp">
								  	<input class="button" type="submit" value="EDITAR">
							</form>
						</div>
						<div class="ops">
							<form action="excluir.jsp">
								  	<input class="button" type="submit" value="EXCLUIR">
							</form>
						</div>
			</div>
	<div class="fundo">
	</div>
		<div class="Header1">
			<p class="tit1">Nome:Guilherme Gonzaga RGM: 27429521</p><br>
			<p class="tit1">Nome: Gabriel Ribeiro RGM: 28184190</p><br>
			<p class="tit1">Nome: Daniel Gaza RGM: 28161076</p><br>
			<p class="tit1">Nome: Bruno Sousa RGM: 28180640</p><br>
			<p class="tit1">Nome: Leonardo Matos RGM: 27869474</p>
			
		</div>
	
	
</body>
</html>