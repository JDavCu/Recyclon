package org.zabalburu.domine;

import java.util.Scanner;

public class Clientes {
    private  String nombre; 
    private  String apellidos; 
    private  String dni_Nie; 
    private double importe; 
    private String correo; 
    private int telefono; 
    private String numeroDeCuenta;
    
    public Clientes(String nombre, String apellido, String dni_Nie, String correo, int telefono, String numeroDeCuenta) {
    
        this.apellidos = apellido;
        this.nombre = nombre;
        this.dni_Nie = dni_Nie;
        this.correo = correo;
        this.telefono = telefono;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    //El siguiente constructor es para una interacción base con el usuario mediante la clase Scanner


    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellidos;
    }
    public String getDni_Nie() {
        return dni_Nie;
    }
    public double getImporte() {
        return importe;
    }
    public String getCorreo() {
        return correo;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    
    
    @Override
    public String toString() {
        return  "Clientes [nombre=" + nombre + 
                ", apellido=" + apellidos + 
                ", Dni_Nie=" + dni_Nie + 
                ", importe=" + importe + 
                ", correo=" + correo + 
                ", telefono=" + telefono + 
                ", numeroDeCuenta=" + numeroDeCuenta + "]";
    }
    

    
    
}
