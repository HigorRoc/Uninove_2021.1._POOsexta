<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AT Calculator</title>
    </head>
    <body>
        <%
            String vA = request.getParameter("numberOne") != null ? request.getParameter("numberOne") : "";
            String vB = request.getParameter("numberTwo") != null ? request.getParameter("numberTwo") : "";
        %>
        <h1>ApexTech Calculator</h1>
        <hr>
        <form method="POST" action="CalcController">
            <div>
                <label>Valor A: </label>
                <input type="number" name="valueA" step="0.01" value="<%= vA %>">
            </div>
            <div style="margin: 20px 0;">
                <label>Valor B: </label>
                <input type="number" name="valueB" step="0.01" value="<%=vB%>">
            </div>
            <input type="submit" value="Somar" name="btCalc">
            <input type="submit" value="Subtrair" name="btCalc">
            <input type="submit" value="Multiplicar" name="btCalc">
            <input type="submit" value="Dividir" name="btCalc">
            <input type="submit" value="Elevar" name="btCalc">
        </form>
        <% if(request.getParameter("result") != null){ %>
            <hr>
            <strong>Resultado = </strong><%= request.getParameter("result")%>
        <% } %>
    </body>
</html>