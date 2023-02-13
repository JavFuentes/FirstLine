import java.util.ArrayList;
import java.util.Random;
import java.math.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class Juego {
	public static int coordenadaX;
	public static int coordenadaY;

	static Kromi kromis[] = new Kromi[3];

	static Caguano caguanos[] = new Caguano[5];

	static Trupalla trupallas[] = new Trupalla[10];

	static Tablero tablero = new Tablero(new Carro[] { kromis[0], kromis[1], kromis[2], caguanos[0], caguanos[1],
			caguanos[2], caguanos[3], caguanos[4], trupallas[0], trupallas[1], trupallas[2], trupallas[3], trupallas[4],
			trupallas[5], trupallas[6], trupallas[7], trupallas[8], trupallas[9] }, new ArrayList<Huevo>());

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

	public static void crearPartida() {

		tablero.crearTableroInicial();

		despliegueKromis();
		despliegueCaguanos();
		despliegueTrupallas();
	}

	public static void comenzarPartida() {
		while (true) {
			tablero.mostrarTableroSinVision();
			nuevoLanzamiento();
			System.out.println("[Puntaje: " + tablero.mostrarPuntaje() + " ]");			
			System.out.println();
		}
	}

	public static void generarCoordenadasAleatorias() {
		coordenadaX = random.nextInt(13);
		coordenadaY = random.nextInt(12);
	}

	public static void despliegueKromis() {

		boolean posicionado = false;

		for (Kromi kromi : kromis) {
			do {
				posicionado = false;
				generarCoordenadasAleatorias();

				if (tablero.getCasilla()[coordenadaX][coordenadaY] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][coordenadaY + 1] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX][coordenadaY + 2] == tablero.getCALLE()) {

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

	public static void despliegueCaguanos() {

		boolean posicionado = false;

		for (Caguano caguano : caguanos) {
			do {
				posicionado = false;
				generarCoordenadasAleatorias();

				if (tablero.getCasilla()[coordenadaX][coordenadaY] == tablero.getCALLE()
						&& tablero.getCasilla()[coordenadaX + 1][coordenadaY] == tablero.getCALLE()) {

					// caguano.setUbicacionFila(coordenadaX);
					// caguano.setUbicacionColumna(coordenadaY);

					tablero.setCasilla(coordenadaX, coordenadaY, tablero.getCAGUANO());
					tablero.setCasilla(coordenadaX + 1, coordenadaY, tablero.getCAGUANO());

					posicionado = true;
				}
			} while (!posicionado);
		}
	}

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

	public static void nuevoLanzamiento() {

		int fila = 0;
		int columna = 0;
		int puntaje = 0;

		System.out.println("Seleccione fila y columna donde lanzará el huevo. ");
		System.out.println("Si desea terminar la partida escriba cero. ");
		System.out.println("Fila: ");
		fila = Integer.valueOf(sc.nextLine()) - 1;
		System.out.println("Columna: ");
		columna = Integer.valueOf(sc.nextLine()) - 1;
		
		if(fila < 0 || columna < 0) {
			System.out.println("[Puntaje Total: " + tablero.mostrarPuntaje() + "]");
			System.out.println("[Total huevos lanzados: " + tablero.contarLanzamientos()+ " ]");
			System.out.println();
			menuPrincipal();
		}
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
			// Hay un bug cuando existan 2 Kromis juntas en la misma columna
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
