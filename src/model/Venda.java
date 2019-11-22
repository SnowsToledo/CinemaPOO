/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.Time;

public class Venda {
    private int idVenda;
    private int idFunc;
    private double preco;
    private String tipoIngresso;
    private Date dataCompra;
    private Time horarioCompra;
    

    public Venda(int idFunc, double preco, String tipoIngresso, Date dataCompra, Time horarioCompra) {
        this.idFunc = idFunc;
        this.preco = preco;
        this.tipoIngresso = tipoIngresso;
        this.dataCompra = dataCompra;
        this.horarioCompra = horarioCompra;
        
    }

    public int getIdVenda() {
        return idVenda;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Time getHorarioCompra() {
        return horarioCompra;
    }

    public void setHorarioCompra(Time horarioCompra) {
        this.horarioCompra = horarioCompra;
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
   
}
