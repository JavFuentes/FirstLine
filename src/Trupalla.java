import java.time.LocalDate;
/**
 * @author JavFuentes
 * @author UrzuaAlarcon
 * @author DavidToroH 
 */

public class Trupalla extends Carro {
	
	/*
	 * Atributos irrelevantes para el juego.
	 */
	private int nivelArmadura;
	private String conductor;
	
	/*
	 * Contructor con parámetros.
	 */
	public Trupalla(int cantidadOcupantes, LocalDate fechaIngreso, int ubicacionFila, int ubicacionColumna,
			int nivelArmadura, String conductor) {
		super(cantidadOcupantes, fechaIngreso, ubicacionFila, ubicacionColumna);
		this.nivelArmadura = nivelArmadura;
		this.conductor = conductor;
	}
	
	public Trupalla() {
		
	}
	
	public int getNivelArmadura() {
		return nivelArmadura;
	}
	
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}
	
	public String getConductor() {
		return conductor;
	}
	
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", conductor=" + conductor + "]";
	}	
}
