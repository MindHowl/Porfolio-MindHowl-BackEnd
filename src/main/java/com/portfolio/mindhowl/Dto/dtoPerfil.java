
package com.portfolio.mindhowl.Dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class dtoPerfil {
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombreCompleto;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String titulo;
    
    @NotNull
    private String img;
    @NotNull
    @Size(min = 1, max = 1000, message = "no cumple con la longitud")
    private String descripcion;

    private String formspree;
    private String facebook;
    private String github;
    private String instagram;
    private String linkedin;
    private String stackoverflow;

    public dtoPerfil() {
    }

    public dtoPerfil(String nombreCompleto, String titulo, String img, String descripcion, String formspree, String facebook, String github, String instagram, String linkedin, String stackoverflow) {
        this.nombreCompleto = nombreCompleto;
        this.titulo = titulo;
        this.img = img;
        this.descripcion = descripcion;
        this.formspree = formspree;
        this.facebook = facebook;
        this.github = github;
        this.instagram = instagram;
        this.linkedin = linkedin;
        this.stackoverflow = stackoverflow;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFormspree() {
        return formspree;
    }

    public void setFormspree(String formspree) {
        this.formspree = formspree;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getStackoverflow() {
        return stackoverflow;
    }

    public void setStackoverflow(String stackoverflow) {
        this.stackoverflow = stackoverflow;
    }
    
    
    
    
}
