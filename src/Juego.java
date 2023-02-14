import java.util.ArrayList;
import java.util.Random;
import java.math.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
/**
 * @author JavFuentes
 */

public class Juego {
	
	/**
	 * Variables que en conjunto apuntan a una ubicación en el tablero.
	 */
	public static int coordenadaX;
	public static int coordenadaY;

	/**
	 * Se instancian los carros enemigos.
	 */
	static Kromi kromis[] = new Kromi[3];
	static Caguano caguanos[] = new Caguano[5];
	static Trupalla trupallas[] = new Trupalla[10];

	/**
	 * Se instancia un tablero.
	 */
	static Tablero tablero = new Tablero(new Carro[] { kromis[0], kromis[1], kromis[2], caguanos[0], caguanos[1],
			caguanos[2], caguanos[3], caguanos[4], trupallas[0], trupallas[1], trupallas[2], trupallas[3], trupallas[4],
			trupallas[5], trupallas[6], trupallas[7], trupallas[8], trupallas[9] }, new ArrayList<Huevo>());
	
	/**
	 *  Se instancian las clases Random y Scanner
	 */
	public static Random random = new Random();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		menuPrincipal();
	}

	public static void menuPrincipal() {
		String opcion = "";

		while (!opcion.matches("[1-2]{1}")) {
			System.out.println("--- FIRST LINE ---");
			System.out.println("------------------");
			System.out.println("1. Nueva Partida. ");
			System.out.println("2. Salir. ");
			System.out.println("------------------");

			opcion = sc.nextLine();
		}

		switch (opcion) {
		case "1":
			crearPartida();
			comenzarPartida();

			break;
		case "2":
			System.exit(0);
			break;
		}
	}
	
	/**
	 * Procedimiento que crea un nuevo tablero y dispone los carros enemigos.
	 */
	public static void crearPartida() {

		tablero.crearTableroInicial();

		despliegueKromis();
		despliegueCaguanos();
		despliegueTrupallas();
	}
	
	/**
	 * Procedimiento que muestra el tablero y pide las coordenadas para un nuevo lanzamiento, 
	 * de forma iterativa.
	 */
	public static void comenzarPartida() {
		while (true) {
			tablero.mostrarTableroSinVision();
			nuevoLanzamiento();
			System.out.println("[Puntaje: " + tablero.mostrarPuntaje() + " ]");			
			System.out.println();
		}
	}

	/**
	 * Procedimiento que genera una ubicación aleatoria en el tablero.
	 */
	public static void generarCoordenadasAleatorias() {
		coordenadaX = random.nextInt(13);
		coordenadaY = random.nextInt(12);
	}
	
	/**
	 * Procedimiento que ubica las Kromis en el tablero.
	 */
	public static void despliegueKromis() {

		boolean posicionado = false;

		for (Kromi kromi : kromis) {
			do {
				posicionado = false;
				generarCoordenadasAleatorias();
				
				/**
				 * Se restringe a una kromi por columna.
				 */
				if (tablero.getCasilla()[coordenadaX][0] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][1] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][2] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][3] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][4] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][5] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][6] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][7] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][8] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][9] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][10] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][11] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][12] == tablero.getCALLE()) {

					// kromi.setUbicacionFila(coordenadaX);
					// kromi.setUbicacionColumna(coordenadaY);

					tablero.setCasilla(coordenadaX, coordenadaY, tablero.getKROMI());
					tablero.setCasilla(coordenadaX, coordenadaY + 1, tablero.getKROMI());
					tablero.setCasilla(coordenadaX, coordenadaY + 2, tablero.getKROMI());

					posicionado = true;
				}
			} while (!posicionado);
		}
	}

	/**
	 * Procedimiento que ubica los Caguanos en el tablero.
	 */
	public static void despliegueCaguanos() {

		boolean posicionado = false;

		for (Caguano caguano : caguanos) {
			do {
				posicionado = false;
				generarCoordenadasAleatorias();
				
				/**
				 * Se restringe a un caguano por columna.
				 */
				if (tablero.getCasilla()[coordenadaX][coordenadaY] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX + 1][coordenadaY] == tablero.getCALLE()
						&& tablero.getCasilla()[0][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[1][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[2][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[3][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[4][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[5][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[6][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[7][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[8][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[9][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[10][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[11][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[12][coordenadaY] != tablero.getCAGUANO()
						&& tablero.getCasilla()[13][coordenadaY] != tablero.getCAGUANO()) {

					// caguano.setUbicacionFila(coordenadaX);
					// caguano.setUbicacionColumna(coordenadaY);

					tablero.setCasilla(coordenadaX, coordenadaY, tablero.getCAGUANO());
					tablero.setCasilla(coordenadaX + 1, coordenadaY, tablero.getCAGUANO());

					posicionado = true;
				}
			} while (!posicionado);
		}
	}

	/**
	 * Procedimiento que ubica las trupallas en el tablero.
	 */
	public static void despliegueTrupallas() {

		boolean posicionado = false;

		for (Trupalla trupalla : trupallas) {
			do {
				posicionado = false;
				generarCoordenadasAleatorias();

				if (tablero.getCasilla()[coordenadaX][coordenadaY] == tablero.getCALLE()) {

					// trupalla.setUbicacionFila(coordenadaX);
					// trupalla.setUbicacionColumna(coordenadaY);

					tablero.setCasilla(coordenadaX, coordenadaY, tablero.getTRUPALLA());

					posicionado = true;
				}
			} while (!posicionado);
		}
	}

	/**
	 * Procedimiento que lanza un huevo en las coordenadas que el usuario elige.
	 */
	public static void nuevoLanzamiento() {
		
		/**
		 * Variables que representan los atributos de la clase Huevo
		 */
		int fila = 0;
		int columna = 0;
		int puntaje = 0;
		
		/**
		 * Se pide al jugador que ingrese las coordenadas donde se lanzará el huevo.
		 */
		System.out.println("Seleccione fila y columna donde lanzar el huevo. ");
		System.out.println("Si desea terminar la partida digite 16. ");
		System.out.println("Fila: ");
		
		/**
		 * Se valida que se ingresen solo números para la variable fila
		 */
		fila = Integer.valueOf(sc.nextLine()) - 1;
		while(!String.valueOf(fila).matches("[0-9]{1,2}")) {
			System.out.println("[Error]");
			System.out.println("Fila: ");
			fila = Integer.valueOf(sc.nextLine()) - 1;
		}
		
		System.out.println("Columna: ");
		/**
		 * Se valida que se ingresen solo números para la variable columna
		 */
		columna = Integer.valueOf(sc.nextLine()) - 1;
		while(!String.valueOf(columna).matches("[0-9]{1,2}")) {
			System.out.println("[Error]");
			System.out.println("Columna: ");
			columna = Integer.valueOf(sc.nextLine()) - 1;
		}
		
		/**
		 * Si se ingresa un número fuera de rango la partida finalizará
		 */
		if(fila > 14 || columna > 14) {
			System.out.println("[Partida Finalizada]");
			System.out.println("[Puntaje Total: " + tablero.mostrarPuntaje() + "]");
			System.out.println("[Total huevos lanzados: " + tablero.contarLanzamientos()+ "]");
			System.out.println();
			menuPrincipal();
		}
		
		/**
		 * Se accede a la ubicación dada por las coordenadas y se determina si se acertó
		 * el lanzamiento , además se suma el puntaje si corresponde.
		 */
		switch (tablero.getCasilla()[fila][columna]) {
		case 'K':
			System.out.println("[HAS ACERTADO]");
			puntaje = 3;
			if (columna == 0) {
				if (tablero.getCasilla()[fila][columna + 1] != tablero.getKROMI()
						&& tablero.getCasilla()[fila][columna + 2] != tablero.getKROMI()) {
					System.out.println("[KROMI DERRIBADA]");
					puntaje += 10;
				}
			} else if (columna == 1) {
				if (tablero.getCasilla()[fila][columna + 1] != tablero.getKROMI()
						&& tablero.getCasilla()[fila][columna + 2] != tablero.getKROMI()
						&& tablero.getCasilla()[fila][columna - 1] != tablero.getKROMI()) {
					System.out.println("[KROMI DERRIBADA]");
					puntaje += 10;
				}
			} else {
				if (tablero.getCasilla()[fila][columna + 1] != tablero.getKROMI()
						&& tablero.getCasilla()[fila][columna + 2] != tablero.getKROMI()
						&& tablero.getCasilla()[fila][columna - 1] != tablero.getKROMI()
						&& tablero.getCasilla()[fila][columna - 2] != tablero.getKROMI()) {
					System.out.println("[KROMI DERRIBADA]");
					puntaje += 10;
				}
			}			
			break;
			
		case 'C':
			System.out.println("[HAS ACERTADO]");
			puntaje = 2;
			if(fila == 0) {
				if (tablero.getCasilla()[fila + 1][columna] != tablero.getCAGUANO()) {
					System.out.println("[CAGUANO DERRIBADO]");
					puntaje += 7;
				}
			}else {
				if (tablero.getCasilla()[fila + 1][columna] != tablero.getCAGUANO() &&
						tablero.getCasilla()[fila - 1][columna] != tablero.getCAGUANO()) {
					System.out.println("[CAGUANO DERRIBADO]");
					puntaje += 7;
				}
			}
			break;
		case 'T':
			System.out.println("[HAS ACERTADO]");
			puntaje = 1;
			break;
		case '*':
			System.out.println("[Tiro Fallido]");
			puntaje = 0;
			break;
		case 'H':
			System.out.println("[Tiro Fallido]");
			puntaje = 0;
			break;
		}

		tablero.setCasilla(fila, columna, tablero.getHUEVO());

		tablero.agregarHuevo(new Huevo(fila, columna, puntaje));
	}
}
