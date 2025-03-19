package io.github.unlp_oo.ejercicio4;

import java.util.List;

public abstract class ManejarProductos {
	protected List<Producto> productos;
	
	protected ManejarProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	protected double getPesoTotal() {
		return this.productos.stream().mapToDouble(p -> p.getPeso()).sum();
	}
	
	protected int getCantidadDeProductos() {
		return (int) productos.stream().count();
	}

	protected List<Producto> getProductos() {
		return productos;
	}

	protected void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
