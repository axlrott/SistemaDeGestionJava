package gestion.tests;

import org.junit.Assert;
import org.junit.Test;

import gestion.modelo.personas.*;


public class EstudianteTests {
	String NOMBRE = "Agustin";
	String APELLIDO = "Carmona";
	Integer ID = 16616;
	EstadoCivil ESTADOCIVIL = EstadoCivil.SOLTERO;
	CursosFacultad CURSOASIGNADO = CursosFacultad.ALGEBRA;
	
	@Test
	public void test01CrearEstudianteYVerificarAtributos() {
		Estudiante estudiante = new Estudiante(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, CURSOASIGNADO);
		
		Assert.assertEquals(NOMBRE, estudiante.getNombre());
		Assert.assertEquals(APELLIDO, estudiante.getApellido());
		Assert.assertEquals(ID, estudiante.getId());
		Assert.assertEquals(ESTADOCIVIL, estudiante.getEstadoCivil());
		Assert.assertEquals(CURSOASIGNADO, estudiante.getCursoAsignado());
	}
	
	@Test
	public void test02EstudianteCambiarNombre() {
		Estudiante estudiante = new Estudiante(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, CURSOASIGNADO);
		Assert.assertEquals(NOMBRE, estudiante.getNombre());
		
		String nuevo_nombre = "Gabriel";
		estudiante.cambioNombre(nuevo_nombre);
		
		Assert.assertNotEquals(NOMBRE, estudiante.getNombre());
		Assert.assertEquals(nuevo_nombre, estudiante.getNombre());
		
		nuevo_nombre = "Matias";
		Assert.assertNotEquals(nuevo_nombre, estudiante.getNombre());
		
		estudiante.cambioNombre(nuevo_nombre);
		Assert.assertEquals(nuevo_nombre, estudiante.getNombre());
	}
	
	@Test
	public void test03EstudianteCambiarApellido() {
		Estudiante estudiante = new Estudiante(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, CURSOASIGNADO);
		Assert.assertEquals(APELLIDO, estudiante.getApellido());
		
		String nuevo_apellido = "Miranda";
		estudiante.cambioApellido(nuevo_apellido);
		
		Assert.assertNotEquals(APELLIDO, estudiante.getApellido());
		Assert.assertEquals(nuevo_apellido, estudiante.getApellido());
		
		nuevo_apellido = "Rodriguez";
		Assert.assertNotEquals(nuevo_apellido, estudiante.getApellido());
		
		estudiante.cambioApellido(nuevo_apellido);
		Assert.assertEquals(nuevo_apellido, estudiante.getApellido());
	}
	
	@Test
	public void test04EstudianteCambiarId() {
		Estudiante estudiante = new Estudiante(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, CURSOASIGNADO);
		Assert.assertEquals(ID, estudiante.getId());
		
		Integer nueva_id = 74639;
		estudiante.cambioId(nueva_id);
		Assert.assertNotEquals(ID, estudiante.getId());
		Assert.assertEquals(nueva_id, estudiante.getId());
		
		Integer otra_id = 993732;
		estudiante.cambioId(otra_id);
		Assert.assertNotEquals(nueva_id, estudiante.getId());
		Assert.assertEquals(otra_id, estudiante.getId());
		
	}
	
	@Test
	public void test05EstudianteCambiarEstadoCivil() {
		Estudiante estudiante = new Estudiante(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, CURSOASIGNADO);		
		Assert.assertEquals(ESTADOCIVIL, estudiante.getEstadoCivil());
		
		EstadoCivil nuevoEstadoCivil = EstadoCivil.CASADO;
		estudiante.cambioEstadoCivil(nuevoEstadoCivil);
		Assert.assertEquals(nuevoEstadoCivil, estudiante.getEstadoCivil());
		
		EstadoCivil otroEstadoCivil = EstadoCivil.DIVORCIADO;
		estudiante.cambioEstadoCivil(otroEstadoCivil);
		Assert.assertEquals(otroEstadoCivil, estudiante.getEstadoCivil());
	}
	
	@Test
	public void test06EstudianteCambierCursoAsignado() {
		Estudiante estudiante = new Estudiante(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, CURSOASIGNADO);
		Assert.assertEquals(CURSOASIGNADO, estudiante.getCursoAsignado());
		
		CursosFacultad nuevoCursoAsignado = CursosFacultad.COMPUTACION;
		estudiante.cambioCurso(nuevoCursoAsignado);
		Assert.assertEquals(nuevoCursoAsignado, estudiante.getCursoAsignado());
		
		CursosFacultad otroCursoAsignado = CursosFacultad.QUIMICA;
		estudiante.cambioCurso(otroCursoAsignado);
		Assert.assertEquals(otroCursoAsignado, estudiante.getCursoAsignado());
	}

}
