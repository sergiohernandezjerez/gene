package gene.humano;

public class Categoria {
	/**
	 * 0 a 1 Lactancia
	 * 1 a 6 Infancia
	 * 6 a 13 Niñez
	 * 13 a 15 preadolescencia
	 * 15 a 21 adolescencia
	 * 21 a 35 Adulto
	 * 35 a 60 madurez
	 * 61 a 99 vejez
	 * 100 a 120 centenario
	 */


	public static String getCategoria(int edad) {
		String categoria = "no procesada";
		 if (edad <=1 && edad >=0) {
			 categoria = "Lactancia";
		 }
		 if (edad >1 && edad <=6) {
			 categoria = "Infancia";
		 }
		 if (edad >6 && edad <=13) {
			 categoria = "Niñez";
		 }
		 if (edad >13 && edad <=15) {
			 categoria = "Preadolescencia";
		 }
		 if (edad >15 && edad <=21) {
			 categoria = "Adolescencia";
		 }
		 if (edad >21 && edad <=35) {
			 categoria = "Adulto";
		 }
		 if (edad >35 && edad <=60) {
			 categoria = "Madurez";
		 }
		 if (edad >60 && edad <=100) {
			 categoria = "Vejez";
		 }
		 if (edad > 100) {
			 categoria = "Centenario";
		 }
		 
		 return categoria;
	}
	
	

}
