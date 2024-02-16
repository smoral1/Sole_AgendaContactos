package testing;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.dao.AgendaContactos;
import modelo.javabean.Contacto;

public class TestContacto {
	private static AgendaContactos agdao;

	
	static {
		agdao = new AgendaContactos();
		
	}

	public static void main(String[] args) {
		Contacto contacto = null;
		//altacontactos();
		//eliminarContacto();
		//buscarUno();
		//buscarTelefono();
		//buscarEmail();
		//buscarContactosPorTresPrimeros(); NO LO PRUEBES, QUE NO ESTÁ HECHO
		//cambiarDatos();
		contactosPorEmpresa();

	}
	public static void altacontactos() { 
		
		// Debe darse de alta:
		Contacto cont1 = new Contacto("Marta", "García", "677955223", "marta@yahoo.com", "Indra");
		
		// No debe darse de alta porque ya está creada en AgendaContactos:
		Contacto cont2 = new Contacto("Sara", "Molinero", "677964223", "sara@ifp.es", "Intel");
		
		// No debe darse de alta porque no puede haber 2 contactos con el mismo nombre:
		Contacto cont3 = new Contacto("Sara", "Marcos", "677964123", "sara@gmail.com", "Telefónica");
		
		System.out.println(cont1 + ": ¿Alta confirmada? --> " + agdao.altaContacto(cont1));
		System.err.println(cont2 +": ¿Alta confirmada? --> " + agdao.altaContacto(cont2));
		System.err.println(cont3 +": ¿Alta confirmada? --> " + agdao.altaContacto(cont3));
		
	}
	
	public static void eliminarContacto() { 
		
		Contacto contacto = agdao.buscarUno("Sara");  // Dato (nombre) que debe variar
		System.out.println("Desea eliminar a:\n" + agdao.buscarUno("Sara"));  // Dato (nombre) que debe variar
		boolean contactoEliminado = agdao.eliminarContacto(contacto);
		
		if (contactoEliminado) {
			System.out.println("Contacto eliminado.");
			System.out.println("Buscar dato eliminado:\n" + agdao.buscarUno("Sara"));  // Dato (nombre) que debe variar
			
		}else 
			System.err.println("No existe ningún contacto con ese nombre. No se han podido eliminar los datos.");
		
	}

	
	public static void buscarUno() { 
		
		// "Sara", "Molinero", "677964223", "sara@ifp.es", "Intel"
		Contacto contacto = agdao.buscarUno("Sara");  // Dato (nombre) que debe variar
		
		if (contacto != null) {
			System.out.println("El contacto que busca es: ");
			System.out.println(contacto);
		}else
			System.err.println("El contacto que busca no está dado de alta.");
	}
	
	public static void buscarTelefono() { 
		
		// "Mario", "García", "698964283", "mario@gmail.com", "Intel"
		Contacto contacto = agdao.buscarTelefono("698964283");  // Dato (telefono) que debe variar
		
		if (contacto != null) {
			System.out.println("El contacto que busca es: ");
			System.out.println(contacto);
		}else
			System.err.println("No existe ningún contacto con ese teléfono. No se han podido encontrar los datos.");
	}
	
	public static void buscarEmail() { 
		
		// "Carla", "Ballesteros", "654964213", "carla@gmail.com", "IBM"
		Contacto contacto = agdao.buscarEmail("carla@gmail.com");  // Dato (email) que debe variar
		
		if (contacto != null) {
			System.out.println("El contacto que busca es: ");
			System.out.println(contacto);
		}else
			System.err.println("No existe ningún contacto con ese email. No se han podido encontrar los datos.");
	}
	
	public static void buscarContactosPorTresPrimeros() { 
		
		// NO LO PRUEBES, QUE NO ESTÁ HECHO
		
		
		// "Darío", "Campos", "666965523", "dario@ifp.es", "Telefónica España"
		ArrayList<Contacto> contacto = agdao.buscarContactosPorTresPrimeros("Darí");  // Dato (nombre) que debe variar
		System.out.println(contacto);
		
	}
	
	public static void cambiarDatos() { 
		
		Contacto contacto = new Contacto("Sara", "Pez", "655745259", "epez@ifp.es", "IBM");
		boolean contactoCambio = agdao.cambiarDatos(contacto);
		System.out.println("Desea cambiar los datos de:\n" + agdao.buscarUno("Sara"));
		
		if (contactoCambio) {
			System.out.println("Datos cambiados.");
			System.out.println(agdao.cambiarDatos(contacto));
			System.out.println("Datos introducidos:\n" + agdao.buscarUno("Sara"));
		} else {
			System.out.println("No existe ningún contacto con ese nombre. No se han podido cambiar los datos.");
		}
		
	}
	
	public static void contactosPorEmpresa() { 
		
		// "Mario", "García", "698964283", "mario@gmail.com", "Intel"
		// "Sara", "Molinero", "677964223", "sara@ifp.es", "Intel"
		ArrayList<Contacto> cont = agdao.contactosPorEmpresa("Intel");  // Dato (empresa) que debe variar
		
		for (Contacto contacto : cont) {
			System.out.println(contacto);
		}
		
		
	}
		
	
}
