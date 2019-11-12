package model;

public class Ingresso {
    private double preco;
    private String tipo;
    private int coluna;
    private char fileira;
    private String filme;
    private String sessao;
    private int dia;
    private int mes;
    private int horas;
    private int minutos;
    private int horaCompra;
    private int minutosCompra;
    private String horario = new String(horas+":"+minutos);

    public Ingresso(double preco, String tipo, int dia, int mes, int coluna, char fileira, String filme, String sessao, int horaCompra, int minutosCompra) {
        this.preco = preco;
        this.tipo = tipo;
        this.coluna = coluna;
        this.fileira = fileira;
        this.filme = filme;
        this.sessao = sessao;
        this.dia = dia;
        this.mes = mes;
        this.horaCompra = horaCompra;
        this.minutosCompra = minutosCompra;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public int getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(int horaCompra) {
        this.horaCompra = horaCompra;
    }

    public int getMinutosCompra() {
        return minutosCompra;
    }

    public void setMinutosCompra(int minutosCompra) {
        this.minutosCompra = minutosCompra;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
}
