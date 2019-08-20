package gene.caracteristicas;

public class Sexo {
	private String genero;
	private String orientacionSexual;
	
	
	public Sexo(String genero, String orientacionSexual) {
		this.genero = genero;
		this.orientacionSexual = orientacionSexual;
		
	}
	
	public Sexo(String genero) {
		this.genero = genero;
		setOrientacionSexual(genero);
		
		
	}
	
	public Sexo() {
		setGenero();
		setOrientacionSexual(getGenero());
		
	}
	
	public void setGenero() {
		int sexo = (int) (Math.random() * 100);
		if (sexo < 50){
			this.genero = "Femenino";
		} else if (sexo >= 50){
			this.genero = "Masculino";
		}
		
	}


	public String getOrientacionSexual() {
		return orientacionSexual;
	}


	public void mostrarInfoSexo() {
		System.out.println("Sexo: " + this.getGenero());
		System.out.println("Orientacion: " + this.getOrientacionSexual());
		
	}
	
	
	/*
	 * heterosexual hombre
	 * heretosexual mujer
	 * lesbiana 12%
	 * gay 15%
	 */
	public void setOrientacionSexual(String genero) {
		int porcentaje = (int) (Math.random() * 100);
		if (genero.equalsIgnoreCase("Femenino")) {
			if (porcentaje <= 12) {
				this.orientacionSexual = "Lesbiana";
			}else if (porcentaje > 12) {
				this.orientacionSexual = "Mujer Heterosexual";
			}
		}else if (genero.equalsIgnoreCase("Masculino")) {
			if (porcentaje <= 15) {
				this.orientacionSexual = "Gay";
			}else if (porcentaje > 15) {
				this.orientacionSexual = "Hombre Heterosexual";
			}
		}

	}
	
	public String getGenero() {
		return this.genero;
	}

	

}
