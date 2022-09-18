package com.portfolio.mindhowl.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String empleoE;
    private String imgEmpresaE;
    private String descripcionE;
    private String fechaE;
    
    
    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String empleoE, String imgEmpresaE, String fechaE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.empleoE = empleoE;
        this.fechaE = fechaE;
        this.imgEmpresaE = imgEmpresaE;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
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


}
