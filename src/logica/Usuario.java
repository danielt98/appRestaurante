/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author JuanCamilo
 */
public class Usuario {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String fechaNaci;
    private String user;
    private String password;
    private String genero;
    private String tiquetera;

    public String getTiquetera() {
        return tiquetera;
    }

    public Usuario(String cedula, String nombres, String apellidos, String fechaNaci, String user, String password,String genero,String Tiquetera) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNaci = fechaNaci;
        this.user = user;
        this.password = password;
        this.genero=genero;
        this.tiquetera=Tiquetera;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
}
