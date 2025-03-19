package io.github.unlp_oo.ejercicio4;

import java.util.ArrayList;

public class Balanza extends ManejarProductos {
	
	public Balanza() {
		super(new ArrayList<Producto>());
	}
	
	protected double getPrecioTotal() {
		return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}
	
	public void ponerEnCero() {
		this.productos.removeAll(productos);
	}
	
	protected void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	
	protected Ticket emitirTicket() {
		return new Ticket(new ArrayList<>(this.productos),this.getPrecioTotal());
	}	
	
}
