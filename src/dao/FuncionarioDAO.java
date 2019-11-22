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
import model.Funcionario;

/**
 *
 * @author felip
 */

public class FuncionarioDAO{

    private Connection conexao;

    public FuncionarioDAO() {
        Conexao con = new Conexao();
        this.conexao = con.getConexao();
    }

    public void adicionar(Funcionario contato) {

        String sql = "insert into funcionarios "
                + "(nome,endereco,telefone,gerente)"
                + " values (?,?,?,?)";

        try {
            // prepared statement para inserÃ§Ã£o
            PreparedStatement stmt = conexao.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEndereco());
            stmt.setString(3, contato.getTelefone());

            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void altera(Funcionario funcionario) {
        System.out.println("ID: " + funcionario.getIdMat());

        String sql = "update funcionarios set nome=?, endereco=?, telefone=?, gerente=? "
                + "where id=?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getEndereco());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setBoolean(4, funcionario.isMaster());
            stmt.setInt(5, funcionario.getIdMat());

            System.out.println(stmt);

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(Funcionario funcionario) {
        try {
            PreparedStatement stmt = conexao.prepareStatement("delete "
                    + "from funcionarios where id=?");
            stmt.setInt(1, funcionario.getIdMat());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void consultarTodos() {
        String sql = "select * from funcionarios";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery(); //executa uma consulta
            while (resultado.next()) {
                System.out.println(resultado.getInt("id")
                        + " " + resultado.getString("nome")
                        + " - " + resultado.getString("email")
                        + " - " + resultado.getString("endereco")
                        + " - " + resultado.getBoolean("gerente"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public ResultSet buscarPorNome(String nome) {

        String sql = "select * from funcionarios where nome like ? or endereco like ? or telefone like ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, '%' + nome + '%');
            stmt.setString(2, '%' + nome + '%');
            stmt.setString(3, '%' + nome + '%');

            ResultSet resultado = stmt.executeQuery(); //executa uma consulta
            return resultado;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

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

    public void encerrar() {
        try {
            this.conexao.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
