package org.zabalburu.domine;
import org.zabalburu.domine.Clientes;



public class Banco {

    private int IDBanco;
    private String nombre;
    private String telefono;
    private String direccion;

    public Banco (int IDBanco, String nombre, String telefono, String direccion) {
        this.IDBanco = IDBanco;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIDBanco() {
        return IDBanco;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setIDBanco(int IDBanco) {
        this.IDBanco = IDBanco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    @Override
    public String toString() {
        return  "Información sobre su banco" +
                "ID de su banco: " + IDBanco +
                "Nombre: " + nombre +
                "Telefono: " + telefono +
                "Direccion: " + direccion;
    }
}
