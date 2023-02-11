import java.time.LocalDate;

public class Caguano extends Carro {

	private int alcanceTiro;
	private String colorConfeti;
	
	public Caguano(int cantidadOcupantes, LocalDate fechaIngreso, int ubicacionFila, int ubicacionColumna,
			int alcanceTiro, String colorConfeti) {
		super(cantidadOcupantes, fechaIngreso, ubicacionFila, ubicacionColumna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}
	
	public Caguano() {
		
	}

	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	@Override
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	
	
}
