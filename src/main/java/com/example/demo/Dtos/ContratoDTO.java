package com.example.demo.Dtos;

import java.util.Date;
public class ContratoDTO {
    private Long id;
    private String identificador;
    private Double valor;
    private String nombreContratante;
    private String documentoContratante;
    private String nombreContratista;
    private String documentoContratista;
    private Date fechaInicial;
    private Date fechaFinal;
    private Long entidadId;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getIdentificador() { return identificador; }
    public void setIdentificador(String identificador) { this.identificador = identificador; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public String getNombreContratante() { return nombreContratante; }
    public void setNombreContratante(String nombreContratante) { this.nombreContratante = nombreContratante; }

    public String getDocumentoContratante() { return documentoContratante; }
    public void setDocumentoContratante(String documentoContratante) { this.documentoContratante = documentoContratante; }

    public String getNombreContratista() { return nombreContratista; }
    public void setNombreContratista(String nombreContratista) { this.nombreContratista = nombreContratista; }

    public String getDocumentoContratista() { return documentoContratista; }
    public void setDocumentoContratista(String documentoContratista) { this.documentoContratista = documentoContratista; }

    public Date getFechaInicial() { return fechaInicial; }
    public void setFechaInicial(Date fechaInicial) { this.fechaInicial = fechaInicial; }

    public Date getFechaFinal() { return fechaFinal; }
    public void setFechaFinal(Date fechaFinal) { this.fechaFinal = fechaFinal; }

    public Long getEntidadId() { return entidadId; }
    public void setEntidadId(Long entidadId) { this.entidadId = entidadId; }
}