package gene.datos;

public class Datos {
	
	// posición:  0 mujeres, 1 hombres, 2 lesbianas, 3 gais
	private static int[] contadorOrientacionSexual = {0, 0, 0, 0};
	
	// posición: 0 negro, 1 rubio, 2 moreno, 3 pelirrojo, 4 blanco
	private static int[] contadorColorCabello = {0, 0, 0, 0, 0};
	
	// pocisión: 0 marrón, 1 verde, 2 azul, 3 heterocromía
	private static int[] contadorColorOjos = {0, 0, 0, 0};
	
	// posición: 0 hombres, 1 mujeres
	private static int[] contadorGenero = {0, 0};
	
	//posicion: 0 Asiaticos, 1 indios, 2 moros, 3 negros, 4 blancos, 5 Latinos
	private static int[] contadorPoblacion = {0, 0, 0, 0, 0, 0};	
	
	
	private static String nombresMasculinos[] = {
			"ANTONIO","JOSE","MANUEL","FRANCISCO","DAVID","JUAN","JOSE ANTONIO",
			"JAVIER","DANIEL","JOSE LUIS","FRANCISCO JAVIER","CARLOS","JESUS","ALEJANDRO",
			"MIGUEL","JOSE MANUEL","RAFAEL","MIGUEL ANGEL","PEDRO","ANGEL","PABLO",
			"JOSE MARIA","SERGIO","FERNANDO","LUIS","JORGE","ALBERTO","JUAN CARLOS",
			"ALVARO","JUAN JOSE","ADRIAN","DIEGO","RAUL","JUAN ANTONIO","IVAN","ENRIQUE",
			"RUBEN","RAMON","OSCAR","VICENTE","ANDRES","JUAN MANUEL","JOAQUIN","SANTIAGO",
			"EDUARDO","VICTOR","MARIO","ROBERTO","JAIME","FRANCISCO JOSE","MARCOS",
			"IGNACIO","ALFONSO","JORDI","RICARDO","SALVADOR","HUGO","EMILIO",
			"GUILLERMO","GABRIEL","MARC","JULIO","JULIAN","GONZALO","JOSE MIGUEL",
			"TOMAS","MOHAMED","AGUSTIN","MARTIN","JOSE RAMON","NICOLAS","FELIX",
			"JOAN","ISMAEL","CRISTIAN","SAMUEL","AITOR","HECTOR","JUAN FRANCISCO",
			"JOSEP","MARIANO","LUCAS","JOSE CARLOS","IKER","DOMINGO","SEBASTIAN",
			"ALFREDO","ALEX","CESAR","FELIPE","JOSE ANGEL","JOSE IGNACIO",
			"VICTOR MANUEL","RODRIGO","LUIS MIGUEL","JOSE FRANCISCO","JUAN LUIS",
			"GREGORIO","XAVIER","ALBERT"
	};
	
	
	private static String apellidos[] = {
			"GARCIA","RODRIGUEZ","GONZALEZ","FERNANDEZ","LOPEZ","MARTINEZ","SANCHEZ",
			"PEREZ","GOMEZ","MARTIN","JIMENEZ","RUIZ","HERNANDEZ","DIAZ","MORENO",
			"MUÑOZ","ALVAREZ","ROMERO","ALONSO","GUTIERREZ","NAVARRO","TORRES",
			"DOMINGUEZ","VAZQUEZ","RAMOS","GIL","RAMIREZ","SERRANO","BLANCO",
			"MOLINA","MORALES","SUAREZ","ORTEGA","DELGADO","CASTRO","ORTIZ","RUBIO",
			"MARIN","SANZ","NUÑEZ","IGLESIAS","MEDINA","CORTES","GARRIDO","CASTILLO",
			"SANTOS","LOZANO","GUERRERO","CANO","PRIETO","MENDEZ","CRUZ","CALVO",
			"HERRERA","GALLEGO","FLORES","MARQUEZ","LEON","PEÑA","VIDAL","CABRERA",
			"CAMPOS","VEGA","FUENTES","CARRASCO","DIEZ","REYES","CABALLERO","NIETO",
			"AGUILAR","SANTANA","PASCUAL","HERRERO","MONTERO","HIDALGO","LORENZO",
			"GIMENEZ","IBAÑEZ","FERRER","SANTIAGO","DURAN","VARGAS","BENITEZ","MORA",
			"ARIAS","VICENTE","CARMONA","CRESPO","ROMAN","SOTO","PASTOR","SAEZ",
			"VELASCO","MOYA","SOLER","PARRA","ROJAS","GUARDIOLA","BRAVO","GALLARDO"
	};
	
	private static String nombresFemeninos[] = {
			"MARIA CARMEN","MARIA","CARMEN","JOSEFA","ANA MARIA","ISABEL","MARIA PILAR",
			"MARIA DOLORES","LAURA","MARIA TERESA","ANA","CRISTINA","MARIA ANGELES",
			"MARTA","FRANCISCA","ANTONIA","MARIA ISABEL","MARIA JOSE","LUCIA",
			"DOLORES","SARA","PAULA","ELENA","MARIA LUISA","PILAR","RAQUEL","ROSA MARIA",
			"CONCEPCION","MANUELA","MERCEDES","MARIA JESUS","BEATRIZ","JULIA",
			"ROSARIO","NURIA","JUANA","SILVIA","TERESA","ENCARNACION","IRENE",
			"ALBA","PATRICIA","MONTSERRAT","ANDREA","ROCIO","ROSA","MONICA","ALICIA",
			"MARIA MAR","ANGELA","SONIA","SANDRA","MARINA","SUSANA","NATALIA",
			"YOLANDA","MARGARITA","MARIA JOSEFA","CLAUDIA","EVA","MARIA ROSARIO",
			"INMACULADA","MARIA MERCEDES","ANA ISABEL","ESTHER","CARLA","SOFIA",
			"NOELIA","VERONICA","ANGELES","NEREA","CAROLINA","MARIA VICTORIA",
			"EVA MARIA","MARIA ROSA","MIRIAM","INES","LORENA","AMPARO","ANA BELEN",
			"MARIA CONCEPCION","MARIA ELENA","VICTORIA","DANIELA","MARIA ANTONIA",
			"CATALINA","LIDIA","CONSUELO","MARIA NIEVES","CELIA","ALEJANDRA",
			"MARTINA","OLGA","GLORIA","EMILIA","AINHOA","LUISA","FATIMA","MARIA SOLEDAD",
			"AURORA","VEGA","DENEB","ALTAIR","ESTEL"
	};
	
	public static String getNombreAleatorio(String genero) {
		int posicion;
		if (genero.equalsIgnoreCase("Femenino")) {
			posicion = (int) (Math.random() * nombresFemeninos.length);
			return nombresFemeninos[posicion];
		} else {
			posicion = (int) (Math.random() * nombresMasculinos.length);
			return nombresMasculinos[posicion];
		}
		
	}
	
	public static String getApellidoAleatorio() {
		int posicion = (int) (Math.random() * apellidos.length);
		return apellidos[posicion];
	}
	
	
	public static int[] getContadorGenero() {
		return contadorGenero;
	}
	
	public static void setContadorGenero(String genero) {

		if (genero.equalsIgnoreCase("Masculino")) {
			contadorGenero[0]++;
		} else if (genero.equalsIgnoreCase("Femenino")) {
			contadorGenero[1]++;
		}
	}
	
	public static void mostrarEstadisticasGenero() {
		System.out.println("-----Estadisticas Genero-----");
		System.out.println("Mujeres: " + contadorGenero[1]);
		System.out.println("Hombres : " + contadorGenero[0]);
		System.out.println("-----------------------------------------");
	}
	
	public static int[] getContadorOrientacionSexual() {
		return contadorOrientacionSexual;
	}


	public static void setContadorOrientacionSexual(String orientacionSexual) {
		if (orientacionSexual != null) {
			switch (orientacionSexual) {
			case "Mujer Heterosexual":
				contadorOrientacionSexual[0]++;
				break;
			case "Hombre Heterosexual":
				contadorOrientacionSexual[1]++;
				break;
			case "Lesbiana":
				contadorOrientacionSexual[2]++;
				break;
			case "Gay":
				contadorOrientacionSexual[3]++;
				break;
		
			default:
				break;
			}
		}
		
	}
	
	public static void mostrarEstadisticasOrientacionSexual() {
		System.out.println("-----Estadisticas orientación Sexual-----");
		System.out.println("Mujeres Heterosexuales: " + 
							contadorOrientacionSexual[0]);
		System.out.println("Hombres Heterosexuales: " + 
				            contadorOrientacionSexual[1]);
		System.out.println("Lesbianas: " + 
				            contadorOrientacionSexual[2]);
		System.out.println("Gais: " + 
				            contadorOrientacionSexual[3]);
		System.out.println("-----------------------------------------");
	}
	
	
	// posicon: 0 negro, 1 rubio, 2 moreno, 3 pelirrojo, 4 blanco
	public static void setContadorColorCabello(String colorCabello) {
		if (colorCabello != null) {
			
			switch (colorCabello) {
			case "Negro":
				contadorColorCabello[0]++;
				break;
			case "Rubio":
				contadorColorCabello[1]++;
				break;
			case "Moreno":
				contadorColorCabello[2]++;
				break;
			case "Pelirrojo":
				contadorColorCabello[3]++;
				break;
			case "Blanco":
				contadorColorCabello[4]++;
				break;	
			default:
				break;
			}
		}
		
		
	}
	
	public static void mostrarEstadisticasColorCabello() {
		System.out.println("-----Estadisticas color de pelo-----");
		System.out.println("Negro : " + 	contadorColorCabello[0]);
		System.out.println("Rubio : " + contadorColorCabello[1]);
		System.out.println("Moreno : " + contadorColorCabello[2]);
		System.out.println("Pelirrojo : " + contadorColorCabello[3]);
		System.out.println("Blanco : " + contadorColorCabello[4]);
		System.out.println("-----------------------------------------");
	}
	
	public static int[] getContadorColorOjos() {
		return contadorColorOjos;
	}
	
	public static void setContadorColorOjos(String colorOjos) {
		if (colorOjos != null) {
			switch (colorOjos) {
			case "Marrón":
				contadorColorOjos[0]++;
				break;
			case "Verde":
				contadorColorOjos[1]++;
				break;
			case "Azul":
				contadorColorOjos[2]++;
				break;
			case "Heterocromía":
				contadorColorOjos[3]++;
				break;
			default:
				
				break;
			}
		}
				
	}
	
	public static void mostrarEstadisticasColorOjos() {
		System.out.println("-----Estadisticas color de ojos-----");
		System.out.println("Marrón : " + 	contadorColorOjos[0]);
		System.out.println("Verde : " + contadorColorOjos[1]);
		System.out.println("Azul : " + contadorColorOjos[2]);
		System.out.println("Heterocromía : " + contadorColorOjos[3]);
		System.out.println("-----------------------------------------");
	}
	
	
	//posicion: 0 Asiaticos, 1 indios, 2 moros, 3 negros, 4 blancos, 5 Latinos
	public static int[] getContadorPoblacion() {
		return contadorPoblacion;
	}
	
	public static void setContadorPoblacion(String poblacion) {
		if (poblacion != null) {
			switch (poblacion) {
			case "Asiática":
				contadorPoblacion[0]++;
				break;
			case "India":
				contadorPoblacion[1]++;
				break;
			case "Mora":
				contadorPoblacion[2]++;
				break;
			case "Negra":
				contadorPoblacion[3]++;
				break;
			case "Blanca":
				contadorPoblacion[4]++;
				break;
			case "Latina":
				contadorPoblacion[5]++;
				break;
			default:
				
				break;
			}
		}
		
		
		
	}
	
	public static void mostrarEstadisticasPoblacion() {
		System.out.println("-----Estadisticas población-----");
		System.out.println("Asiática : " + 	contadorPoblacion[0]);
		System.out.println("India : " + 	contadorPoblacion[1]);
		System.out.println("Mora : " + 	contadorPoblacion[2]);
		System.out.println("Negra : " + 	contadorPoblacion[3]);
		System.out.println("Blanca : " + 	contadorPoblacion[4]);
		System.out.println("Latina : " + 	contadorPoblacion[5]);
		System.out.println("-----------------------------------------");
	}
	


}
