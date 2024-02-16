package modelo.dao;

import java.util.ArrayList;
import modelo.javabean.Contacto;

public interface GestionAgenda {
	
	
	boolean altaContacto(Contacto contacto);
	boolean eliminarContacto(Contacto contacto);
	Contacto buscarUno(String nombre);
	Contacto buscarTelefono(String Telefono);
	Contacto buscarEmail(String Email);
	ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre);
	boolean cambiarDatos(Contacto contacto);
	ArrayList<Contacto> contactosPorEmpresa(String empresa);
	//void exportarContactos(String nombreFichero);
	//void importarContactos(String nombreFichero);
	
}
