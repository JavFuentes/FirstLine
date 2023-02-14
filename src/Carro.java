import java.time.LocalDate;
/**
 * @author JavFuentes
 *
 */

public class Carro {
	
	/*
	 * Atributos irrelevantes para el juego.
	 */
	private int cantidadOcupantes;
	private LocalDate fechaIngreso;
	
	/*
	 * Estos atributos son importantes, ya que indican donde se ubica en el tablero o
	 * desde donde comienza a construirse en caso de ser un carro de varias casillas.
	 */
	private int ubicacionFila;
	private int ubicacionColumna;
	
	/*
	 * Contructor con parámetros.
	 */	
	public Carro(int cantidadOcupantes, LocalDate fechaIngreso, int ubicacionFila, int ubicacionColumna) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.ubicacionFila = ubicacionFila;
		this.ubicacionColumna = ubicacionColumna;
	}	

	public Carro() {
		
	}

	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getUbicacionFila() {
		return ubicacionFila;
	}

	public void setUbicacionFila(int ubicacionFila) {
		this.ubicacionFila = ubicacionFila;
	}

	public int getUbicacionColumna() {
		return ubicacionColumna;
	}

	public void setUbicacionColumna(int ubicacionColumna) {
		this.ubicacionColumna = ubicacionColumna;
	}

	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", ubicacionFila="
				+ ubicacionFila + ", ubicacionColumna=" + ubicacionColumna + "]";
	}		
}


