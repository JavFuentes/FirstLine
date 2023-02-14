import java.time.LocalDate;
/**
 * @author JavFuentes
 *
 */

public class Kromi extends Carro {
	
	/*
	 * Atributos irrelevantes para el juego.
	 */
	private int anno;
	private String marca;
	
	/*
	 * Contructor con parámetros.
	 */	
	public Kromi(int cantidadOcupantes, LocalDate fechaIngreso, int ubicacionFila, int ubicacionColumna, int anno,
			String marca) {
		super(cantidadOcupantes, fechaIngreso, ubicacionFila, ubicacionColumna);
		this.anno = anno;
		this.marca = marca;
	}
	
	public Kromi() {
		
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [anno=" + anno + ", marca=" + marca + "]";
	}		
}
