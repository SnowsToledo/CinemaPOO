package model;

public class Funcionario {

    private int idMat;
    private boolean master;
    private String nome;
    private String endereco;
    private String telefone;

    public Funcionario(String nome, String endereco, String telefone, boolean master) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.master = master;
    }

    public Funcionario(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.master = false;
    }
    

    public int getIdMat() {
        return idMat;
    }

    public void setIdMat(int idMat) {
        this.idMat = idMat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isMaster() {
        return master;
    }

}
