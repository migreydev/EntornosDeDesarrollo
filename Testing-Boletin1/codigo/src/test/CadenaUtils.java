package test;


public class CadenaUtils {
	
	private String cadena;
	private double numero;
	
	
	public CadenaUtils(String cadena) {
		super();
		this.cadena=cadena;
	}
	
	public CadenaUtils(double numero) {
		super();
		this.numero=numero;
	}
	

	String c="miguel";
	
	public String toMayusculas() {
        return c.toUpperCase();
    }
	
	
	public String toMinuscula() {
		return c.toLowerCase();
	}
	

	public boolean estaEnMayusculas() {
	    String mayusculas = this.cadena.toUpperCase();
	    return mayusculas.equals(this.cadena);
	}
	
	
	public boolean estaEnMinuscula() {
		String minuscula = this.cadena.toLowerCase();
		return minuscula.equals(this.cadena);
	}
	
	
	public boolean esDecimal() {
		boolean mensaje = false;
		double numero = 2.2;
		
		String numeroCadena=Double.toString(numero);
		
		for(int i =0; i < numeroCadena.length(); i++) {
			if(numeroCadena.charAt(i)=='.' || numeroCadena.charAt(i)==',') {
				numero= Double.valueOf(numeroCadena);
				mensaje = true;
			}
		}
		return mensaje;
	}
	
	
	public boolean esEntero() {
		boolean mensaje = false;
		int numero = 1;
		
		String numeroCadena = Integer.toString(numero);
		
		for(int i = 0; i<numeroCadena.length();i++) {
			if(numeroCadena.charAt(i)!= '.' || numeroCadena.charAt(i) != ',') {
				numero= Integer.valueOf(numeroCadena);
				mensaje = true;
			}
		}
		return mensaje;
	}
	
	public boolean esCapicua() {
		boolean mensaje = false;
		int numero = 121;
		String numeroCadena = Integer.toString(numero);

		
		for(int i = 0; i<numeroCadena.length(); i++) {
			for(int x = numeroCadena.length()-1; x>=0; x--) {
				if(numeroCadena.charAt(i)== numeroCadena.charAt(x)) {
					mensaje=true;
				}
			}
		}	
		return mensaje;
	}
	
	public boolean esPalindromo() {
		boolean mensaje = false;
		String cadena = "reconocer";

		
		for(int i = 0; i<cadena.length(); i++) {
			for(int x = cadena.length()-1; x>=0; x--) {
				if(cadena.charAt(i)== cadena.charAt(x)) {
					mensaje=true;
				}
			}
		}	
		return mensaje;
	}
}
