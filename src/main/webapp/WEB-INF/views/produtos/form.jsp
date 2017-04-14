<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livros de java, Android, Iphone, PHP, Ruby e muito mais -
	Casa do c�digo</title>
</head>
<body>
		<div>
	<form:form action="${ s:mvcUrl('PC#gravar').build() }" method="post" commandName="produto" enctype="multipart/form-data">
			<label>T�tulo</label> 
			<form:input path="titulo" />
			<form:errors path="titulo" />
		</div>

		<div>
			<label>Descri��o</label>
			<form:textarea rows="10" cols="20" path="descricao" />
			<form:errors path="descricao"/>
		</div>

		<div>
			<label>Data de Lan�amento</label>
			<form:input path="dataLancamento"/>
			<form:errors path="dataLancamento"/>
		</div>
		<div>
			<label>P�ginas</label> 
			<form:input path="paginas" />
			<form:errors path="paginas" />
		</div>
		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
			<div>
				<label>${tipoPreco}</label>
				<input type="text" name="precos[${status.index}].valor">
                <input type="hidden" name="precos[${status.index}].tipo" value="${tipoPreco}">
			</div>
		</c:forEach>
		
		<div>
			<label>S�mario</label>
			<input type="file" name="sumario"/>
		</div>
		<button type="submit">Cadastrar</button>
	</form:form>
</body>
</html>