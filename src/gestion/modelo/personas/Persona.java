package gestion.modelo.personas;

abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected Integer id;
	protected EstadoCivil estadoCivil;
	
	protected Persona(String nombre, String apellido, Integer id, EstadoCivil estado_civil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.estadoCivil = estado_civil;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void cambioNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void cambioApellido(String nuevoApellido) {
		this.apellido = nuevoApellido;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void cambioId(Integer nuevoId) {
		this.id = nuevoId;
	}
	
	public EstadoCivil getEstadoCivil() {
		return this.estadoCivil;
	}
	
	public void cambioEstadoCivil(EstadoCivil nuevoEstado) {
		this.estadoCivil = nuevoEstado;
	}
}
