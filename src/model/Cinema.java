package model;

public class Cinema {

    private int idCinema;
    private String nome;
    private int qntdSala;
    private String endereco;

    public Cinema(String nome, int qntdSala, String endereco) {
        super();
        this.nome = nome;
        this.qntdSala = qntdSala;
        this.endereco = endereco;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public int getQntdSala() {
        return qntdSala;
    }

    public void setQntdSala(int qntdSala) {
        this.qntdSala = qntdSala;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
