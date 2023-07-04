package br.edu.ifsp.javafx.aulas.model;

public class Cedula  extends MoedaAbstrata{
    private String marcaDAgua;
    private double area;
    private double largura;
    private double altura;

    public Cedula(String idPais, double valor, String imagem, String idMoeda, String marcaDAgua, double area,
            double largura, double altura) {
        super(idPais, valor, imagem, idMoeda);
        this.marcaDAgua = marcaDAgua;
        this.area = area;
        this.largura = largura;
        this.altura = altura;
    }

    public String getMarcaDAgua() {
        return marcaDAgua;
    }

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    void verificarAutenticidade() {
        
    }
}