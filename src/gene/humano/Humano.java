package gene.humano;


import gene.caracteristicas.Cabello;
import gene.caracteristicas.Ojos;
import gene.caracteristicas.Sexo;
import gene.datos.Datos;
import gene.caracteristicas.Poblacion;

public class Humano {

	private boolean askembla;
	//private int idHumano = 0; // todo
	private int CONTADOR_HISTORIAL_CATEGORIA = 0;
	private String nombre;
	private String apellido;
	private int edad;
	private String categoria;
	private String[] historialCategoria = new String[1];
	private int[] historialEdad = new int[2];
	private Cabello cabello;
	private Ojos ojos;
	private Sexo sexo;
	private Poblacion poblacion;
	
	
	public Humano() {
		this.askembla = true;
		this.edad = edadAleatoria();
		this.sexo = new Sexo();
		this.nombre = Datos.getNombreAleatorio(sexo.getGenero());
		this.apellido = Datos.getApellidoAleatorio();
		this.categoria = Categoria.getCategoria(edad);
		historialCategoria[0] = this.categoria;
		historialEdad[0] = this.edad;
		this.poblacion = new Poblacion();
		this.cabello = new Cabello(poblacion.getPoblacion());
		this.ojos = new Ojos();
		setContadores();
		CONTADOR_HISTORIAL_CATEGORIA++;
	}
	
	
	public void setContadores() {
		Datos.setContadorOrientacionSexual(sexo.getOrientacionSexual());
		Datos.setContadorColorCabello(cabello.getColorCabello());
		Datos.setContadorColorOjos(ojos.getColorOjos());
		Datos.setContadorGenero(sexo.getGenero());
		Datos.setContadorPoblacion(poblacion.getPoblacion());
	}
	
	
	public Humano(String nombre, String apellido, int edad, int sexo, String orientacionsexual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = new Sexo();
		Datos.setContadorOrientacionSexual(orientacionsexual);
		this.categoria = Categoria.getCategoria(edad);
		this.cabello = new Cabello(poblacion.getPoblacion());
		this.ojos = new Ojos();
	}
	
	
	public Humano(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = new Sexo();
		Datos.setContadorOrientacionSexual(sexo.getOrientacionSexual());
		this.categoria = Categoria.getCategoria(edad);
		this.cabello = new Cabello(poblacion.getPoblacion());
		this.ojos = new Ojos();
	}
	
	
	public Humano(String nombre) {
		this.nombre = nombre;
		this.apellido = Datos.getApellidoAleatorio();
		this.edad = edadAleatoria();
		this.sexo = new Sexo();
		Datos.setContadorOrientacionSexual(sexo.getOrientacionSexual());
		this.categoria = Categoria.getCategoria(edad);
		this.cabello = new Cabello(poblacion.getPoblacion());
		this.ojos = new Ojos();
	}
	
	
	public Humano(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = new Sexo();
		Datos.setContadorOrientacionSexual(sexo.getOrientacionSexual());
		this.edad = edadAleatoria();
		this.categoria = Categoria.getCategoria(edad);
		this.cabello = new Cabello(poblacion.getPoblacion());
		this.ojos = new Ojos();
	}
	
	
	public String[] getHistorialCategorias() {
		return this.historialCategoria;
	}
	
	
	public Cabello getCabello() {
		return this.cabello;
	}
	
	
	public Poblacion getPoblacion() {
		return this.poblacion;
	}
	
	
	public Ojos getOjos() {
		return this.ojos;
	}
	
	
	public Sexo getSexo() {
		return this.sexo;
	}
	
	
	public int edadAleatoria() {
		return (int) (Math.random() * 120);
	}
	
	
	public void setEdadFinal(int edad) {
		historialEdad[1] = edad;
	}
		
	
	public void setCategoria() {
		this.categoria = Categoria.getCategoria(this.edad);
		updateHistorialCategoria(categoria);
	}
	
	
	public String getCategoria() {
		return categoria;
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
	
	public String getNombreYApellido() {
		return this.getNombre() + " " + this.getApellido();
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean getAskembla() {
		return askembla;
	}


	public void setAskembla(boolean askembla) {
		this.askembla = askembla;
	}


	
	
	public void updateHistorialCategoria(String categoria) {
		
		boolean existeLaCategoria = false;
		int nuevoIndice = CONTADOR_HISTORIAL_CATEGORIA + 1;
		String[] arrayDePaso = new String[nuevoIndice];
		
		for (int i = 0;i < CONTADOR_HISTORIAL_CATEGORIA; i++) {
			arrayDePaso[i] = historialCategoria[i];
			if (historialCategoria[i].equals(categoria)){
				existeLaCategoria = true;
			}
		}
		
		if (!existeLaCategoria) {
			arrayDePaso[nuevoIndice-1] = categoria;
			historialCategoria = arrayDePaso;
			CONTADOR_HISTORIAL_CATEGORIA++;
		}
	}
	
	
	public String[] getHistorialCategoria() {
		return historialCategoria;
	}
	
	
	public void mostrarHistorialCategoria() {
		System.out.println("\nHistorial de categorias: ");
		
		for (int i = 0; i < historialCategoria.length; i++) {
			System.out.print(historialCategoria[i]);
			if (i != historialCategoria.length-1) {
				System.out.print(", ");
				
			}else {
				System.out.print(".");
			}
			
		}
		
		System.out.println();
	}
	
	
	public void mostrarHistorialEdad() {
		System.out.println("Edad inicial: " + historialEdad[0] + 
				" - edad final: " + historialEdad[1]);
		System.out.println();

	}

}
