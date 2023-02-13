import java.util.ArrayList;
import java.util.Random;
import java.math.*;
import java.util.Arrays;
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
			trupallas[5], trupallas[6], trupallas[7], trupallas[8], trupallas[9] }, null);

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
			System.out.println("1. Nuevo Juego. ");
			System.out.println("2. Salir. ");
			System.out.println("------------------");

			opcion = sc.nextLine();
		}

		switch (opcion) {
		case "1":
			crearPartida();

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

		// Testing
		tablero.mostrarTablero();

	}

	public static void generarCoordenadasAleatorias() {
		coordenadaX = random.nextInt(12);
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

			    	//kromi.setUbicacionFila(coordenadaX);
					//kromi.setUbicacionColumna(coordenadaY);						

					tablero.setCasilla(coordenadaX, coordenadaY, 'K');
					tablero.setCasilla(coordenadaX, coordenadaY + 1, 'K');
					tablero.setCasilla(coordenadaX, coordenadaY + 2, 'K');

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

					//caguano.setUbicacionFila(coordenadaX);
					//caguano.setUbicacionColumna(coordenadaY);

					tablero.setCasilla(coordenadaX, coordenadaY, 'C');
					tablero.setCasilla(coordenadaX + 1, coordenadaY, 'C');

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

					tablero.setCasilla(coordenadaX, coordenadaY, 'T');
					

					posicionado = true;
				}
			} while (!posicionado);
		}
	}
}
