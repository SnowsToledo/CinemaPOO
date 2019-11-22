package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection conexao;
    private String host, porta, username, database, password, dbUrl;

    public Conexao() {

        try {
            Class.forName("org.postgresql.Driver");
            this.host = "localhost";
            this.porta = "5432";
            this.username = "postgres";
            this.password = "admin";
            this.database = "cinema";
            this.dbUrl = "jdbc:postgresql://" + this.host + ':' + this.porta + '/' + this.database;

            conexao = (Connection) DriverManager.getConnection(dbUrl, username, password);
            System.out.println("conexao realizada com sucesso");
            }catch (SQLException | ClassNotFoundException ex) {
                ex.printStackTrace(); 
         }		
    }
    public Connection getConexao() {
	return conexao;
    }
}
	
	




