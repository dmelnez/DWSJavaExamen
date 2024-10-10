package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.ClienteDtos;



public class OperativaGerenciaImplementacion implements OperativaGerenciaInterfaz {

	Scanner sc = new Scanner(System.in);
	FicheroLogInterfaz fi = new FicheroLogImplemtacion();
	String mensajeLog = "aaaaa";
	
	public void menuOpcionesGerencia(List<ClienteDtos>listaClientes) {
		

		MenuInterfaz me = new MenuImplementacion();
		
	
		
		boolean esCerrar = false;
		
		try {
			
			do {
				
				int seleccionUsu = me.menugerencia();
				
				switch(seleccionUsu) {
				
				case 0:
					System.out.println("[INFO] - Se subira un menu.");
					mensajeLog = "Se subira un menu. ";
					fi.ficheroLog(mensajeLog);
					esCerrar = true;
					break;
				
				case 1:
					System.out.println("[INFO] - Crear un nuevo cliente.");
					mensajeLog = "Seleccion -> Crear un nuevo cliente.";
					fi.ficheroLog(mensajeLog);
					altaCliente(listaClientes);
					esCerrar = true;
					
					break;
					
				default:
					System.err.println("[ALERTA] - Seleccion no valida.");
					mensajeLog = "Seleccion no valida del menu principal";
					fi.ficheroLog(mensajeLog);
					break;
				
				}
			}
			
			while(!esCerrar);
			
		} catch (Exception e) {
			System.err.println("[ALERTA] -> Se ha producido un error | Intenelo mas tarde");
			mensajeLog = e.getMessage();
			fi.ficheroLog(mensajeLog);
		}
		
		
		
	}
	
	/**
	 * Metodo encargado solicitar los datos al cliente, dar de alta al cliente. Y añadirlos a lista
	 * @param listaClientes
	 * @author dmn 101024
	 */
	private void altaCliente(List<ClienteDtos>listaClientes) {
		
		boolean esCerrar = false;
		
		do {
			ClienteDtos nuevoCliente = new ClienteDtos();
			
			
			
			nuevoCliente.setId(idAutogenerado(listaClientes));
			
			System.out.println("Nombre: ");
			String nombreClie = sc.next();
			
			nuevoCliente.setNombreCliente(nombreClie);
		
			System.out.println("Primer apellido: ");
			String primerApelliClie = sc.next();
			
			System.out.println("Segundo apellido: ");
			String segundoApelliClie = sc.next();
			
			String apellidosCliente = primerApelliClie + " " + segundoApelliClie;
			
			nuevoCliente.setApellidosCliente(apellidosCliente);
			
			listaClientes.add(nuevoCliente);
			
			System.out.println("¿Desea añadir otro cliente? S/N");
			String usuIntro = sc.next();
			
			if (usuIntro.equals("N")) {
				esCerrar = true;
			}
			
		} while (!esCerrar);
		
		
		
		
	}
	
	/**
	 * Metodo encargado de generar un id autonumerico, a cada cliente
	 * de clienes.
	 * @param listaClientes
	 * @author dmn 101024
	 * @return idAutogenerado | Id genereado
	 */
	private long idAutogenerado(List<ClienteDtos>listaClientes) {
		
		long idGenerado = 0;
		
		int tamanioLista = listaClientes.size();
		
		if (tamanioLista == 0) {
			
			idGenerado = 1;
		}
		
		else {
			idGenerado = listaClientes.get(tamanioLista - 1).getId() + 1;
		}
		return idGenerado;
	}
	
}
	

