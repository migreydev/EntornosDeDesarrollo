package moskExamEntorno;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class testPersonaMosk {

	@Test
	void validarDatos() {
		Persona p = new Persona ();
		assertTrue(p.validarDatos("Miguel Angel", "Reyes", "37674354D"));
		assert(p.validarDatos("Miguel Angel", "Reyes", "09889068B", LocalDate.of(1994, 2, 25), "HOMBRE"));
		assertFalse(p.validarDatos(null, null, "4455674568N"));
		assertNotEquals(false, p.validarDatos("Miguel Angel", "Reyes", "13401547E"));
	}
	
	@Test
	void dniValido() {
		Persona p = new Persona ();
		assert(p.esDniValido("01174242T"));
		assertFalse(p.esDniValido("11998331JL"));
	}
	
	@ParameterizedTest
	@CsvSource({"1994, 29",
	            "2006, 17",
	            "2010, 13"})
	void testValidarDatosAnioEdad(int edadAnio, int resultado) {
	    Persona p = new Persona();
	    p.validarDatos("Miguel Angel", "Reyes", "33866768G", LocalDate.of(edadAnio, 2, 25), "HOMBRE");
	    assertEquals(resultado, p.getEdad(edadAnio));
	    
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1994,2004, 1998, 2002})
	void testBonoJovenValido(int anio) {
		Persona p = new Persona();
		p.setFechaNacimiento(LocalDate.of(anio, 2, 25));
		assertTrue(p.bonoJovenDisponible());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1992,2005, 2006, 2010})
	void testBonoJovenNoValido(int anio) {
		Persona p = new Persona();
		p.setFechaNacimiento(LocalDate.of(anio, 2, 25));
		assertFalse(p.bonoJovenDisponible());
	}
	

	@Test
	void validarEdad() {
		Persona p = new Persona();
		p.setFechaNacimiento(LocalDate.of(1994, 2, 25));
		assertEquals(29, p.obtenerEdad());
		assertNotEquals(25, p.obtenerEdad());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1994, 2002, 2010})
	void obtenerEdad(int anio) {
	    Persona p = new Persona();
	    p.setFechaNacimiento(LocalDate.of(anio, 1, 1));

	    int edadCalculada = p.obtenerEdad();
	    int edadEsperada = LocalDate.now().getYear() - anio;
	    assertEquals(edadEsperada, edadCalculada);
	}
}