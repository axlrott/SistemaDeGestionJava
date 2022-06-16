package gestion.modelo.personas;

public class Estudiante extends Persona {
	protected CursosFacultad cursoAsignado;
	
	public Estudiante(String nombre, String apellido, Integer id, EstadoCivil estadoCivil, CursosFacultad cursoAsignado) {
		super(nombre, apellido, id, estadoCivil);
		this.cursoAsignado = cursoAsignado;
	}
	
	public CursosFacultad getCursoAsignado() {
		return this.cursoAsignado;
	}
	
	public void cambioCurso(CursosFacultad nuevoCurso) {
		this.cursoAsignado = nuevoCurso;
	}
	
}
