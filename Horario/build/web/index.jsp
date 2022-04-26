<%-- 
    Document   : index
    Created on : 25 de abr de 2022, 21:02:48
    Author     : amanda
--%>
<%@page import="demo.Horario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Horario agora = new Horario(22,30,30);
    Horario intervalo = new Horario(15,50,00);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Classe para manipular horários</title>
    </head>
    <body>
        <h1>Classe para manipular horários</h1>
        <h3>Nome: Amanda Santos</h3>
        <h3>RA: 1290482022020</h3>
        <h2>Horário agora: <%=agora.getHorario()%></h2>
        <h2>Horário intervalo: <%=intervalo.getHorario()%> </h2>
    </body>
</html>
