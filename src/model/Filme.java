package model;

public class Filme {
     private String nome;
     private int minDuracao;

    public Filme(String nome, int minDuracao) {
        this.nome = nome;
        this.minDuracao = minDuracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMinDuracao() {
        return minDuracao;
    }

    public void setMinDuracao(int minDuracao) {
        this.minDuracao = minDuracao;
    }
    
}
