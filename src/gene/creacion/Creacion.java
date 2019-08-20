package gene.creacion;

import java.util.ArrayList;

import gene.datos.Datos;
import gene.humano.Humano;
import gene.datos.Consultas;

public class Creacion {

	public static void main(String[] args) {
				
		// TODO Auto-generated method stub
		ArrayList<Humano> listaHumanos = new ArrayList<Humano>();
		
		for (int i = 0; i < 100; i++) {
			listaHumanos.add(new Humano());
		}

		for (int ano = 0; ano < 120; ano++) {
			
			for (Humano humano : listaHumanos) {
				if (humano.getEdad() < 120) {
					humano.setEdad(humano.getEdad() + 1);
					humano.setCategoria();
					
				}else {
					humano.setEdadFinal(120);
				}
			}
		}
		
		for (Humano humano : listaHumanos) {
			Consultas.mostrarHumano(humano);
		}
		
		System.out.println("Humanos: " + listaHumanos.size());
		Datos.mostrarEstadisticasGenero();
		Datos.mostrarEstadisticasOrientacionSexual();
		Datos.mostrarEstadisticasColorCabello();
		Datos.mostrarEstadisticasColorOjos();
		Datos.mostrarEstadisticasPoblacion();
		Consultas.consultaPorColorDePiel("morena", listaHumanos);
		
		
	}

}
