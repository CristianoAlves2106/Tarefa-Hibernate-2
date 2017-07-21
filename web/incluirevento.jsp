<%-- 
    Document   : incluirevento
    Created on : 19/07/2017, 09:32:24
    Author     : 02376421152
--%>

<%@page import="br.ifmt.dai.escola.GerenciadorEventos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="0">
            <tr><td>
                    <form action="GravarEvento" method="get" >
                        Evento :<br><input type="text" name="evento" value=""/><br>
                        Data :<br><input type="text" name="dataEvento" value=""/><br>
                        <br><input type="submit" name="incluir" value="Salvar"/>
                    </form>
                </td></tr>

        </table>
       
    </body>
</html>
