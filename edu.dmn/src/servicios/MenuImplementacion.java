package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	
	public int menuPrincipal() {
		
		System.out.println("## MENU PRINCIPAL ##");
		System.out.println("[0] -> Cerrar aplicacion.");
		System.out.println("[1] -> Menu empleado");
		System.out.println("[2] -> Menu gerencia.");
		
		int seleccionUsu = sc.nextInt();
		
		return seleccionUsu;
		
	}
	
	public int menuEmpleado() {
		
		System.out.println("## MENU EMPLEADO ##");
		System.out.println("[0] -> Subir un menu.");
		System.out.println("[1] -> Calculo de mentas mensual.");
		System.out.println("[2] -> Añadir una nueva compra.");
		
		int seleccionUsu = sc.nextInt();
		
		return seleccionUsu;
	}
	
	public int menugerencia() {
		
		System.out.println("## MENU GERENCIA ##");
		System.out.println("[0] -> Subir un menu.");
		System.out.println("[1] -> Crea un nuevo cliente.");
		
		int seleccionUsu = sc.nextInt();
		
		return seleccionUsu;
	}
	
}


