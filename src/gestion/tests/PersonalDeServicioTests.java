package gestion.tests;

import org.junit.Assert;
import org.junit.Test;

import gestion.modelo.personas.*;

public class PersonalDeServicioTests {
	static final String NOMBRE = "Matias";
	static final String APELLIDO = "Enriquez";
	static final Integer ID = 66483;
	static final EstadoCivil ESTADOCIVIL = EstadoCivil.SOLTERO;
	static final Integer ANIOINGRESO = 1999;
	static final Integer NUMDESPACHO = 52341;
	static final SeccionFacultad SECCION = SeccionFacultad.BIBLIOTECA;

	@Test
	public void test01CrearPersonalDeServicioYVerificarAtributos() {
		PersonalDeServicio personalServ = new PersonalDeServicio(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, SECCION );
		
		Assert.assertEquals(NOMBRE, personalServ.getNombre());
		Assert.assertEquals(APELLIDO, personalServ.getApellido());
		Assert.assertEquals(ID, personalServ.getId());
		Assert.assertEquals(ESTADOCIVIL, personalServ.getEstadoCivil());
		Assert.assertEquals(ANIOINGRESO, personalServ.getAnioIngreso());
		Assert.assertEquals(NUMDESPACHO, personalServ.getNumDespacho());
		Assert.assertEquals(SECCION, personalServ.getSeccionAsignada());
	}
	
	@Test
	public void test02PersolDeServicioCambiodeNombre() {
		PersonalDeServicio personalServ = new PersonalDeServicio(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, SECCION );
		Assert.assertEquals(NOMBRE, personalServ.getNombre());
		
		String nuevo_nombre = "Federico";
		personalServ.cambioNombre(nuevo_nombre);
		
		Assert.assertNotEquals(NOMBRE, personalServ.getNombre());
		Assert.assertEquals(nuevo_nombre, personalServ.getNombre());
		
		nuevo_nombre = "Nicolas";
		Assert.assertNotEquals(nuevo_nombre, personalServ.getNombre());
		
		personalServ.cambioNombre(nuevo_nombre);
		Assert.assertEquals(nuevo_nombre, personalServ.getNombre());
	}
	
	@Test
	public void test03PersonalDeServicioCambioDeApellido() {
		PersonalDeServicio personalServ = new PersonalDeServicio(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, SECCION );
		Assert.assertEquals(APELLIDO, personalServ.getApellido());
		
		String nuevo_apellido = "Naveira";
		personalServ.cambioApellido(nuevo_apellido);
		
		Assert.assertNotEquals(APELLIDO, personalServ.getApellido());
		Assert.assertEquals(nuevo_apellido, personalServ.getApellido());
		
		nuevo_apellido = "Goroso";
		Assert.assertNotEquals(nuevo_apellido, personalServ.getApellido());
		
		personalServ.cambioApellido(nuevo_apellido);
		Assert.assertEquals(nuevo_apellido, personalServ.getApellido());
	}
	
	@Test
	public void test04PersonalDeServicioCambioDeId() {
		PersonalDeServicio personalServ = new PersonalDeServicio(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, SECCION );
		Assert.assertEquals(ID, personalServ.getId());
		
		Integer nueva_id = 191234;
		personalServ.cambioId(nueva_id);
		Assert.assertNotEquals(ID, personalServ.getId());
		Assert.assertEquals(nueva_id, personalServ.getId());
		
		Integer otra_id = 1534579;
		personalServ.cambioId(otra_id);
		Assert.assertNotEquals(nueva_id, personalServ.getId());
		Assert.assertEquals(otra_id, personalServ.getId());
	}
	
	@Test
	public void test05PersonalDeServicioCambioEstadoCivil() {
		PersonalDeServicio personalServ = new PersonalDeServicio(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, SECCION );		
		Assert.assertEquals(ESTADOCIVIL, personalServ.getEstadoCivil());
		
		EstadoCivil nuevoEstadoCivil = EstadoCivil.CASADO;
		personalServ.cambioEstadoCivil(nuevoEstadoCivil);
		Assert.assertEquals(nuevoEstadoCivil, personalServ.getEstadoCivil());
		
		EstadoCivil otroEstadoCivil = EstadoCivil.DIVORCIADO;
		personalServ.cambioEstadoCivil(otroEstadoCivil);
		Assert.assertEquals(otroEstadoCivil, personalServ.getEstadoCivil());
	}
	
	@Test
	public void test06PersonalDeServicioCambioAnioIngreso() {
		PersonalDeServicio personalServ = new PersonalDeServicio(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, SECCION );
		Assert.assertEquals(ANIOINGRESO, personalServ.getAnioIngreso());
		
		Integer nuevoAnio = 2010;
		personalServ.cambioAnioIngreso(nuevoAnio);
		Assert.assertEquals(nuevoAnio, personalServ.getAnioIngreso());
		
		Integer otroAnio = 2021;
		personalServ.cambioAnioIngreso(otroAnio);
		Assert.assertEquals(otroAnio, personalServ.getAnioIngreso());

	}
	
	@Test(expected=AnioIncorrectoException.class)
	public void test07PersonalDeServicioCrearProfesorAnioIncorrecto() {
		Integer anioIncorrecto = 1888;
		PersonalDeServicio personalServ = new PersonalDeServicio(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, anioIncorrecto, NUMDESPACHO, SECCION );
		
		Assert.assertEquals(anioIncorrecto, personalServ.getAnioIngreso());
		
	}
	
	@Test(expected=AnioIncorrectoException.class)
	public void test08PersonalDeServicioCambiarAnioIncorrecto() {
		PersonalDeServicio personalServ = new PersonalDeServicio(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, SECCION );
		Assert.assertEquals(ANIOINGRESO, personalServ.getAnioIngreso());
		
		Integer anioIncorrecto = 1820;
		personalServ.cambioAnioIngreso(anioIncorrecto);
	}
	
	@Test
	public void test09PersonalDeServicioCambiarNumDespacho() {
		PersonalDeServicio personalServ = new PersonalDeServicio(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, SECCION );
		Assert.assertEquals(NUMDESPACHO, personalServ.getNumDespacho());
		
		Integer nuevoNumDespacho = 345234;
		personalServ.cambioNumDespacho(nuevoNumDespacho);
		Assert.assertEquals(nuevoNumDespacho, personalServ.getNumDespacho());
		
		Integer otroNumDespacho = 4353134;
		personalServ.cambioNumDespacho(otroNumDespacho);
		Assert.assertEquals(otroNumDespacho, personalServ.getNumDespacho());
		
	}
	
	@Test
	public void test10PersonalDeServicioCambiarSeccionAsignada() {
		PersonalDeServicio personalServ = new PersonalDeServicio(
				NOMBRE, APELLIDO, ID, ESTADOCIVIL, ANIOINGRESO, NUMDESPACHO, SECCION );
		Assert.assertEquals(SECCION, personalServ.getSeccionAsignada());
		
		SeccionFacultad nuevaSecAsignado = SeccionFacultad.DECANATO;
		personalServ.cambioSeccionAsignada(nuevaSecAsignado);
		Assert.assertEquals(nuevaSecAsignado, personalServ.getSeccionAsignada());
		
		SeccionFacultad otraSecAsignado = SeccionFacultad.SECRETARIA;
		personalServ.cambioSeccionAsignada(otraSecAsignado);
		Assert.assertEquals(otraSecAsignado, personalServ.getSeccionAsignada());
	}

}
