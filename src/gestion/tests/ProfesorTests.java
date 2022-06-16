package gestion.tests;

import org.junit.Assert;
import org.junit.Test;

import gestion.modelo.personas.*;

public class ProfesorTests {
	static final String NOMBRE = "Manuel";
	static final String APELLIDO = "Miranda";
	static final Integer ID = 1023;
	static final EstadoCivil ESTADOCIVIL = EstadoCivil.SOLTERO;
	static final Integer ANIOINGRESO = 2000;
	static final Integer NUMDESPACHO = 123456;
	static final DepartamentoFacultad DEPASIGNADO = DepartamentoFacultad.MATEMATICA;
	
	@Test
	public void test01CrearProfesorYVerificarAtributos() {
		Profesor profesor = new Profesor(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, DEPASIGNADO );
		
		Assert.assertEquals(NOMBRE, profesor.getNombre());
		Assert.assertEquals(APELLIDO, profesor.getApellido());
		Assert.assertEquals(ID, profesor.getId());
		Assert.assertEquals(ESTADOCIVIL, profesor.getEstadoCivil());
		Assert.assertEquals(ANIOINGRESO, profesor.getAnioIngreso());
		Assert.assertEquals(NUMDESPACHO, profesor.getNumDespacho());
		Assert.assertEquals(DEPASIGNADO, profesor.getDepartamentoAsignado());
	}
	
	@Test
	public void test02ProfesorCambiodeNombre() {
		Profesor profesor = new Profesor(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, DEPASIGNADO );
		Assert.assertEquals(NOMBRE, profesor.getNombre());
		
		String nuevoNombre = "Gabriel";
		profesor.cambioNombre(nuevoNombre);
		
		Assert.assertNotEquals(NOMBRE, profesor.getNombre());
		Assert.assertEquals(nuevoNombre, profesor.getNombre());
		
		nuevoNombre = "Matias";
		Assert.assertNotEquals(nuevoNombre, profesor.getNombre());
		
		profesor.cambioNombre(nuevoNombre);
		Assert.assertEquals(nuevoNombre, profesor.getNombre());
	}
	
	@Test
	public void test03ProfesorCambioDeApellido() {
		Profesor profesor = new Profesor(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, DEPASIGNADO );
		Assert.assertEquals(APELLIDO, profesor.getApellido());
		
		String nuevoApellido = "Lopez";
		profesor.cambioApellido(nuevoApellido);
		
		Assert.assertNotEquals(APELLIDO, profesor.getApellido());
		Assert.assertEquals(nuevoApellido, profesor.getApellido());
		
		String otroApellido = "Gonzales";
		profesor.cambioApellido(otroApellido);
		
		Assert.assertNotEquals(nuevoApellido, profesor.getApellido());
		Assert.assertEquals(otroApellido, profesor.getApellido());
	}
	
	@Test
	public void test04ProfesorCambioDeId() {
		Profesor profesor = new Profesor(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, DEPASIGNADO );
		Assert.assertEquals(ID, profesor.getId());
		
		Integer nuevaId = 191234;
		profesor.cambioId(nuevaId);
		Assert.assertNotEquals(ID, profesor.getId());
		Assert.assertEquals(nuevaId, profesor.getId());
		
		Integer otraId = 1534579;
		profesor.cambioId(otraId);
		Assert.assertNotEquals(nuevaId, profesor.getId());
		Assert.assertEquals(otraId, profesor.getId());
	}
	
	@Test
	public void test05ProfesorCambioEstadoCivil() {
		Profesor profesor = new Profesor(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, DEPASIGNADO );	
		Assert.assertEquals(ESTADOCIVIL, profesor.getEstadoCivil());
		
		EstadoCivil nuevoEstadoCivil = EstadoCivil.CASADO;
		profesor.cambioEstadoCivil(nuevoEstadoCivil);
		Assert.assertEquals(nuevoEstadoCivil, profesor.getEstadoCivil());
		
		EstadoCivil otroEstadoCivil = EstadoCivil.DIVORCIADO;
		profesor.cambioEstadoCivil(otroEstadoCivil);
		Assert.assertEquals(otroEstadoCivil, profesor.getEstadoCivil());
	}
	
	@Test
	public void test06ProfesorCambioAnioIngreso() {
		Profesor profesor = new Profesor(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, DEPASIGNADO );
		Assert.assertEquals(ANIOINGRESO, profesor.getAnioIngreso());
		
		Integer nuevoAnio = 2010;
		profesor.cambioAnioIngreso(nuevoAnio);
		Assert.assertEquals(nuevoAnio, profesor.getAnioIngreso());
		
		Integer otroAnio = 2021;
		profesor.cambioAnioIngreso(otroAnio);
		Assert.assertEquals(otroAnio, profesor.getAnioIngreso());

	}
	
	@Test(expected=AnioIncorrectoException.class)
	public void test07ProfesorCrearProfesorAnioIncorrecto() {
		Integer anioIncorrecto = 1810;
		Profesor profesor = new Profesor(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, anioIncorrecto, NUMDESPACHO, DEPASIGNADO );
		Assert.assertEquals(anioIncorrecto, profesor.getAnioIngreso());
		
	}
	
	@Test(expected=AnioIncorrectoException.class)
	public void test08ProfesorCambiarAnioIncorrecto() {	
		Profesor profesor = new Profesor(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, DEPASIGNADO );
		Assert.assertEquals(ANIOINGRESO, profesor.getAnioIngreso());
		
		Integer anioIncorrecto = 1820;
		profesor.cambioAnioIngreso(anioIncorrecto);
	}
	
	@Test
	public void test09ProfesorCambiarNumDespacho() {
		Profesor profesor = new Profesor(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, DEPASIGNADO );
		Assert.assertEquals(NUMDESPACHO, profesor.getNumDespacho());
		
		Integer nuevoNumDespacho = 345234;
		profesor.cambioNumDespacho(nuevoNumDespacho);
		Assert.assertEquals(nuevoNumDespacho, profesor.getNumDespacho());
		
		Integer otroNumDespacho = 4353134;
		profesor.cambioNumDespacho(otroNumDespacho);
		Assert.assertEquals(otroNumDespacho, profesor.getNumDespacho());
		
	}
	@Test
	public void test10ProfesorCambiarDepartamentoAsignado() {
		Profesor profesor = new Profesor(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, DEPASIGNADO );
		Assert.assertEquals(DEPASIGNADO, profesor.getDepartamentoAsignado());
		
		DepartamentoFacultad nuevoDepAsignado = DepartamentoFacultad.ARQUITECTURA;
		profesor.cambioDepartamentoAsignado(nuevoDepAsignado);
		Assert.assertEquals(nuevoDepAsignado, profesor.getDepartamentoAsignado());
		
		DepartamentoFacultad otroDepAsignado = DepartamentoFacultad.LENGUAJES;
		profesor.cambioDepartamentoAsignado(otroDepAsignado);
		Assert.assertEquals(otroDepAsignado, profesor.getDepartamentoAsignado());
	}

}
