package modelo.javabean;

import java.util.Objects;

/**
 * Clase que representa un contacto.
 * @author Sole Moral
 */
public class Contacto {
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	private String empresa;

	/**
	 * Constructor entero de la clase Contacto.
	 * @param nombre Nombre del contacto.
	 * @param apellidos Apellidos del contacto.
	 * @param telefono Teléfono del contacto.
	 * @param email Email del contacto.
	 * @param empresa Nombre de la empresa donde trabaja el contacto.
	 */
	public Contacto(String nombre, String apellidos, String telefono, String email, String empresa) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.empresa = empresa;
	}

	/**
	 * Constructor sin nada de la clase Contacto.
	 */
	public Contacto() {
		super();
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	/**
	 *El método hashCode() complementa al método equals,
	 * sirve para comparar objetos de una forma más rápida en estruturas.
	 * @return el hashCode del nombre del contacto
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	/**
	 * Método para verificar si dos contactos son iguales por el nombre
	 * @param obj Objeto que se va a comparar.
	 * @return true si los nombres son iguales, false si no lo son
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email
				+ ", empresa=" + empresa + "]";
	}

}
