package modelo.dao;

import java.util.ArrayList;
import modelo.javabean.Contacto;

/**
 * Interface que define las operaciones que se pueden realizar en AgendaContactos
 */
public interface GestionAgenda {


	/**
	 * Añade un nuevo contacto.
	 * @param contacto El contacto que se quiere añadir.
	 * @return true si se ha añadido correctamente, false si no se ha añadido porque ya existe uno con ese nombre.
	 */
	boolean altaContacto(Contacto contacto);


	/**
	 * Elimina un contacto existente.
	 * @param contacto El contacto que se quiere eliminar.
	 * @return true si se ha eliminado correctamente, false si no se ha eliminado porque el contacto no existe.
	 */
	boolean eliminarContacto(Contacto contacto);


	/**
	 * Busca un contacto existente por su nombre.
	 * @param nombre El nombre del contacto que se quiere buscar.
	 * @return el contacto, o null si no se encuentra ningún contacto son ese nombre.
	 */
	Contacto buscarUno(String nombre);


	/**
	 *Busca un contacto existente por su teléfono.
	 * @param telefono El teléfono del contacto que se quiere buscar.
	 * @return el contacto, o null si no se encuentra ningún contacto son ese teléfono.
	 */
	Contacto buscarTelefono(String telefono);


	/**
	 *Busca un contacto existente por su email.
	 * @param email El email del contacto que se quiere buscar.
	 * @return el contacto, o null si no se encuentra ningún contacto son ese email.
	 */
	Contacto buscarEmail(String email);


	/**
	 *Busca un contacto existente por los tres primeros caracteres del nombre.
	 * @param nombre Los tres primeros caracteres del nombre de los contactos que se quieren buscar.
	 * @return una lista de contactos cuyos nombres empiezan con los tres primeros caracteres del nombre.
	 */
	ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre);


	/**
	 *Cambia los datos de un contacto existente, excepto el nombre.
	 * @param contacto El contacto con los nuevos datos.
	 * @return true si los datos se cambian correctamente, false si no se ha cambiado porque el contacto no existe.
	 */
	boolean cambiarDatos(Contacto contacto);


	/**
	 *Busca todos los contactos que trabajan para una empresa específica.
	 * @param empresa El nombre de la empresa.
	 * @return una lista con todos los contactos de la empresa específica.
	 */
	ArrayList<Contacto> contactosPorEmpresa(String empresa);

	//void exportarContactos(String nombreFichero);
	//void importarContactos(String nombreFichero);
	
}
