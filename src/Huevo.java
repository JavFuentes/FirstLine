/**
 * @author JavFuentes
 *
 */

public class Huevo {
	
	/*
	 * Atributos que indican las coordenadas donde fue lanzado el huevo.
	 */
	private int fila;
	private int columna;
	
	/*
	 * Atributo que indica el puntaje obtenido con el lanzamiento.
	 */
	private int puntaje;
		
	/*
	 * Contructor con parámetros.
	 */	
	public Huevo(int fila, int columna, int puntaje) {
		
		this.fila = fila;
		this.columna = columna;
		this.puntaje = puntaje;
	}

	public Huevo() {
		
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public String toString() {
		return "Huevo [fila=" + fila + ", columna=" + columna + ", puntaje=" + puntaje + "]";
	}	
	
	
}
