package dtos;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

/**
 * Clase que contiene todos los atributos que compondran a una venta
 * @author dmn 101024
 */

public class VentaDtos {

	long id;
	
	long idCliente;
	
	double importe = 999999;
	
	LocalDateTime fchInstante = LocalDateTime.now();
	
	public VentaDtos() {
		super();
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public LocalDateTime getFchInstante() {
		return fchInstante;
	}


	public void setFchInstante(LocalDateTime fchInstante) {
		this.fchInstante = fchInstante;
	}


	
	public VentaDtos(long id, long idCliente, double importe, LocalDateTime fchInstante) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.importe = importe;
		this.fchInstante = fchInstante;
	}

	

	
	
	
}
