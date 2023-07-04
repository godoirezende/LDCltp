package br.edu.ifsp.javafx.aulas.model;

class Leitura {
    private String dataLeitura;
    private String status;
    private String idUsuario;
    private String idMoeda;

    public String getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(String dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdMoeda() {
        return idMoeda;
    }

    public void setIdMoeda(String idMoeda) {
        this.idMoeda = idMoeda;
    }
}