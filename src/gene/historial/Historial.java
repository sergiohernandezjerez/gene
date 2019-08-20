package gene.historial;

import gene.humano.Humano;

public class Historial extends Humano{
	private String historialCategorias[] = new String[7];
	
	
	public Historial(String categoria) {
		// TODO Auto-generated constructor stub
		this.historialCategorias = setHistorialCategorias(categoria);
		
		
	}
	
	
	public String[] getHistorialCategorias() {
		return historialCategorias;
	}
	
	public String[] setHistorialCategorias(String categoria) {
		
		if (historialCategorias[0].length()<1) {
			historialCategorias[0] = categoria;

		} else {
			for (int i = 0; i <= 6; i++) {
				if(historialCategorias[i] != categoria) {
					historialCategorias[i] = categoria;
				}
			}

		}
		return historialCategorias;
	}
	
	
	
	

}
