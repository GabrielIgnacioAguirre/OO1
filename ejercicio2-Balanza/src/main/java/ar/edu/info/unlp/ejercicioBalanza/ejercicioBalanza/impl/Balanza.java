package ar.edu.info.unlp.ejercicioBalanza.ejercicioBalanza.impl;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	/*
	* Permite construir una instancia del WallpostImpl.
	* Luego de la invocación, manda un mensaje al metodo ponerEnCero.
	*/
	public Balanza() {
		this.ponerEnCero();
	}
	/*
	* Luego de la invocación, debe tener en cantidadDeProdutos, precioTotal,
	* PesoTotal en 0.
	*/
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	/*
	 * 
	 */
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
	}
	/*
	 * 
	 */
	public Ticket emitirTicket(){
		return new Ticket(this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
	}
	/*
	 * setters y getters
	 */
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
}
