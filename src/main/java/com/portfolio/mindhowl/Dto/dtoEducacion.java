
package com.portfolio.mindhowl.Dto;


import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String tituloE;
    @NotBlank
    private String fechaE;
    
    private String imgInstE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String tituloE, String fechaE, String imgInstE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.tituloE = tituloE;
        this.fechaE = fechaE;
        this.imgInstE = imgInstE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public String getImgInstE() {
        return imgInstE;
    }

    public void setImgInstE(String imgInstE) {
        this.imgInstE = imgInstE;
    }



    
}