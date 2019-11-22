package model;

import java.sql.Date;
import java.sql.Time;

public class Ingresso {
    private double preco;
    private String tipo;
    private int coluna;
    private char fileira;
    private String filme;
    private String sessao;
    private Date dia;
    private Date diaCompra;
    private Time horario;
    private Time horarioCompra;

    public Ingresso(double preco, String tipo, Date dia, int coluna, char fileira, String filme, String sessao, Time horarioCompra, Date diaCompra) {
        this.preco = preco;
        this.tipo = tipo;
        this.coluna = coluna;
        this.fileira = fileira;
        this.filme = filme;
        this.sessao = sessao;
        this.dia = dia;
        this.horarioCompra = horarioCompra;
        this.diaCompra = diaCompra;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDiaCompra() {
        return diaCompra;
    }

    public void setDiaCompra(Date diaCompra) {
        this.diaCompra = diaCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public char getFileira() {
        return fileira;
    }

    public void setFileira(char fileira) {
        this.fileira = fileira;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public Time getHorarioCompra() {
        return horarioCompra;
    }

    public void setHorarioCompra(Time horarioCompra) {
        this.horarioCompra = horarioCompra;
    }


    
}
