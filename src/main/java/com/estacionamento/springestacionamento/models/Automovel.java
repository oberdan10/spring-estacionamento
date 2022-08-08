package com.estacionamento.springestacionamento.models;

import javax.persistence.*;

@Entity
@Table(name="tab_automovel")
public class Automovel {
    @Id
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    @Enumerated(EnumType.STRING)
    private ETipoAutomovel tipoAutomovel;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public ETipoAutomovel getTipoAutomovel() {
        return tipoAutomovel;
    }

    public void setTipoAutomovel(ETipoAutomovel tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }
}
