<%@ page import="java.util.Map" %>
<%@ page import="util.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sistema Universitario</title>
  </head>
  <h1>Sistema Universitario</h1>
  <h2>Agregar Profesor</h2>
  <% ProfesorDTO prof = (ProfesorDTO)request.getAttribute("profesor"); %>
  <form name="AgregarProfesor" action="/universidad/agregarProfesor" method="get">
  <table>
	<tr><td>Id:</td><td><input type="text" name="id" value=""/></td></tr>
    <tr><td>Nombre:</td><td><input type="text" name="nombre" value=""/></td></tr>
    <tr><td>C&eacute;dula:</td><td><input type="text" name="cedula" value=""/></td></tr>
    <tr><td>T&iacute;tulo:</td><td><input type="text" name="titulo" value=""/></td></tr>
    <tr><td>Area:</td><td><input type="text" name="area" value=""/></td></tr>
    <tr><td>Tel&eacute;fono:</td><td><input type="text" name="telefono" value=""/></td></tr>
    <tr><td></td><td><input type="submit" value="Agregar" /></td></tr>
  </table>
  </form>
</html>