package model;

public class Sessao {

    private int idSessao;
    private double preco;
    private boolean normal;
    private int horas;
    private int minutos;
    private String filme;
    private String horario = new String(horas + ":" + minutos);
    private int numSala;
    private int ingressosDisp;
    private int coluna;
    private int fileira;
    private int[] dias;
    private int mes;


    
    public Sessao(double preco, boolean normal, int numSala, String filme, int horas,int minutos, int[] dias, int mes,  int ingressosDisp, int coluna, int fileira) {
        this.preco = preco;
        this.normal = normal;
        this.numSala = numSala;
        this.filme = filme;
        this.horas = horas;
        this.minutos = minutos;
        this.ingressosDisp = ingressosDisp;
        this.coluna = coluna;
        this.fileira = fileira;
        this.dias = dias;
        this.mes = mes;
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

    public int[] getDias() {
        return dias;
    }

    public void setDias(int[] dias) {
        this.dias = dias;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIngressosDisp() {
        return ingressosDisp;
    }

    public void setIngressosDisp(int ingressosDisp) {
        this.ingressosDisp = ingressosDisp;
    }

    public int[] getDia() {
        return dias;
    }

    public void setDia(int[] dias) {
        this.dias = dias;
    }
    public int getLength(){
        return dias.length;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
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
