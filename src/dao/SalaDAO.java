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

import model.Sala;

public class SalaDAO {

    private Connection conexao;

    public SalaDAO() {
        Conexao con = new Conexao();
        this.conexao = con.getConexao();
    }

    //MÃ‰TODO PARA ADICIONAR NOVO CONTATO
    public void adicionar(Sala sala) {

        String sql = "insert into sala "
                + "(num,qntdCadeira)"
                + " values (?,?)";

        try {
            // prepared statement para inserÃ§Ã£o
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, sala.getNumSala());
            stmt.setInt(2, sala.getQntdCadeira());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //MÃ‰TODO PARA ALTERAR CONTATO
    public void altera(Sala sala) {
        System.out.println("ID: " + sala.getIdSala());

        String sql = "update sala set numSala=?, qntdCadeira=? "
                + "where id=?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, sala.getNumSala());
            stmt.setInt(2, sala.getQntdCadeira());
            stmt.setInt(3, sala.getIdSala());

            System.out.println(stmt);

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //MÃ‰TODO PARA EXCLUIR
    public void remove(Sala sala) {
        try {
            PreparedStatement stmt = conexao.prepareStatement("delete "
                    + "from sala where id=?");
            stmt.setInt(1, sala.getIdSala());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //MÃ‰TODO PARA EXIBIR TODOS
    public void consultarTodos() {
        String sql = "select * from sala";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery(); //executa uma consulta
            while (resultado.next()) {
                System.out.println(resultado.getInt("id")
                        + " - " + resultado.getString("numSala")
                        + " - " + resultado.getString("qntdCadeira"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    //MÃ‰TODO PARA BUSCAR POR NOME
    public ResultSet buscarPorNumSala(String nome) {

        String sql = "select * from sala where numSala like ? or qntdCadeira like ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, '%' + nome + '%');
            stmt.setString(2, '%' + nome + '%');

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
