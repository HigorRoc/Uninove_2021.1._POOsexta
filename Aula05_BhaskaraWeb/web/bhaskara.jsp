<%@page import="br.uninove.bhaskara.BhaskaraCalc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bhaskara</title>
        <style>
            html {
                font-family: sans-serif;
                text-align: center;
            }
            li{
                list-style: none;
            }
        </style>
    </head>
    <body>
        <h2>Calculadora Bhaskara</h2>
        </hr>
        <%
            float a, b, c;
            a = Float.parseFloat(request.getParameter("valueA"));
            b = Float.parseFloat(request.getParameter("valueB"));
            c = Float.parseFloat(request.getParameter("valueC"));
            BhaskaraCalc bhask = new BhaskaraCalc();
            bhask.setA(a);
            bhask.setB(b);
            bhask.setC(c);
            
            if (a == 0) { %>
        
        <!-- Aviso -->
        <h3 style="color: red;">ATENÇÃO: O valor de "A" não pode ser igual a "Zero"!</h3>

        <% } else {%>

        <strong>Valores informados: </strong>
        <ul>
            <li>Valor de a: <strong><%= a%></strong></li>
            <li>Valor de b: <strong><%= b%></strong></li>
            <li>Valor de c: <strong><%= c%></strong></li>
        </ul>
        <strong>Resultados:</strong>
        <ul>
            <li>Valor de delta: <strong><%= String.format("%.2f", bhask.getDelta())%></strong></li>
            <li>Valor de x1: <strong><%= (bhask.getDelta() < 0) ? "Delta não pode retornar valores negativos!" : String.format("%.1f", bhask.calculoX1())%></strong></li>
            <li>Valor de x2: <strong><%= (bhask.getDelta() < 0) ? "Delta não pode retornar valores negativos!" : String.format("%.1f", bhask.calculoX2())%></strong></li>
        </ul>

        <% }%>

        <button href="index.html" class="btn btn-outline-info">Realizar novo Cálculo</button>
    </body>
</html>
