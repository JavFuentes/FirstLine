import java.time.LocalDate;

public class Trupalla extends Carro {

	private int nivelArmadura;
	private String conductor;
	
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
	
	
}
