package org.zabalburu.domine;

public class Proveedor {
	
	private String nombreEmpresa; 
	private String correo;
	private int cdIdentificador; 
    private int telefono;
	
	
	public Proveedor(String nombreEmpresa, String correo, int cdIdentificador, int telefono) {
		this.nombreEmpresa = nombreEmpresa;
		this.correo = correo;
		this.cdIdentificador = cdIdentificador;
		this.telefono = telefono;
	}
	public Proveedor() {
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getCdIdentificador() {
		return cdIdentificador;
	}
	public void setCdIdentificador(int cdIdentificador) {
		this.cdIdentificador = cdIdentificador;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Proveedor [nombreEmpresa=" + nombreEmpresa 
		+ ", correo=" + correo 
		+ ", cdIdentificador=" + cdIdentificador 
		+ ", telefono=" + telefono + "]";
	}
	

	

}

