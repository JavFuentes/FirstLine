import java.util.ArrayList;

public class Tablero {
	private Carro carros[];
	private ArrayList<Huevo> huevos;
		
	private final int SIZE = 15;	
	private char[] filas = new char[SIZE];
	private char[] columnas = new char[SIZE];
	
	private final char CALLE = '-';
	private final char HUEVO = 'H';
	private final char TRUPALLA = 'T';
	private final char CAGUANO = 'C';
	private final char KROMI = 'K';
	
	private int puntaje;
	
		
	public Tablero(Carro[] carros, ArrayList<Huevo> huevos, char[] filas, char[] columnas, int puntaje) {
		this.carros = carros;
		this.huevos = huevos;
		this.filas = filas;
		this.columnas = columnas;
		this.puntaje = puntaje;
	}
	
	public Tablero() {
		
	}

	public void crearTableroInicial() {
		
		for(char fila : filas) {
			for(char casilla : columnas) {
				System.out.println();
			} System.out.println();
		}
	}
	
	public void mostrarTablero() {
		
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

	public char[] getFilas() {
		return filas;
	}

	public void setFilas(char[] filas) {
		this.filas = filas;
	}

	public char[] getColumnas() {
		return columnas;
	}

	public void setColumnas(char[] columnas) {
		this.columnas = columnas;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public int getSIZE() {
		return SIZE;
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
	
	
}
