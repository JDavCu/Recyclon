package org.zabalburu.domine;
import org.zabalburu.domine.Clientes;


public class Banco {
    private static String direccion;
    private static String nombre;
    private static int IDBanco;
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public int getIDBanco() {
        return IDBanco;
    }


    @Override
    public String toString() {
        return "Direccion=" + direccion + 
                ", nombre del banco =" + nombre + 
                ", ID del Banco=" + IDBanco;
    }

    
    
}
