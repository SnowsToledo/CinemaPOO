
package model;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private boolean estudante;

    public Cliente(String nome, String cpf, String endereco, boolean estudante) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estudante = estudante;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

}
