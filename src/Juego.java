import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;

public class Juego {
	
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
				instanciarTodo();
				break;
			case "2":
				
				break;
		}
	}
	
	public static void instanciarTodo() {
						
		Kromi kromi[] = new Kromi[3];
				
		Caguano caguanos[] = new Caguano[5];
								
		Trupalla trupallas[] = new Trupalla[10];
		
		
		
		Tablero tablero = new Tablero(new Carro[]{kromi[0], kromi[1], kromi[2]}, 
				new ArrayList<Huevo>(Arrays.asList()));
	}
}
