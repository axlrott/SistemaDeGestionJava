package gestion.modelo.personas;

abstract class Empleado extends Persona {
	protected Integer anioIngreso;
	protected Integer numDespacho;
	
	protected Empleado(String nombre, String apellido, Integer id, EstadoCivil estadoCivil, Integer anioIngreso, Integer numDespacho) {
		super(nombre, apellido, id, estadoCivil);
		if (anioIngreso < 1900) {
			throw new AnioIncorrectoException();
		}
		this.anioIngreso = anioIngreso;
		this.numDespacho = numDespacho;
	}
	
	public Integer getAnioIngreso() {
		return this.anioIngreso;
	}
	
	public void cambioAnioIngreso(Integer nuevoAnioIngreso) {
		if (nuevoAnioIngreso < 1900) {
			throw new AnioIncorrectoException();
		}
		this.anioIngreso = nuevoAnioIngreso;
	}
	
	public Integer getNumDespacho() {
		return this.numDespacho;
	}
	
	public void cambioNumDespacho(Integer nuevoNumDespacho) {
		this.numDespacho = nuevoNumDespacho;
	}
}
