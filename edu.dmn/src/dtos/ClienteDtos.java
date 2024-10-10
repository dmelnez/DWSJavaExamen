package dtos;

/**
 * Clase que contiene todos los atributos que compondran a un cliente
 * @author dmn 101024
 */
public class ClienteDtos {

	long id;
	
	String nombreCliente = "aaaaa";
	
	String apellidosCliente = "aaaaa";
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidosCliente() {
		return apellidosCliente;
	}

	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}


	
	public ClienteDtos(long id, String nombreCliente, String apellidosCliente) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
	}

	public ClienteDtos() {
		super();
	}


	
}
