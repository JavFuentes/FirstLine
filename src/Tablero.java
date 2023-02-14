import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author JavFuentes
 */

public class Tablero {
	
	/**
	 * Arreglo que contiene los carros que desplegarán las fuerzas del órden.
	 */
	private Carro carros[];
	
	/**
	 * ArrayList que contiene los huevos lanzados.
	 */
	private ArrayList<Huevo> huevos;
	
	/**
	 * Se establece una matriz de 15 x 15 que representa el tablero de juego.
	 */		
	private final int SIZE = 15;
	private char[][] casilla = new char[SIZE][SIZE];
		
	/**
	 * Se establecen los símbolos que representarán los distintos estados que puede 
	 * tener una casilla del tablero.
	 */	
	private final char CALLE = '*';
	private final char HUEVO = 'H';
	private final char TRUPALLA = 'T';
	private final char CAGUANO = 'C';
	private final char KROMI = 'K';
	
	/**
	 * Atributo que guarda el puntaje obtenido por el jugador en cada partida.
	 */	
	private int puntaje;
	
	/**
	 * Constructor con parámetros.
	 */	
	public Tablero(Carro[] carros, ArrayList<Huevo> huevos) {
		this.carros = carros;
		this.huevos = huevos;		
	}
	
	public Tablero() {
		
	}
	
	/**
	 * Se crea la matriz inicial, que representa las calles vacías, justo antes del despliegue de PKS.
	 */	
	public void crearTableroInicial() {
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				casilla[i][j] = CALLE;				
			}
		}
	}
	
	/**
	 * Método que imprime el tablero, reservado unicamente para testeo, ya que el jugador no debe acceder
	 * a la información sobre la ubicación exacta del enemigo.
	 */
	public void mostrarTablero() {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {					
				System.out.print(" " + casilla[j][i] + " ");
			} System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * Método que imprime el tablero, ocultando la ubicación de los carros enemigos.
	 */
	public void mostrarTableroSinVision() {
		System.out.print("  ");
		for(int k = 0; k < SIZE;k++) {
			if(k < 10) {
				System.out.print("  " + (k + 1) + "  ");
			}else {
				System.out.print(" " + (k + 1) + "  ");
			}
			
		}System.out.println();
		
		for(int i = 0; i < SIZE; i++) {
			if(i < 9) {
				System.out.print((i + 1) + " ");	
			} else {
				System.out.print(i + 1);
			}
			
			for(int j = 0; j < SIZE; j++) {	
				if(casilla[i][j] == HUEVO) {
					System.out.print("  " + HUEVO + "  ");
				} else {
					System.out.print("  " + CALLE + "  ");
				}				
			} System.out.println(); 
		}
		System.out.println();
	}
		
	/**
	 * Método que retorna la suma del puntaje obtenido con cada lanzamiento.
	 */
	public int mostrarPuntaje() {
		puntaje = 0;		
		for(Huevo huevo : huevos) {
			puntaje += huevo.getPuntaje();
		}
		return puntaje;
	}
	
	/**
	 * Método que retorna la cantidad de huevos lanzados.
	 */
	public int contarLanzamientos() {
		int lanzamientos = 0;
		for (Huevo huevo : huevos) {
			   lanzamientos++;
		}
		return lanzamientos;
	}
	
	/**
	 * Método que añade un huevo a la lista de huevos lanzados.
	 */
	public void agregarHuevo(Huevo huevo) {
	      huevos.add(huevo);
	}
	
	public Carro[] getCarros() {
		return carros;
	}

	public void setCarros(Carro[] carros) {
		this.carros = carros;
	}

	public ArrayList<Huevo> getHuevos() {
		return huevos;
	}

	public void setHuevos(ArrayList<Huevo> huevos) {
		this.huevos = huevos;
	}
			
	public int getSIZE() {
		return SIZE;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public char getCALLE() {
		return CALLE;
	}

	public char getHUEVO() {
		return HUEVO;
	}

	public char getTRUPALLA() {
		return TRUPALLA;
	}

	public char getCAGUANO() {
		return CAGUANO;
	}

	public char getKROMI() {
		return KROMI;
	}
	
	/**
	 * Método que permite cambiar el estado de una casilla del tablero.
	 */
	public void setCasilla(int fila, int columna, char valor) {		
	    this.casilla[fila][columna] = valor;	}

	/**
	 * Método que permite obtener el estado de una casilla del tablero.
	 */
	public char[][] getCasilla() {
		return casilla;
	}	
}
	
	
		

