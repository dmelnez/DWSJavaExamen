package servicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDtos;
import dtos.VentaDtos;

public class OperativaEmpleadoImplementacion implements OperativaEmpleadoInterfaz {

	Scanner sc = new Scanner(System.in);
	MenuInterfaz me = new MenuImplementacion();
	FicheroLogInterfaz fi = new FicheroLogImplemtacion();
	
	public void menuOpcionesEmpleado(List<VentaDtos>listaCompras, List<ClienteDtos>listaClientes) {
		
		String mensajeLog = "aaaaa";
		boolean esCerrar = false;
		
		
		try {
			do {
				
				int seleccionUsu = me.menuEmpleado();
				
				switch(seleccionUsu) {
				
				case 0:
					System.out.println("[INFO] - Se subira un menu.");
					mensajeLog = "Se subira un menu.";
					fi.ficheroLog(mensajeLog);
					esCerrar = true;
					break;
				
				case 1:
					System.out.println("[INFO] - Calculo de ventas mensual.");
					mensajeLog = "Seleccion -> Calculo de ventas mensual";
					fi.ficheroLog(mensajeLog);
					calculoVentas(listaCompras);
					esCerrar = true;
					
					break;
					
				case 2:
					System.out.println("[INFO] - Añadir una nueva compra.");
					mensajeLog = "Seleccion -> Añadir una nueva compra";
					fi.ficheroLog(mensajeLog);
					aniadirCompra(listaCompras, listaClientes);
					esCerrar = true;
					break;
					
				default:
					System.err.println("[ALERTA] - Seleccion no valida.");
					mensajeLog = "Seleccion no valida del menu de empleado";
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
	 * Metodo encargado de solicitar el importe e id al usuario. Y añadirlo a la lista de ventas.
	 * @param listaCompras
	 * @param listaClientes
	 * @author dmn 101024
	 */
	private void aniadirCompra(List<VentaDtos>listaCompras, List<ClienteDtos>listaClientes) {
		
		boolean esCerrar = false;
		
		
		do {
			
			VentaDtos nuevaVenta = new VentaDtos();
			
			nuevaVenta.setId(idAutogenerado(listaCompras));
			
			System.out.println("Importe: ");
			double importeVenta = sc.nextDouble();
			nuevaVenta.setImporte(importeVenta);
			
			
			System.out.println("Id cliente: ");
			double idCliente = sc.nextDouble();
		
			// Comprobacion del id usuario existente.
			for (ClienteDtos clienteDtos : listaClientes) {
				if(clienteDtos.getId() == idCliente) {
					System.out.println("Venta registrada correctamente");
					listaCompras.add(nuevaVenta);
				}
			}
			
			System.out.println("¿Desea añadir otra compra? S/N");
			String usuIntro = sc.next();
			
			if (usuIntro.equals("N")) {
				esCerrar = true;
			}
			
			
		} while (!esCerrar);
		

	}
	
	
	
	/**
	 * Metodo encargado de generar un id autonumerico, a cada compra
	 * @param listaCompras
	 * @author dmn 101024
	 * @return idAutogenerado | Id genereado
	 */
	private long idAutogenerado(List<VentaDtos>listaCompras) {
		
		long idGenerado = 0;
		
		int tamanioLista = listaCompras.size();
		
		if (tamanioLista == 0) {
			
			idGenerado = 1;
		}
		
		else {
			idGenerado = listaCompras.get(tamanioLista - 1).getId() + 1;
		}
		return idGenerado;
	}
	
	/**
	 * Metodo encargado de solicitar un mes y año. Y calcular las ventas totales de ese mes y año
	 * @param listaVentas
	 * @author dmn 101024
	 */
	private void calculoVentas(List<VentaDtos>listaVentas) {
		
		System.out.println("Fecha a calcular (MM-yyyy)");
		String fechaIntro = sc.next();
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat("MM-yyyy");
		
		try {
			Date fechaFormateada = formatoFecha.parse(fechaIntro);
			
			double totalVentaMes;
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}
