package br.edu.ifsp.javafx.aulas.model;

public class Cotacao {
    private String idMoeda1;
    private String idMoeda2;
    private String dia;
    private double valor;

    public String getIdMoeda1() {
        return idMoeda1;
    }

    public void setIdMoeda1(String idMoeda1) {
        this.idMoeda1 = idMoeda1;
    }

    public String getIdMoeda2() {
        return idMoeda2;
    }

    public void setIdMoeda2(String idMoeda2) {
        this.idMoeda2 = idMoeda2;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
