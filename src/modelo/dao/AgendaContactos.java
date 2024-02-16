package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Contacto;

/**
 * Clase que implementa el interface GestionAgenda
 * además se introducen algunos datos de contactos
 */
public class AgendaContactos implements GestionAgenda {
	private String nombreAgenda;
	private ArrayList<Contacto> contactos;


	public AgendaContactos() {
		
		contactos = new ArrayList<>();
		cargardatos();
		
	}

	private void cargardatos() {
		contactos.add(new Contacto("Sara", "Molinero", "677964223", "sara@ifp.es", "Intel"));
		contactos.add(new Contacto("Mario", "García", "698964283", "mario@gmail.com", "Intel"));
		contactos.add(new Contacto("Carla", "Ballesteros", "654964213", "carla@gmail.com", "IBM"));
		contactos.add(new Contacto("Darío", "Campos", "666965523", "dario@ifp.es", "Telefónica España"));

	}


	/**
	 * Añade un nuevo contacto.
	 * @param contacto El contacto que se quiere añadir.
	 * @return true si se ha añadido correctamente, false si no se ha añadido porque ya existe uno con ese nombre.
	 */
	@Override
	public boolean altaContacto(Contacto contacto) {
		if(!contactos.contains(contacto)) {
			contactos.add(contacto);
			return true;
		}else 
			return false;
		
	}


	/**
	 * Elimina un contacto existente.
	 * @param contacto El contacto que se quiere eliminar.
	 * @return true si se ha eliminado correctamente, false si no se ha eliminado porque el contacto no existe.
	 */
	@Override
	public boolean eliminarContacto(Contacto contacto) {
		return contactos.remove(contacto);
	}


	/**
	 * Busca un contacto existente por su nombre.
	 * @param nombre El nombre del contacto que se quiere buscar.
	 * @return el contacto, o null si no se encuentra ningún contacto son ese nombre.
	 */
	@Override
	public Contacto buscarUno(String nombre) {
		Contacto contacto = new Contacto();
		contacto.setNombre(nombre);
		int pos = contactos.indexOf(contacto);
		if (pos == -1)
			return null;
		else
			return contactos.get(pos);
	}


	/**
	 *Busca un contacto existente por su teléfono.
	 * @param telefono El teléfono del contacto que se quiere buscar.
	 * @return el contacto, o null si no se encuentra ningún contacto son ese teléfono.
	 */
	@Override
	public Contacto buscarTelefono(String telefono) {

		for (Contacto contacto : contactos) {
			if (contacto.getTelefono().equals(telefono)) 
				return contacto;
			
		}
		return null;

	}


	/**
	 *Busca un contacto existente por su email.
	 * @param email El email del contacto que se quiere buscar.
	 * @return el contacto, o null si no se encuentra ningún contacto son ese email.
	 */
	@Override
	public Contacto buscarEmail(String email) {
		
		for (Contacto contacto : contactos) {
			if (contacto.getEmail().equals(email)) 
				return contacto;
			
		}
		return null;
	
	}


	/**
	 *Busca un contacto existente por los tres primeros caracteres del nombre.
	 * @param nombre Los tres primeros caracteres del nombre de los contactos que se quieren buscar.
	 * @return una lista de contactos cuyos nombres empiezan con los tres primeros caracteres del nombre.
	 */
	@Override
	public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {
		
		/*if(nombre.length() >= 3) {
			ArrayList<Contacto> cont = new ArrayList<>();
			for (Contacto contacto : contactos) {
				if () 
					cont.add(contacto);
			}
			return cont;
		}else */
			return new ArrayList <>();
		
		
	}


	/**
	 *Cambia los datos de un contacto existente, excepto el nombre.
	 * @param contacto El contacto con los nuevos datos.
	 * @return true si los datos se cambian correctamente, false si no se ha cambiado porque el contacto no existe.
	 */
	@Override
	public boolean cambiarDatos(Contacto contacto) {
		int pos = contactos.indexOf(contacto);
		if (pos == -1)
			return false;
		else {
			contactos.set(pos, contacto);
			return true;
		}
	}


	/**
	 *Busca todos los contactos que trabajan para una empresa específica.
	 * @param empresa El nombre de la empresa.
	 * @return una lista con todos los contactos de la empresa específica.
	 */
	@Override
	public ArrayList<Contacto> contactosPorEmpresa(String empresa) {
		ArrayList<Contacto> cont = new ArrayList<>();
		for (Contacto contacto : contactos) {
			if (contacto.getEmpresa().equals(empresa)) 
				cont.add(contacto);
			
		}
		return cont;
	
	}

	/*
	@Override
	public void exportarContactos(String nombreFichero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void importarContactos(String nombreFichero) {
		// TODO Auto-generated method stub
		
	}
*/
	
}
