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

    public Clientes(Scanner tecladoScanner){
        System.out.println("----New account----");
        System.out.println("-------------------");
        System.out.print("Name: ");
         String nombre = tecladoScanner.nextLine().trim();
        while (nombre.isBlank() || nombre == null){
            System.out.print("Este campo es obligatorio. Introduce el nombre: ");
             nombre = tecladoScanner.nextLine().trim();
        }
        System.out.print("Last Name: ");
        String apellidos = tecladoScanner.nextLine().trim();
        while (apellidos.isBlank() || apellidos   == null){
            System.out.print("Este campo es obligatorio. Introduce los apellidos: ");
            apellidos = tecladoScanner.nextLine().trim();
        }
        System.out.print("Dni/Nie : ");
         String dni_Nie = tecladoScanner.nextLine().trim();
        while(dni_Nie.isBlank() || dni_Nie == null){
            System.out.print("Este campo es obligatorio. Introduce el Dni/Nie: ");
            dni_Nie = tecladoScanner.nextLine().trim();
        }
        System.out.println("Number Phone: ");
        int telefono = verificarNumero(tecladoScanner);
        }





    

    public static int verificarNumero(Scanner tecladoScanner){
        while(true){
            try{
                int opcion = Integer.parseInt(tecladoScanner.nextLine().trim());
                    if (opcion >1 && opcion <=9){
                        return opcion;
                    }
                    
                }catch(NumberFormatException e) {

                }
            System.out.print("Opcion no valida. Introduce el Numero de Telefono: ");
        }
    }

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
