<%-- 
    Document   : indice
    Created on : 30-nov-2018, 12:23:55
    Author     : Mañanas
--%>

<%@page import="paqueaemetweb.AccesoBD"%>
<%@page import="java.util.ArrayList"%>
<%@page import="paqueaemetweb.Provincia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
ArrayList<Provincia> lista_provincias=AccesoBD.recuperarProvincias();
int a=9;

%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="ServletAEMET" method="GET">
        <select name="provincia">
            <% for (int i=0; i<lista_provincias.size(); i++)
            { Provincia p=lista_provincias.get(i);
                %>

<option value="<%=p.getId_provincia()%>"><%=p.getProvincia()%></option>
<% } %>
        </select>
        <input type="submit" value="Enviar">
        </form>
    </body>
</html>
