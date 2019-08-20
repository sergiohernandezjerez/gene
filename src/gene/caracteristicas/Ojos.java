package gene.caracteristicas;

import gene.humano.Humano;

public class Ojos {
	
	/*
	 * Porcentaje mundial color de ojos
	 * marr�n - 73%
	 * azul - 14%
	 * verde - 10%
	 * heterocrom�a(diferente color) - 3%
	 */ 
			
    /*
			//Padre      Madre    marron  verde  azul
			{"Marron", "Marron", "75",   "18",  "7"},
			{"Verde",  "Marron", "50",   "37",  "13"},
			{"Azul",   "Marron", "49",   "2",   "49"},
			{"Verde",  "Verde",  "3",    "74",  "25"},
			{"Verde",  "Azul",   "2",    "49",  "49"},
			{"Azul",   "Azul",   "2",    "3",   "98"}
			
	 *  M�todo generado con la ayuda del usuario 'santiaguito'
	 *  de es.stackoverflow.com
	 * 
	 *  tabla para generar el color de ojos de los hijos
	 *  la primera posici�n es la suma de los colores de los padres
	 *  marron = 3
	 *  verde = 2
	 *  azul = 0
	 *  
	 *  la segunda posici�n es el % de que el color sea marr�n
	 *  la tercera posici�n es el % de que el color sea verde
	 *  el % del color azul es la diferencia de la posici�n verde hasta 99
	 *  la heterocrom�a siempre es 100
	 *  si alguno de los padres tiene heterocrom�a se llamar� al m�todo
	 *  aleatorio aumentando el % de la heterocr�mia
	 */
	private int[][] tablaOjos = {
			   //suma    marron  verde  azul heterocrom�a
			    {1,      73,      83},  // utilizada para la creaci�n inicial y la heterocrom�a
				{6,      75,      93},  // 94..97    100  
				{5,      50,      87},  // 87..97    100
				{3,      49,      51},  // ,etc
				{4,      3,       77},
				{2,      2,       51},
				{0,      2,        5}				
		};
	
	static final int COLOR_AZUL = 97;
	
	private String colorOjos;
	private int idColorOjos;
	
	
	public Ojos(String color) {
		this.colorOjos = color;
	}
	
	public Ojos() {
		generarColorOjos();
	}
	
	public Ojos(Humano humano) {
		if (humano.getAskembla() == false) {
			generarColorOjos();
		}else {
			// todo
			//generaColorOjosHijos(sumaColoresPadres(idColorOjosMadre, idColorOjosPadre));
		}
	}
		
	public String getColorOjos() {
		return this.colorOjos;
	}
	
	public int getIdColorOjos() {
		return this.idColorOjos;
	}
	
	public void setIdColorOjos(int idColorOjos) {
		this.idColorOjos = idColorOjos;
	}
	
	public void setColorOjos(String color) {
		this.colorOjos = color;
	}
	
	 
	public void generarColorOjos() {
		int numeroAleatorio = (int)(Math.random() * 100);
		calculoColorOjos(numeroAleatorio, 73, 83);
	}
	
	
	public void calculoColorOjos(int numeroAleatorio, int marron, int verde) {
		
		String colorOjos = "";
		int idColorOjos = 0;
		
		if (numeroAleatorio <= marron) {
	        colorOjos = "Marr�n";
	        idColorOjos = 3;
	    } else if (numeroAleatorio <= verde) {
	        colorOjos = "Verde";
	        idColorOjos = 2;
	    } else if (numeroAleatorio <= COLOR_AZUL) {
	        colorOjos = "Azul";
	        idColorOjos = 0;
	    } else if (numeroAleatorio > COLOR_AZUL) {
	        colorOjos = "Heterocrom�a";
	        idColorOjos = -4;
	    }
		
		setColorOjos(colorOjos);
		setIdColorOjos(idColorOjos);
	}

	
	public void mostrarInfoOjos() {
		
		System.out.println("Color de ojos: " + this.getColorOjos());
		
	}

}
