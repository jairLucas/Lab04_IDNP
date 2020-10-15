package com.jk.lab04_idnp;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int cui;
    private int dni;
    private int edad;

    public Estudiante(String _nombre, String _apellido, int _cui, int _dni, int _edad){
        this.apellido=_apellido;
        this.nombre=_nombre;
        this.dni=_dni;
        this.edad=_edad;
        this.cui=_cui;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getCui(){
        return cui;
    }
    public int getDni(){
        return dni;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
    public void setApellido(String _apellido){
        this.apellido=_apellido;
    }
    public void setCui(int _cui){
        this.cui=_cui;
    }
    public void setDni(int  _dni){
        this.dni=_dni;
    }
    public void setEdad(int  _edad){
        this.edad =_edad;
    }

    public String toString(){
        return this.nombre + "  " + this.apellido;
    }
}
