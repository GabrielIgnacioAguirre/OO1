package io.github.unlp_oo.ejercicio4;

import java.time.LocalDate;
import java.util.List;

public class Ticket extends ManejarProductos {
	private LocalDate fecha;
	private double precioTotal;
	
	public Ticket(List<Producto> productos,Double precioTotal) {
		super(productos);
		this.fecha = LocalDate.now();
		this.precioTotal = precioTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
}
	
	public double impuesto() {
		return (this.precioTotal * 0.21);
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
}
