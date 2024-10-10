package servicios;

import java.util.List;

import dtos.ClienteDtos;
import dtos.VentaDtos;

public interface OperativaEmpleadoInterfaz {

	/**
	 * Metodo encargado de mostrar el menu de las opciones del empleado y redirigir al empleado a cada una 
	 * de ellas
	 * @param listaVentas -> lista de todas las ventas  | listaClientes -> lista de todos los clientes.
	 * * @author dmn 
	 * 101024
	 * */
	public void menuOpcionesEmpleado(List<VentaDtos>listaCompras, List<ClienteDtos>listaClientes);
}
