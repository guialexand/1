<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CATEGORIA</title>

<style type="text/css">
	
	body{
	
		margin: 0;
	}
	.Header{
		background-color: #01386e;
		height:80px;
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
		displaay: inline-block;

	}
	label{
		font-size: 25px;
	}
	select{
		margin-top: 10px;
	}
</style>
</head>
<body>
	<div class="Header" >
		<form action="/Proj_Cliente_Servidor/categoria">
			<label for="cato">Categoria:</label><br>
				<select class="textarea" name="catego" id="catego">
			  		<option value="Arquitetura">Arquitetura</option>
			  		<option value="Desgin">Desgin</option>
			  		<option value="Inf">Informática</option>
			  		<option value="Lbr">Literatura brasileira</option>
			  		<option value="Lti">Literatura infantil</option>
			  		<option value="Ltun">Literatura universal</option>
			  		<option value="Msa">Música e arte</option>
				</select>
					<input class="button" type="submit" value="EXIBIR">
		</form>
	</div>
	<div class="fundo"></div>
</body>
</html>