package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Contacto;


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

	@Override
	public boolean altaContacto(Contacto contacto) {
		if(!contactos.contains(contacto)) {
			contactos.add(contacto);
			return true;
		}else 
			return false;
		
	}

	@Override
	public boolean eliminarContacto(Contacto contacto) {
		return contactos.remove(contacto);
	}

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
	

	@Override
	public Contacto buscarTelefono(String telefono) {

		for (Contacto contacto : contactos) {
			if (contacto.getTelefono().equals(telefono)) 
				return contacto;
			
		}
		return null;

	}

	@Override
	public Contacto buscarEmail(String email) {
		
		for (Contacto contacto : contactos) {
			if (contacto.getEmail().equals(email)) 
				return contacto;
			
		}
		return null;
	
	}

	
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
