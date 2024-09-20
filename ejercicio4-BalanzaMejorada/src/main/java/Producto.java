

public class Producto {
	private double peso;
	private double pesoPorKilo;
	private String descripcion;
	
	/*
	 * Permite instanciar la clase Producto.
	 * Luego de invocarla, los valores peso,peroPorKilo y la descripcion tendran sus
	 * valores correspondientes que fueron ingresados por parametro-
	 */
	public Producto(double peso,double pesoPorKilo,String descripcion ){
		this.peso = peso;
		this.pesoPorKilo = pesoPorKilo;
		this.descripcion = descripcion;
	}
	/*
	 * retorna el valor de peso multiplicado por el peso por kilo.
	 */
	public double getPrecio() {
		return this.peso * this.pesoPorKilo;
	}
	
	/*
	 * getters y setters
	 */
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPesoPorKilo() {
		return pesoPorKilo;
	}
	public void setPesoPorKilo(double pesoPorKilo) {
		this.pesoPorKilo = pesoPorKilo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
