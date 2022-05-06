package com.android.proyecto014eliminaragregarrecyclerview;

public class Persona {
    
    private String nombre;
    private String telefono;

    //Creamos el constructor el cual es el encargado de inicializar los componenets

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public Persona(){

    }

    //Creamos los metodos setters and gettes para enviar y recibir la información
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
