import java.util.Scanner;

public class GameManager {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		menuPrincipal();
		
	}
	
	public static void menuPrincipal() {
		String opcion = "";
		
		while(!opcion.matches("[1-2]{1}")) {
			System.out.println("--- FIRST LINE ---");
			System.out.println("------------------");
			System.out.println("1. Nuevo Juego. ");
			System.out.println("2. Salir. ");
			System.out.println("------------------");
			
			opcion = sc.nextLine();
		}
		
		
		
		switch(opcion) {
			case "1":
				
				break;
			case "2":
				
				break;
		}
	}
}
