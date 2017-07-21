<%-- 
    Document   : listareventos
    Created on : 21/07/2017, 07:41:37
    Author     : 02376421152
--%>

<%@page import="br.ifmt.dai.escola.Eventos"%>
<%@page import="java.util.List"%>
<%@page import="br.ifmt.dai.escola.GerenciadorEventos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 align="center">Listando Eventos</h2>
        <%

            GerenciadorEventos ge = new GerenciadorEventos();
            List lista = ge.listarEventos();
            String tabela = "";
            tabela += "<table align=center border=1>";
            tabela += "<tr><td>id</td><td>Evento</td><td>Data</td><tr>";
            for (int i = 0; i < lista.size(); i++) {
                Eventos c = (Eventos)lista.get(i);
                int idEvento =c.getIdEventos();
                String evento = c.getEvento();
                String data= c.getDataEvento();
                tabela+="<tr>";
                tabela+="<td>"+idEvento+"</td>";
                tabela+="<td>"+evento+"</td>";
                tabela+="<td>"+data+"</td>";
                tabela+="</tr>";
                

            }
            tabela+="</table>";
            out.println(tabela);
        %>
    </body>
</html>
