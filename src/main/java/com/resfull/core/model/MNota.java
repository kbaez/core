package com.resfull.core.model;

import com.resfull.core.entity.Nota;

public class MNota {

    private long id;
    private String nombre;
    private String titulo;
    private String contenido;

    public MNota(Nota nota){
        this.id = nota.getId();
        this.nombre = nota.getNombre();
        this.titulo = nota.getTitulo();
        this.contenido = nota.getContenido();
    }

    public MNota(String nombre, String titulo, String contenido) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
