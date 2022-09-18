
package com.portfolio.mindhowl.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String tituloE;
    private String fechaE;
    private String imgInstE;

    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE, String tituloE, String fechaE, String imgInstE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.tituloE= tituloE;
        this.fechaE= fechaE;
        this.imgInstE= imgInstE;
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