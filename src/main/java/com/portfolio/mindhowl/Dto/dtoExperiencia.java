
package com.portfolio.mindhowl.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String fechaE;
    @NotBlank
    private String empleoE;
    
    private String imgEmpresaE;
    
    
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String fechaE, String empleoE, String imgEmpresaE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaE = fechaE;
        this.empleoE = empleoE;
        this.imgEmpresaE = imgEmpresaE;
    }


    //Getters & Setters

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

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public String getEmpleoE() {
        return empleoE;
    }

    public void setEmpleoE(String empleoE) {
        this.empleoE = empleoE;
    }

    public String getImgEmpresaE() {
        return imgEmpresaE;
    }

    public void setImgEmpresaE(String imgEmpresaE) {
        this.imgEmpresaE = imgEmpresaE;
    }

 
}
