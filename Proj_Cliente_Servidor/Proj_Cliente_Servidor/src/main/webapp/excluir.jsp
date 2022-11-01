<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EXCLUIR</title>
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
		margin-left: 37%;
		
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
		<form action="/Proj_Cliente_Servidor/excluir">
			<label>Codigo do Livro:</label>
				<input class="textarea"  type="text" name="DeletIdlivro">
				<input class="btn" type="submit" value="DELETAR">
		</form>
	</div>
	<div  class="fundo" ></div>
</body>
</html>