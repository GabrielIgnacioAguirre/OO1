package ar.edu.info.unlp.ejercicioBalanza.ejercicioBalanza;


import ar.edu.info.unlp.ejercicioBalanza.ejercicioBalanza.impl.Balanza;
import ar.edu.info.unlp.ejercicioBalanza.ejercicioBalanza.impl.Producto;
import ar.edu.info.unlp.ejercicioBalanza.ejercicioBalanza.impl.Ticket;

public class ejercicio2Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balanza balanza;
		Producto producto1;
		Producto producto2;
		Producto producto3;
		Producto producto4;
		Ticket ticket;
		
		balanza = new Balanza();
		producto1 = new Producto(1.2,1,"objeto1");
		producto2 = new Producto(1.5,2,"objeto2");
		producto3 = new Producto(1.7,3,"objeto3");
		producto4 = new Producto(2.0,4,"objeto4");
		
		balanza.agregarProducto(producto1);
		balanza.agregarProducto(producto2);
		balanza.agregarProducto(producto3);
		balanza.agregarProducto(producto4);
		
		ticket = balanza.emitirTicket();
		
		System.out.println(ticket.toString());
	}

}
