package com.prueba.web.dto;

public class UsuarioDto {

    private Long IDUsuario;

    private String nombre;

    private Long documento;

    private String FechaNacimiento;


    public UsuarioDto() {
    }


    public UsuarioDto(Long IDUsuario, String nombre, Long documento, String FechaNacimiento) {
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
