package org.zabalburu.domine;



public class Clientes {
    private static int Identificador;
    private String nombre;
    private String apellidos;
    private String dni_Nie;
    private double importe;
    private String correo;
    private int telefono;
    private String numeroDeCuenta;

    public Clientes(String nombre, String apellido, String dni_Nie, String correo, int telefono,
            String numeroDeCuenta) {

        this.apellidos = apellido;
        this.nombre = nombre;
        this.dni_Nie = dni_Nie;
        this.correo = correo;
        this.telefono = telefono;
        this.numeroDeCuenta = numeroDeCuenta;
        Identificador++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni_Nie(String dni_Nie) {
        this.dni_Nie = dni_Nie;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
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
        return "Clientes [nombre=" + nombre +
                ", apellido=" + apellidos +
                ", Dni_Nie=" + dni_Nie +
                ", importe=" + importe +
                ", correo=" + correo +
                ", telefono=" + telefono +
                ", numeroDeCuenta=" + numeroDeCuenta + "]";
    }

}
