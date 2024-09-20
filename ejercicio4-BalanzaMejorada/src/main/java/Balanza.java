import java.util.List;

public class Balanza {
	private int cantidadDeProductos;
	private List<Producto> productos;
	
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
	}
	/*
	 * 
	 */
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
		this.cantidadDeProductos++;
	}
	/*
	 * 
	 */
	private double pesoTotal() {
		return this.productos.stream()
				.mapToDouble(productos -> productos.getPeso()).
				sum();
	}
	/*
	 * 
	 */
	private double precioTotal() {
		return this.productos.stream()
				.mapToDouble(productos -> productos.getPrecio()).
				sum();
	}
	/*
	 * 
	 */
	public Ticket emitirTicket(){
		return new Ticket(this.cantidadDeProductos,this.pesoTotal(),this.precioTotal());
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

}
