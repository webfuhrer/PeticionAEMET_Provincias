<%-- 
    Document   : muicipios.jsp
    Created on : 03-dic-2018, 10:35:06
    Author     : Mañanas
--%>

<%@page import="paqueaemetweb.PintarHTML"%>
<%@page import="java.util.ArrayList"%>
<%@page import="paqueaemetweb.Municipio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<Municipio> lista_municipios=(ArrayList<Municipio>)request.getAttribute("municipios");
    String html_combo=PintarHTML.crearCombo(lista_municipios);
    String id_provincia=(String)request.getAttribute("id_provincia");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="ServletPideAemet" method="GET">
            <%=html_combo%>
            <input type="hidden" value="<%=id_provincia %>" name="id_provincia">
            <input type="submit" value="Ver clima">
        </form>
        
    </body>
</html>
