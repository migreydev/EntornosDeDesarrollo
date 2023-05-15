package moskExamEntorno;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private LocalDate fechaNacimiento;
	private Genero genero;


	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido, String dni)  {
		this();
		if(validarDatos(nombre, apellido, dni)) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
		}
	}
	
	public Persona(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String genero) {
		this();
		if(validarDatos(nombre, apellido, dni, fechaNacimiento, genero)) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
			this.fechaNacimiento = fechaNacimiento;
			this.genero = Genero.valueOf(genero);
		}else {
			throw new PersonaException();
		}
	}
	
	
	public boolean validarDatos(String nombre, String apellido, String dni) {
		boolean datos = true;
		if (nombre == null || nombre.isEmpty() && apellido == null || apellido.isEmpty()) {
			datos = false;
		}if (!esDniValido(dni)) {
			datos = false;
		}
		return datos;
	}

	public boolean  esDniValido(String dni) {
		boolean esDni=true;
		if (dni == null || dni.isEmpty() && dni.length() < 9 || dni.length() >9 || Character.isDigit(dni.charAt(8))) {
			esDni=false;
		}

		for(int i=0; i<dni.length()-1; i++) 
			if(Character.isAlphabetic(dni.charAt(i))) 
				esDni=false;

		if ("TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.valueOf(dni.substring(0, 8))%23)!= dni.toUpperCase().charAt(8)) {
			esDni=false;
		}
		return esDni;
			
	}
	
	public boolean validarDatos(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String genero) {
		if (nombre == null || nombre.isEmpty()) {
			return false;
		}

		if (apellido == null || apellido.isEmpty()) {
			return false;
		}

		esDniValido(dni);
		
		if (fechaNacimiento == null) {
			return false;
		}
		if(fechaNacimiento.isAfter(LocalDate.now())) {
			return false;
		}
		if (genero == null || genero.isEmpty()) {
			return false;
		}

		if(!Genero.HOMBRE.equals(Genero.valueOf(genero)) && !Genero.MUJER.equals(Genero.valueOf(genero))) {
			return false;
		}
		
		return true;
	}
	
	
	
	public boolean bonoJovenDisponible() {
		if(LocalDate.now().getYear()-this.fechaNacimiento.getYear()> 18) {
			if(LocalDate.now().getYear()-this.fechaNacimiento.getYear()< 30) {
				return true;
			}
		}

		return false;
		
	}
	
	public int obtenerEdad() {
		return LocalDate.now().compareTo(fechaNacimiento)>=0?
						LocalDate.now().minusYears(this.fechaNacimiento.getYear()).getYear()	:	-1;
	}
	
	public int obtenerEdadPara(int year) {
		if(year>=this.fechaNacimiento.getYear()) {
			return year-this.fechaNacimiento.getYear();
		}
		return -1;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getEdad(int anioNacimiento) {
	    LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, 1, 1);
	    return LocalDate.now().getYear() - fechaNacimiento.getYear();
	}



	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	

}
