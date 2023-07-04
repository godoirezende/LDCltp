package br.edu.ifsp.javafx.aulas.model;

public abstract class MoedaAbstrata {
    private String idPais;
    private double valor;
    private String imagem;
    private String idMoeda;

    abstract void verificarAutenticidade();

    
    public MoedaAbstrata(String idPais, double valor, String imagem, String idMoeda) {
        this.idPais = idPais;
        this.valor = valor;
        this.imagem = imagem;
        this.idMoeda = idMoeda;
    }


    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getIdMoeda() {
        return idMoeda;
    }

    public void setIdMoeda(String idMoeda) {
        this.idMoeda = idMoeda;
    }
}
