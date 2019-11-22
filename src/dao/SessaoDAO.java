/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Sessao;

public class SessaoDAO {
        private Connection conexao;

    public SessaoDAO() {
    	Conexao con = new Conexao();
        this.conexao = con.getConexao();
    }
    
    //MÃ‰TODO PARA ADICIONAR NOVO CONTATO
    public void adicionar(Sessao sessao) {
    	
        String sql = "insert into funcionarios " +
                "(preco, normal, filme, horario, numSala, ingressosDisp, dia, qntdCadeira)" +
                " values (?,?,?,?,?,?,?,?)";

        try {
            // prepared statement para inserÃ§Ã£o
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setDouble(1, sessao.getPreco());
            stmt.setBoolean(2, sessao.isNormal());
            stmt.setString(3,sessao.getFilme());
            stmt.setTime(4, sessao.getHorario());
            stmt.setInt(5, sessao.getNumSala());
            stmt.setInt(6, sessao.getIngressosDisp());
            stmt.setDate(7, sessao.getDia());
            stmt.setInt(8,sessao.getColuna()*sessao.getFileira());
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //MÃ‰TODO PARA ALTERAR CONTATO
    public void altera(Sessao sessao) {
    	System.out.println("ID: "+sessao.getIdSessao());
    	
        String sql = "update sala set preco=?, normal=? filme=?, horario=?, numSala=?, ingressosDisp=? dia=?, qntdCadeira=? " +
                "where id=?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
           stmt.setDouble(1, sessao.getPreco());
            stmt.setBoolean(2, sessao.isNormal());
            stmt.setString(3,sessao.getFilme());
            stmt.setTime(4, sessao.getHorario());
            stmt.setInt(5, sessao.getNumSala());
            stmt.setInt(6, sessao.getIngressosDisp());
            stmt.setDate(7, sessao.getDia());
            stmt.setInt(8, sessao.getColuna()*sessao.getFileira());
            stmt.setInt(9, sessao.getIdSessao());
            System.out.println(stmt);
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //MÃ‰TODO PARA EXCLUIR
    public void remove(Sessao sessao) {
        try {
            PreparedStatement stmt = conexao.prepareStatement("delete " +
                    "from sessao where id=?");
            stmt.setInt(1, sessao.getIdSessao());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //MÃ‰TODO PARA EXIBIR TODOS
    public void consultarTodos() {
    	 String sql = "select * from sessao";

		try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery(); 
            while (resultado.next()) {
                System.out.println(resultado.getInt("id")
                        + " - " +resultado.getDouble("preco")
                        + " - " +resultado.getBoolean("normal")
                        + " - " +resultado.getString("filme")
                        + " - " +resultado.getTime("horario")
                        + " - " +resultado.getInt("numSala")
                        + " - " +resultado.getInt("ingressosDisp")
                        + " - " +resultado.getDate("dia")
                        + " - " +resultado.getInt("qntdCadeira"));                       
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    public ResultSet buscarPorNumSala(String nome) {

   	String sql = "select * from sessao where preco like ? or normal like ? or filme like ? or horario like ? or numSala like ? or ingressosDisp like ? or dia like ? or qntdCadeira like ?";

	try {
           PreparedStatement stmt = conexao.prepareStatement(sql);
           stmt.setString(1,'%'+nome+'%');
           stmt.setString(2,'%'+nome+'%');
           stmt.setString(3,'%'+nome+'%');
           stmt.setString(4,'%'+nome+'%');
           stmt.setString(5,'%'+nome+'%');
           stmt.setString(6,'%'+nome+'%');
           stmt.setString(7,'%'+nome+'%');
           stmt.setString(8,'%'+nome+'%');
           

           ResultSet resultado = stmt.executeQuery(); //executa uma consulta
           return resultado;
       } catch (SQLException ex) {
           ex.printStackTrace();
       }

       return null;
   }
    
    
    //MÃ‰TODO PARA BUSCAR QUALQUER CONSULTA
    public ResultSet consultar(String sql) {

	try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery(); //executa uma consulta
            return resultado;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    //MÃ‰TODO PARA FECHAR CONEXÃƒO
    public void encerrar() {
    	try {
			this.conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   
}
