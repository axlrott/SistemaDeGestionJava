package gestion.modelo.personas;

public class PersonalDeServicio extends Empleado {
	protected SeccionFacultad seccionAsignada;
	
	public PersonalDeServicio(String nombre, String apellido, Integer id, EstadoCivil estadoCivil, Integer anioIngreso, Integer numDespacho, SeccionFacultad seccionAsignada) {
		super(nombre, apellido, id, estadoCivil, anioIngreso, numDespacho);
		this.seccionAsignada = seccionAsignada;
	}
	
	public SeccionFacultad getSeccionAsignada() {
		return this.seccionAsignada;
	}
	
	public void cambioSeccionAsignada(SeccionFacultad nuevaSeccion) {
		this.seccionAsignada = nuevaSeccion;
	}

}
