package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.ClienteDtos;
import dtos.VentaDtos;
import servicios.FicheroLogImplemtacion;
import servicios.FicheroLogInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaEmpleadoImplementacion;
import servicios.OperativaEmpleadoInterfaz;
import servicios.OperativaGerenciaImplementacion;
import servicios.OperativaGerenciaInterfaz;

/**
 * Clase principal por la cual la aplicacion se lanza
 * @param args
 * @author dmn 101024
 */
public class Inicio {

	
	/**
	 * Metodo princiapl por la cual la aplicacion se ejecuta
	 * @param args
	 * @author dmn 101024
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<VentaDtos>listaVentas = new ArrayList<VentaDtos>();
		List<ClienteDtos>listaClientes = new ArrayList<ClienteDtos>();
		
		MenuInterfaz me = new MenuImplementacion();
		FicheroLogInterfaz fi = new FicheroLogImplemtacion();
		OperativaEmpleadoInterfaz ope = new OperativaEmpleadoImplementacion();
		OperativaGerenciaInterfaz opg = new OperativaGerenciaImplementacion();
		
		boolean esCerrar = false;
		
		String mensajeLog = "aaaaa";
		
		try {
			do {
				
				int seleccionMenu = me.menuPrincipal();
				
				switch(seleccionMenu) {
				
					case 0:
						System.out.println("[INFO] - Se cerrara la aplicacion.");
						mensajeLog = "La aplicacion se cerrara";
						fi.ficheroLog(mensajeLog);
						esCerrar = true;
						break;
					
					case 1:
						System.out.println("[INFO] - Menu empleado.");
						mensajeLog = "Menu Empleado";
						fi.ficheroLog(mensajeLog);
						ope.menuOpcionesEmpleado(listaVentas, listaClientes);
						break;
						
					case 2:
						System.out.println("[INFO] - Menu gerencia.");
						mensajeLog = "Menu Gerencia";
						fi.ficheroLog(mensajeLog);
						opg.menuOpcionesGerencia(listaClientes);
						break;
						
					default:
						System.err.println("[ALERTA] - Seleccion no valida.");
						mensajeLog = "Seleccion no valida del menu principal";
						fi.ficheroLog(mensajeLog);
						break;
				
				}
				
			} while (!esCerrar);
			
		} catch (Exception e) {
			System.err.println("[ALERTA] -> Se ha producido un error | Intenelo mas tarde");
			mensajeLog = e.getMessage();
			fi.ficheroLog(mensajeLog);
		}
		
		
	}

}
