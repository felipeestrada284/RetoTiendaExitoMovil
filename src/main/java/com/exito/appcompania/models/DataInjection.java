package com.exito.appcompania.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker();

    private final String correoLogin, contraseniaLogin, nombres,
            apellidos, documento, celular, correo;

    public DataInjection(){
        this.correoLogin = "felipeestrada96@outlook.es";
        this.contraseniaLogin = "Jottan1994*";
        this.nombres = faker.name().firstName();
        this.apellidos = faker.name().lastName();
        this.documento = faker.number().digits(10);
        this.celular = "3008835747";
        this.correo = faker.internet().emailAddress();
    }

    public String getCorreoLogin() {
        return correoLogin;
    }

    public String getContraseniaLogin() {
        return contraseniaLogin;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

}
