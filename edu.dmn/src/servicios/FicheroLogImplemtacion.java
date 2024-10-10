package servicios;

import java.io.File;
import java.io.FileWriter;

public class FicheroLogImplemtacion implements FicheroLogInterfaz {

	public void ficheroLog(String mensajeLog) {
		
		String rutaFichero = "C:\\Users\\dmelnez\\Desktop\\Eclipse Proyectos\\edu.dmn\\ficheroLog.txt";
		
		File fichero = new File(rutaFichero);
		
		try (FileWriter escribir = new FileWriter(fichero, true))
		{
			
			escribir.write(mensajeLog + "\n");
			escribir.close();
			
		} catch (Exception io) {
			System.err.println("[ALERTA] -> Se ha producido un error | Intenelo mas tarde");
		}
		
	}
	
}
