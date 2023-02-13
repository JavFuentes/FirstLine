import java.util.ArrayList;
import java.util.Arrays;

public class Tablero {
	private Carro carros[];
	private ArrayList<Huevo> huevos;
			
	private final int SIZE = 15;
	private char[][] casilla = new char[SIZE][SIZE];
		
	private final char CALLE = '*';
	private final char HUEVO = 'H';
	private final char TRUPALLA = 'T';
	private final char CAGUANO = 'C';
	private final char KROMI = 'K';
	
	private int puntaje;
	
		
	public Tablero(Carro[] carros, ArrayList<Huevo> huevos) {
		this.carros = carros;
		this.huevos = huevos;		
	}
	
	public Tablero() {
		
	}

	public void crearTableroInicial() {
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				casilla[i][j] = CALLE;				
			}
		}
	}
	
	public void mostrarTablero() {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {								
				System.out.print(" " + casilla[j][i] + " ");
			} System.out.println();
		}
		System.out.println();
	}

	public void posicionarCarros() {
		
	}
	
	public void mostrarPuntaje() {
		
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
	
	public void setCasilla(int columna, int fila, char valor) {		
	    this.casilla[columna][fila] = valor;	}

	public char[][] getCasilla() {
		return casilla;
	}	
}
	
	
		

