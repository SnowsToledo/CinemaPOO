package model;

public class Sala {

    private int idSala;    
    private int numSala;
    private int qntdCadeira;
    private int colunas;
    private int fileiras;
    private int[] sessao = new int[5];

    public Sala(int numSala, int qntdCadeira, int colunas, int fileiras) {
        super();
        this.numSala = numSala;
        this.qntdCadeira = qntdCadeira;
        this.colunas = colunas;
        this.fileiras = fileiras;
    }

    public Sala(int numSala) {
        this.numSala = numSala;
    }

    public int getIdSala() {
        return idSala;
    }


    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public int getQntdCadeira() {
        return qntdCadeira;
    }

    public void setQntdCadeira(int qntdCadeira) {
        this.qntdCadeira = qntdCadeira;
    }

}
