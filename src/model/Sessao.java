package model;

import java.sql.Date;
import java.sql.Time;

public class Sessao {

    private int idSessao;
    private double preco;
    private boolean normal;
    private String filme;
    private Time horario;
    private int numSala;
    private int ingressosDisp;
    private Date dia;
    private int coluna;
    private int fileira;


    
    public Sessao(double preco, boolean normal, int numSala, String filme, Time horario, Date dia, int ingressosDisp, int coluna, int fileira) {
        this.preco = preco;
        this.normal = normal;
        this.numSala = numSala;
        this.filme = filme;
        this.horario = horario;
        this.dia = dia;
        this.ingressosDisp = ingressosDisp;
        this.coluna = coluna;
        this.fileira = fileira;
    }
    
    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }
    public boolean isNormal() {
        return normal;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public int getIngressosDisp() {
        return ingressosDisp;
    }

    public void setIngressosDisp(int ingressosDisp) {
        this.ingressosDisp = ingressosDisp;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

}
