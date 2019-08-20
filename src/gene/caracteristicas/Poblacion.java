package gene.caracteristicas;

public class Poblacion {
	
	// porcentajes y colores al final del documento
	
	private static String asiatica = "Asiática";
	private static String negra = "Negra";
	private static String mora = "Mora";
	private static String blanca = "Blanca";
	private static String india = "India";
	private static String latina = "Latina";
	
	private String poblacion;
	private String colorPiel;
	// tabla porcentaje poblacion 
	//posicion: 0 Asiaticos, 1 indios, 2 moros, 3 negros, 4 blancos, 5 Latinos
	private int tablaPorcentajePoblacion[] = {30, 48, 64, 79, 93, 100 };
	
	
	public String getPoblacion() {
		return poblacion;
	}
	
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public Poblacion() {
		generaPoblacion();
	}
	
	public Poblacion(String poblacion, String colorPiel) {
		this.poblacion = poblacion;
		this.colorPiel = colorPiel;
	}
	
	public Poblacion(String poblacion) {
		this.poblacion = poblacion;
		generaColorPiel(poblacion);
	}
	
	public void generaPoblacion() {
		
		int porcentaje = (int) (Math.random() * 100);
		
		if (porcentaje < tablaPorcentajePoblacion[0]) {
			this.poblacion = asiatica;
		}else if (porcentaje < tablaPorcentajePoblacion[1]) {
			this.poblacion = india;
		}else if (porcentaje < tablaPorcentajePoblacion[2]) {
			this.poblacion = mora;
		}else if (porcentaje < tablaPorcentajePoblacion[3]) {
			this.poblacion = negra;
		}else if (porcentaje < tablaPorcentajePoblacion[4]) {
			this.poblacion = blanca;
		}else if (porcentaje < tablaPorcentajePoblacion[5]) {
			this.poblacion = latina;
		}
		
		generaColorPiel(this.poblacion);
				
	}
	
	
	public void generaColorPiel(String poblacion) {
		
		if(poblacion != null) {
			switch (poblacion) {
			case "Asiática":
				this.colorPiel = generaColorPielAsiatica();
				break;
			case "India":
				this.colorPiel = "Café oscuro";
				break;
			case "Mora":
			case "Latina":
				this.colorPiel = "Morena";
				break;
			case "Negra":
				this.colorPiel = "Negra";
				break;
			case "Blanca":
				this.colorPiel = "Blanca";
				break;

			default:
				break;
			}
		}
		
	}
	
	
	public String  generaColorPielAsiatica() {
		int porcentaje = (int) (Math.random() * 100);
		String colorPiel;
		if (porcentaje < 50){
			colorPiel = "Muy blanca";
		}else {
			colorPiel = "Morena amarillenta";
		}
		return colorPiel;
	}
	
	
	public void mostrarInfoPoblacion() {
		System.out.println("Población: " + this.getPoblacion());
		System.out.println("Color piel: " + this.getColorPiel());
	}
	
	
	
	/*
	 * 
	 * Asiaticos 30% color piel muy blanca o morena amarillenta 
	 * Indios 18% piel café oscuro
	 * Moros 16% piel morena
	 * Negros 15% color piel negra 
	 * Blancos 14% piel blanca 
	 * Latinos 7% piel morena 
	 * 
	 * tabla de valores de colores de piel. Para la representación gráfica
	 * piel morena
	 * #BF7B54 RGB 191, 123, 84 HSV 22, 56, 75 CMYK 0, 35, 56, 25 LAB 58, 22, 32
	 * 
	 * piel morena amarillenta
	 * #cca650 RGB 204 166 80 HSV 42 61 80 CMYK 20 39 82 0 LAB 72 12 55
	 * 
	 * Piel muy blanca
	 * #F2F2F2 RGB 242, 242, 242 HSV 0, 0, 95 CMYK 0, 0, 0, 5 LAB 96, 0, 0
	 * 
	 * Piel negra
	 * #cca650 RGB 38, 15, 10 HSV 11, 73, 15 CMYK 0, 60, 73, 85 LAB 7, 11, 7
	 * 
	 * Piel café oscuro
	 * #733122 RGB 115, 49, 34 HSV 11, 70, 45 CMYK 0, 57, 70, 55 LAB 29, 28, 23
	 * 
	 * Piel blanca
	 * #f2ccb6 RGB 242, 204, 182 HSV 22, 25, 95 CMYK 0, 16, 25, 5 LAB 85, 10, 16
	 */
	
	
	
	
	
	

}
