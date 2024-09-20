package ar.edu.info.unlp.ejercicioBalanzaTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicioBalanza.*;
import ar.edu.info.unlp.ejercicioBalanza.ejercicioBalanza.impl.Balanza;
import ar.edu.info.unlp.ejercicioBalanza.ejercicioBalanza.impl.Producto;
import ar.edu.info.unlp.ejercicioBalanza.ejercicioBalanza.impl.Ticket;

/**
 * A BalanzaTest is a test class for testing the behavior of Wallpost
 */
public class BalanzaTest {
	Balanza balanza;
	Producto producto1;
	Producto producto2;
	Producto producto3;
	Producto producto4;
	Ticket ticket;
	
	@BeforeEach
	void setUp() throws Exception{
		balanza = new Balanza();
		producto1 = new Producto(1.2,1,"objeto1");
		producto2 = new Producto(1.5,2,"objeto2");
		producto3 = new Producto(1.7,3,"objeto3");
		producto4 = new Producto(2.0,4,"objeto4");
	}
	@Test
	void testCreation(){
		assertEquals(1.2,producto1.getPeso());
		assertEquals(2,producto2.getPesoPorKilo());
		assertEquals("objeto3",producto3.getDescripcion());
	}
	
	@Test
	void agregarProductos() {
		balanza.agregarProducto(producto1);
		assertEquals(1,balanza.getCantidadDeProductos());
		assertEquals(1.2,balanza.getPesoTotal());
		assertEquals(1.2,balanza.getPrecioTotal());
	}
	
	@Test
	void ponerEnCeroTest() {
		balanza.ponerEnCero();
		assertEquals(0,balanza.getCantidadDeProductos());
		assertEquals(0,balanza.getPesoTotal());
		assertEquals(0,balanza.getPrecioTotal());
	}
	
	@Test
	void agregarProductosRestantes() {
		balanza.agregarProducto(producto1);
		balanza.agregarProducto(producto2);
		balanza.agregarProducto(producto3);
		balanza.agregarProducto(producto4);
	}
	
	@Test
	void emitirTicketTest() {
		Ticket ticket = balanza.emitirTicket();
		assertEquals(ticket.getPrecioTotal(),balanza.getPrecioTotal()+balanza.getPrecioTotal()*0.21);
		assertEquals(ticket.getPesoTotal(),balanza.getPesoTotal());
		assertEquals(ticket.getCantidadDeProductos(),balanza.getCantidadDeProductos());
	}
	
	@Test
	void toStringTest() {
		balanza.toString();
	}
}
