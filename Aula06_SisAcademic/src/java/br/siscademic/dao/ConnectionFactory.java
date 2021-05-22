package br.siscademic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    //FINAL = após definir o valor, não pode ser alterado
    //STATIC = não é necessário instância para acessar
    private static final String urlDB = "jdbc:derby://localhost:1527/SisAcademic";
    private static final String usuario = "uninove";
    private static final String senha = "Senha123";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(urlDB, usuario, senha);
    }
    
}
