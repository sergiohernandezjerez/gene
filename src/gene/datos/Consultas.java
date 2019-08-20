package gene.datos;

import gene.humano.Humano;

import java.util.ArrayList;


public class Consultas {
	
	/**
	 * Consulta por color de cabello.
	 * Opciones: Blanco, Pelirrojo, Negro, Rubio, Moreno (IgnoreCase)
	 * 
	 * @param colorCabello Color de cabello a consultar
	 * @param listaHumanos ArrayList de Humanos
	 */
	public static void consultaPorColorDeCabello(String colorCabello, 
			                                     ArrayList<Humano> listaHumanos) {
		System.out.println("Humanos con el color de cabello " + colorCabello);
		System.out.println("------------------------------------------------");
		for (Humano humano : listaHumanos) {
			if(colorCabello.equalsIgnoreCase(humano.getCabello().getColorCabello())) {
				System.out.println(humano.getNombre() + " " + humano.getApellido());
			}
		}
		System.out.println();
	}

	
	/**
	 * Consulta por color de piel
	 * Opciones: Muy blanca, morena, café oscuro, negra, blanca (IgnoreCase)
	 * @param colorPiel Color de piel a consultar
	 * @param listaHumanos ArrayList de Humanos
	 */
	public static void consultaPorColorDePiel(String colorPiel, 
											  ArrayList<Humano> listaHumanos) {
		System.out.println("Humanos con el color de piel " + colorPiel);
		System.out.println("------------------------------------------------");
		for (Humano humano : listaHumanos) {
			if(colorPiel.equalsIgnoreCase(humano.getPoblacion().getColorPiel())) {
				System.out.println(humano.getNombre() + " " + humano.getApellido());
			}
		}
		System.out.println();
	}
	
	
	/**
	 * Consulta por color de ojos
	 * Opciones: Marrón, Verde, Azul, Heterocromía (IgnoreCase)
	 * @param colorOjos Color de ojos a consultar
	 * @param listaHumanos ArrayList de Humanos
	 */
	public static void consultaPorColorDeOjos(String colorOjos, 
			                                  ArrayList<Humano> listaHumanos) {
		System.out.println("Humanos con el color de ojos " + colorOjos);
		System.out.println("------------------------------------------------");
		for (Humano humano : listaHumanos) {
			if(colorOjos.equalsIgnoreCase(humano.getOjos().getColorOjos())) {
				System.out.println(humano.getNombre() + " " + humano.getApellido());
			}
		}
		System.out.println();
	}
	
	
	/**
	 * Consulta por genero
	 * Opciones: Masculino, Femenino (IgnoreCase)
	 * @param genero Genero a consultar
	 * @param listaHumanos ArrayList de Humanos
	 */
	
	public static void consultaPorGenero(String genero, 
			                             ArrayList<Humano> listaHumanos) {
		System.out.println("Humanos de género " + genero);
		System.out.println("---------------------------------------");
		for (Humano humano : listaHumanos) {
			if(genero.equalsIgnoreCase(humano.getSexo().getGenero())) {
				System.out.println(humano.getNombre() + " " + humano.getApellido());
			}
		}
		System.out.println();
	}
	
		
	/**
	 * Consulta por orientación sexual
	 * Opciones: Hombre heterosexual, Mujer heterosexual, Gay, Lesbiana
	 * @param orientacion Orientación sexual a consultar
	 * @param listaHumanos ArrayList de Humanos
	 */
	public static void consultaPorOrientacionSexual(String orientacion, 
			                                        ArrayList<Humano> listaHumanos) {
		System.out.println("Humanos " + orientacion);
		System.out.println("----------------------------");
		for (Humano humano : listaHumanos) {
			if(orientacion.equalsIgnoreCase(humano.getSexo().getOrientacionSexual())) {
				System.out.println(humano.getNombre() + " " + humano.getApellido());
			}
		}
		System.out.println();
	}
	
	
	/**
	 * Consulta por edad
	 * Opciones: numero entero mayor de 0
	 * @param edad Edad a consultar
	 * @param listaHumanos ArrayList de Humanos
	 */
	public static void consultaPorEdad(int edad, ArrayList<Humano> listaHumanos) {
		System.out.println("Humanos con " + edad + " años de edad");
		System.out.println("----------------------------------------------");
		for (Humano humano : listaHumanos) {
			if(edad == humano.getEdad()) {
				System.out.println(humano.getNombre() + " " + humano.getApellido());
			}
		}
		System.out.println();
	}
	
	
	 /**
	  * Consulta por categoría
	  * Opciones: Lactancia, Infancia, Niñez, Preadolescencia, Adolescencia, 
	  * Adulto, Madurez, Vejez, Centenario
	  * @param categoria
	  * @param listaHumanos
	  */
	public static void consultaPorCategoria(String categoria, 
			                                ArrayList<Humano> listaHumanos) {
		System.out.println("Humanos en edad " + categoria);
		System.out.println("------------------------------------------");
		for (Humano humano : listaHumanos) {
			if(categoria == humano.getCategoria()) {
				System.out.println(humano.getNombre() + " " + humano.getApellido());
			}
		}
		System.out.println();
	}
	
	/**
	 * Muestra los datos del humano
	 * @param humano
	 */
	
	public static void mostrarHumano(Humano humano) {
		System.out.println("--------------------------------------------------");
		System.out.println("Nombre completo: " + humano.getNombreYApellido());
		humano.getPoblacion().mostrarInfoPoblacion();
		humano.getSexo().mostrarInfoSexo();
		System.out.println("Edad: " + humano.getEdad());
		System.out.println("Categoria: " + humano.getCategoria());
		humano.getCabello().mostrarInfoCabello(); 
		humano.getOjos().mostrarInfoOjos();
		humano.mostrarHistorialCategoria(); 
		humano.mostrarHistorialEdad();

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
