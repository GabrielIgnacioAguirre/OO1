package io.github.unlp_oo.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		super();
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}

	public double costo() {
		return cantidad * costoUnitario;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	
}
