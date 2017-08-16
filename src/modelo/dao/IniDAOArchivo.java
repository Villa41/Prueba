package modelo.dao;

import java.io.BufferedReader;
import java.io.PrintWriter;
//import java.util.ArrayList;

import modelo.ConexionArchivoIni;
import modelo.dto.ArchivoIniDTO;
import modelo.dto.ArchivoOutDTO;

public class IniDAOArchivo implements InterfazArchivoDAO {

	ConexionArchivoIni conFile= null;
	PrintWriter pw= null;
	BufferedReader br=null;
	
	public void guardarDesplazamiento (ArchivoIniDTO Des){
		try{
		
			conFile = new ConexionArchivoIni("datos\\cordenadas\\ini.txt");
			pw=conFile.getConexionEscritura();
			pw.println(Des.getRecorrido());
	   
		} catch (Exception e) {
           e.printStackTrace();
       } finally {
          
       	try {
        
       	if (pw != null)
        
       		pw.close();
       	
          } catch (Exception e2) {
             e2.printStackTrace();
          }
       }

		
	}
	
	/*public ArchivoIniDTO leerDesplazamiento( String datos){ 
		
		String linea=null;
		ArchivoIniDTO usDTO= new ArchivoIniDTO() ;
	try{
		
		conFile = new ConexionArchivoIni("datos\\cordenadas\\ini.txt");
		br= conFile.getConexionLectura();

		while((linea=br.readLine())!=null){
			
			if(linea.substring(3, 11).equalsIgnoreCase(datos)){
		
				usDTO.setTipoId(linea.substring(0, 2));
				usDTO.setNumId(linea.substring(3, 11));
				usDTO.setNomUs(linea.substring(12,18));
			}
           
			
		}
		br.close();
	}catch(Exception ex){
		ex.printStackTrace();
	}
	return usDTO;
    
	}*/

	@Override
	public void guardarPosicion(ArchivoOutDTO usE) {
	}

	/*@Override
	public ArchivoOutDTO leerPosicion(String datosE) {
		return null;
	}*/
	
}