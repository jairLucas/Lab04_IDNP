package com.jk.lab04_idnp;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private String nombre, apellido, cui;

    public Estudiante(){

    }
    public Estudiante(String nombre, String apellido, String cui){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cui=cui;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getCui(){
        return cui;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setCui(String cui){
        this.cui=cui;
    }
    public String toString(){
        return nombre+apellido+cui;
    }
}