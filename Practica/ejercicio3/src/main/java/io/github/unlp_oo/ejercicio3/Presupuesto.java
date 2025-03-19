package io.github.unlp_oo.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente){
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		this.items = new ArrayList<>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		return this.items.stream().mapToDouble(i -> i.costo()).sum();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
}
