package com.prueba.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
    public static final String TABLE_NAME = "Usuario";

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long IDUsuario;

    private String nombre;

    private Long documento;

    private String FechaNacimiento;


    public Usuario() {
    }

    public Usuario(Long IDUsuario, String nombre, Long documento, String FechaNacimiento) {
        this.IDUsuario = IDUsuario;
        this.nombre = nombre;
        this.documento = documento;
        this.FechaNacimiento = FechaNacimiento;
    }

    public Long getIDUsuario() {
        return this.IDUsuario;
    }

    public void setIDUsuario(Long IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDocumento() {
        return this.documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getFechaNacimiento() {
        return this.FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

}
