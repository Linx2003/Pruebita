package com.example.taller3;

import java.io.Serializable;

public class Persona implements Serializable {
    private String codigo;
    private String correo;

    public Persona(String codigo, String correo) {
        this.codigo = codigo;
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCorreo() {
        return correo;
    }
}
