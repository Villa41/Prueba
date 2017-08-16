package modelo.dao;

import modelo.dto.ArchivoIniDTO;
import modelo.dto.ArchivoOutDTO;

public interface InterfazArchivoDAO {
	
	public void guardarDesplazamiento (ArchivoIniDTO us);
	
	//public ArchivoIniDTO leerDesplazamiento( String datos);
	
	public void guardarPosicion (ArchivoOutDTO usE);
	
	//public ArchivoOutDTO leerPosicion( String datosE);
	
	
}