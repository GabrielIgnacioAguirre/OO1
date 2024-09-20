package ar.edu.info.unlp.ejercicioDemo;

public class Item {
	private	String detalle;
	private int cantidad;
	private int costoUnitario;
	
	public Item(String detalle, int cantidad, int costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	public int costo() {
		return this.cantidad * this.costoUnitario;
	}
	public int getCostoUnitario() {
		return this.costoUnitario;
	}
}
