package gestion.modelo.personas;

public class Profesor extends Empleado {
	protected DepartamentoFacultad departamentoAsignado;
	
	public Profesor(String nombre, String apellido, Integer id, EstadoCivil estadoCivil, Integer anioIngreso, Integer numDespacho, DepartamentoFacultad departamentoAsignado) {
		super(nombre, apellido, id, estadoCivil, anioIngreso, numDespacho);
		this.departamentoAsignado = departamentoAsignado;
	}
	
	public DepartamentoFacultad getDepartamentoAsignado() {
		return this.departamentoAsignado;
	}
	
	public void cambioDepartamentoAsignado(DepartamentoFacultad nuevoDepartamento) {
		this.departamentoAsignado = nuevoDepartamento;
	}
}
