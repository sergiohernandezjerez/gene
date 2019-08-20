package gene.caracteristicas;

import java.lang.Math;

public class Cabello{
	
	/*
	 * según la población a la que pertenece el humano el tipo y color de pelo
	 * deberá ajustarse a las características de dicha población
	 * 
	 * Negros pelo negro y muy rizado
	 * Asiáticos pelo negro y liso
	 * Latinos y Blancos pelo variado
	 * Moros pelo negro y rizado
	 * Indios pelo negro y forma variada
	 */
		
	private String colorCabello;
	private String formaCabello;
		
		
	public Cabello(String poblacion) {
		setCabello(poblacion);
	}
	
	
	public String getColorCabello() {
		return colorCabello;
	}

	public void setColorCabello(String color) {
		this.colorCabello = color;
	}

	public String getFormaCabello() {
		return formaCabello;
	}

	public void setFormaCabello(String forma) {
		this.formaCabello = forma;
	}


	/**
	 * Cabello negro 3%
     * Cabello castaño 79%
     * Cabello rubio 10%
     * Cabello pelirrojo 2%
     * Cabello blanco(albino) 1%
     * 
	 * @return
	 */
	public void setColorCabelloAleatorio() {
		int porcentaje = (int) (Math.random() * 100);

		if (porcentaje < 2) {
			setColorCabello("Blanco");
		} else if (porcentaje < 3) {
			setColorCabello("Pelirrojo");
		} else if (porcentaje < 4) {
			setColorCabello("Negro");
		} else if (porcentaje < 11) {
			setColorCabello("Rubio");
		} else {
			setColorCabello("Moreno");
		}
	}
	
	
	public void setCabello(String poblacion) {
		if(poblacion != null) {
			switch (poblacion) {
			case "Asiática":
				setColorCabello("Negro");
				setFormaCabello("Liso");			
				break;
			case "Negra":
				setColorCabello("Negro");
				setFormaCabello("Muy Rizado");			
				break;
			case "Latina":
			case "Blanca":
				setColorCabelloAleatorio();
				setFormaCabelloAleatoria();		
				break;
			case "Mora":
				setColorCabello("Negro");
				setFormaCabello("Rizado");			
				break;
			case "India":
				setColorCabello("Negro");
				setFormaCabelloAleatoria();			
				break;
			default:
					
				break;
			}
		}
		
	}
	
	/*
	 * Rizado 15%
	 * Ondulado 40%
	 * liso 55%
	 */
	public void setFormaCabelloAleatoria() {
		int porcentaje = (int)(Math.random() * 100);

		if(porcentaje <= 15) {
			setFormaCabello("Rizado");		
		}else if (porcentaje <= 40) {
			setFormaCabello("Ondulado");
		}else if (porcentaje > 40) {
			setFormaCabello("Liso");
		}
	}
	
	public void mostrarInfoCabello() {
		System.out.println("Color cabello: " + this.getColorCabello());
		System.out.println("Forma cabello: " + this.getFormaCabello());
	}

}
