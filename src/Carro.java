import java.time.LocalDate;

public class Carro {
	
	private int cantidadOcupantes;
	private LocalDate fechaIngreso;
	private int ubicacionFila;
	private int ubicacionColumna;
	
	
	
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


