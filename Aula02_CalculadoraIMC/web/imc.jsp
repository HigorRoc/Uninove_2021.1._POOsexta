<%@page import="br.uninove.Imc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora IMC</title>
    </head>
    <body>
        <h1>Calculadora IMC</h1>
        <hr>
        
        <%
            float peso, altura;
            peso = Float.parseFloat(request.getParameter("peso")); //request sempre retorna String
            altura = Float.parseFloat(request.getParameter("altura"));
            
            Imc imc = new Imc();
            imc.setPeso(peso);
            imc.setAltura(altura);
        %>
        
        <strong>Dados Informados: </strong>
        <ul>
            <li><strong>Peso: </strong><%= peso %> Kg</li>
            <li><strong>Altura: </strong><%= altura %> m</li>
        </ul>
        <strong>Cálculo IMC: </strong>
        <ul>
            <li><strong>IMC: </strong><%= String.format("%.2f", imc.calculaImc()) %></li>
        </ul>
    </body>
</html>