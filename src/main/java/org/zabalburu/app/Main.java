package org.zabalburu.app;

import java.util.Scanner;

import org.zabalburu.domine.Clientes;

public class Main {
    public static void main(String[] args) {

        Scanner tecladoScanner = new Scanner(System.in);

        System.out.println("----Nueva Cuenta----");
        System.out.println("-------------------");
        System.out.print("Nombre: ");
        String nombre = tecladoScanner.nextLine();
        while (nombre.isBlank() || nombre == null) {
            System.out.print("Este campo es obligatorio. Introduce el nombre: ");
            nombre = tecladoScanner.nextLine();
        }
        System.out.print("Apellidos: ");
        String apellidos = tecladoScanner.nextLine();
        while (apellidos.isBlank() || apellidos == null) {
            System.out.print("Este campo es obligatorio. Introduce los apellidos: ");
            apellidos = tecladoScanner.nextLine();
        }
        System.out.print("Dni/Nie : ");
        String dni_Nie = tecladoScanner.nextLine().trim();
        while (dni_Nie.isBlank() || dni_Nie == null) {
            System.out.print("Este campo es obligatorio. Introduce el Dni/Nie: ");
            dni_Nie = tecladoScanner.nextLine().trim();
        }
        System.out.print("Telefono: ");
        int telefono = verificarNumero(tecladoScanner);

        System.out.print("Email: ");
        String correo = tecladoScanner.nextLine().trim();
        while(correo.isBlank() || correo == null ){
            System.out.print("Campo Obligatorio. Introduce el Email: ");
            correo = tecladoScanner.nextLine().trim();
        }
        System.out.print("NºCuenta: ");
        String numeroDeCuenta = tecladoScanner.nextLine().trim();
        while(correo.isBlank() || correo == null ){
            System.out.print("Campo Obligatorio. Introduce el NºCuenta: ");
            correo = tecladoScanner.nextLine().trim();
        }
        }

    public static int verificarNumero(Scanner tecladoScanner) {
        while (true) {
            try {
                
                int opcion = Integer.parseInt(tecladoScanner.nextLine().trim());
                String cantidad = Integer.toString(opcion);
                
                if (cantidad.length() > 2 && cantidad.length() <= 9) {
                    return opcion;
                }

            } catch (NumberFormatException e) {

            }
            System.out.print("Opcion no valida. Introduce el Numero de Telefono: ");
    
        }
    }

}
