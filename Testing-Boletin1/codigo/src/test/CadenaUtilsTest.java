package test;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class CadenaUtilsTest {


    @Test
    public void testToMayusculas() {
    	CadenaUtils c = new CadenaUtils("HOLA MUNDO");
        assertEquals("HOLA MUNDO", c.toMayusculas());
    }
    
    @Test
    public void testToMinuscula() {
    	CadenaUtils c = new CadenaUtils("hola mundo");
        assertEquals("hola mundo", c.toMinuscula());
    }
    
    @Test
    public void testEstaEnMayusculas() {
    	CadenaUtils c = new CadenaUtils("HOLA MUNDO");
        assertTrue(c.estaEnMayusculas());
        assertFalse(c.estaEnMayusculas());
    }
    
    @Test
    public void testEstaEnMinuscula() {
    	CadenaUtils c = new CadenaUtils("hola mundo");
        assertTrue(c.estaEnMinuscula());
        assertFalse(c.estaEnMinuscula());
    }
    
    @Test
    public void testEsDecimal() {
    	CadenaUtils numeroDouble = new CadenaUtils(3.3);
    	assertTrue(numeroDouble.esDecimal());
    	
    }
    
    @Test
    public void testEsEntero() {
    	CadenaUtils numeroEntero = new CadenaUtils(2);
    	assertTrue(numeroEntero.esEntero());
    	
    }
    
    @Test
    public void testEsCapicua() {
    	CadenaUtils numeroCapicua = new CadenaUtils(121);
    	CadenaUtils numeroNoCapicua = new CadenaUtils(123);
    	assertTrue(numeroCapicua.esCapicua());
    	assertFalse(numeroNoCapicua.esCapicua());
    }
    
    @Test
    public void testEsPalindromo() {
    	CadenaUtils cadenaPalindromo = new CadenaUtils("reconocer");
    	CadenaUtils cadenaNoPalindromo = new CadenaUtils("hola");
    	assertTrue(cadenaPalindromo.esPalindromo());
    	assertFalse(cadenaNoPalindromo.esPalindromo());
    	assertEquals("reconocer", cadenaPalindromo.esPalindromo());
    }
}
    
    

