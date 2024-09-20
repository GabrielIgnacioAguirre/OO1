package ar.edu.info.unlp.ejercicioBalanza.ejercicioBalanza.impl;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha = LocalDate.now();
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	/*
	 * 
	 */
	public Ticket(int cantidadDeProductos,double pesoTotal,double precioTotal){
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal + this.Impuestos(precioTotal);
	}
	
	/*
	 * 
	 */
	private double Impuestos(double precioTotal){
		return precioTotal * 0.21;
	}
	   public String toString() {
	        return "WallPost {" +
	            "Cantidad de productos: " + getCantidadDeProductos() +
	            ", Fecha: '" + getFecha() + "'" +
	            ", Peso Total: '" + getPesoTotal() + "'" +
	            ", Precio total: '" + getPrecioTotal() + "'" +
	            "}";
	    }
	   /*
	    * getters y setters
	    */

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	   
}
