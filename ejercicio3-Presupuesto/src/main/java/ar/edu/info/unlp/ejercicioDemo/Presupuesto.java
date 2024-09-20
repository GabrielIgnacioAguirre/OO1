package ar.edu.info.unlp.ejercicioDemo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
		fecha = LocalDate.now();
		this.items = new ArrayList<>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public int calcularTotal() {
		/**return this.items.stream()
				.map(items -> items.costo())
				.sum();}
		**/
		int sum = 0;
		if (!this.items.isEmpty()) {
			for (Item dato: this.items) {
				sum+= dato.costo();
			}
		}
		return sum;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
}
