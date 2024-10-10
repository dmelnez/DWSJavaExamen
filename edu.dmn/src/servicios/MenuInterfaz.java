package servicios;

public interface MenuInterfaz {

	/**
	 * Metodo encargado de mostrar el menu principal al usuario y recoger la seleccion del mismo.
	 * @return seleccionUsu -> Seleccion del usuario
	 * @author dmn 
	 * 101024
	 */
	public int menuPrincipal();
	
	
	/**
	 * Metodo encargado de mostrar el menu de empleado al usuario y recoger la seleccion del mismo.
	 * @return seleccionUsu -> Seleccion del usuario
	 * @author dmn 
	 * 101024
	 */
	public int menuEmpleado();
	
	
	/**
	 * Metodo encargado de mostrar el menu de gerencia al usuario y recoger la seleccion del mismo.
	 * @return seleccionUsu -> Seleccion del usuario
	 * @author dmn 
	 * 101024
	 */
	public int menugerencia();
	
}
