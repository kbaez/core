package com.resfull.core.entity;

import javax.persistence.*;

@Entity
@Table
public class Usuario {
    @GeneratedValue
    @Id
    @Column(name="ID")
    private long id;

    @Column(name="USUARIO")
    private String usuario;

    @Column(name="CONTRASENA")
    private String contrasena;

    @Column(name="ROL")
    public byte rol;

    @Column(name="ACTIVO")
    public boolean activo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte getRol() {
        return rol;
    }

    public void setRol(byte rol) {
        this.rol = rol;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
