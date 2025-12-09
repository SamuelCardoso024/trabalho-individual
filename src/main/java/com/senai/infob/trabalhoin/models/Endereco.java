package com.senai.infob.trabalhoin.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="localidade")
    private Integer localidade;

    @Column(name="cep")
    private String cep;

    @Column(name="complemento")
    private String complemento;
    
    @Column(name="bairro")
    private String bairro;
    
    
    @Column(name="referencia")
    private String referencia;
    
    
    public Endereco() {
    }


    public Endereco(Integer id, String logradouro, Integer localidade, String cep, String complemento, String bairro,
            String referencia) {
        this.id = id;
        this.logradouro = logradouro;
        this.localidade = localidade;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
        this.referencia = referencia;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getLogradouro() {
        return logradouro;
    }


    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    public Integer getLocalidade() {
        return localidade;
    }


    public void setLocalidade(Integer localidade) {
        this.localidade = localidade;
    }


    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public String getComplemento() {
        return complemento;
    }


    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getReferencia() {
        return referencia;
    }


    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}
