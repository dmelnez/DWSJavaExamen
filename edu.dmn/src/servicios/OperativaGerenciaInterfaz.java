package servicios;

import java.util.List;

import dtos.ClienteDtos;

public interface OperativaGerenciaInterfaz {


	/**
	 * Metodo encargado de mostrar el menu de las opciones del gerente y redirigir al gerente a cada una 
	 * de ellas
	 * @param listaClientes | lista de todas los clientes
	 * * @author dmn 
	 * 101024
	 * */
	public void menuOpcionesGerencia(List<ClienteDtos>listaClientes);
}
