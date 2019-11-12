/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Venda {
    private int idVenda;
    private int idFunc;
    private double preco;
    private String tipoIngresso;
    private int dia;
    private int mes;
    private int horas;
    private int minutos;
    private String horario = new String(horas+":"+minutos);
    private String horasCompra;

    public Venda(int idFunc, double preco, String tipoIngresso, int dia, int mes, int horas, int minutos, String horasCompra) {
        this.idFunc = idFunc;
        this.preco = preco;
        this.tipoIngresso = tipoIngresso;
        this.dia = dia;
        this.mes = mes;
        this.horas = horas;
        this.minutos = minutos;
        this.horasCompra = horasCompra; 
    }

    public String getHorasCompra() {
        return horasCompra;
    }

    public void setHorasCompra(String horasCompra) {
        this.horasCompra = horasCompra;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


    
}
