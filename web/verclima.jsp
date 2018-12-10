<%-- 
    Document   : verclima
    Created on : 10-dic-2018, 10:28:41
    Author     : Mañanas
--%>

<%@page import="paqueaemetweb.PintarHTML"%>
<%@page import="paqueaemetweb.Clima"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Clima c=(Clima)request.getAttribute("clima");
    String html_tabla=PintarHTML.crearTabla(c);
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=c.getMunicipio()%>, <%=c.getProvincia()%></h1>
        <%=html_tabla%>
    </body>
</html>
