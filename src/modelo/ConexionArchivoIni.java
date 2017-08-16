package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ConexionArchivoIni {
	
		private String ruta;
		
	public ConexionArchivoIni(String p){
		
		this.ruta=p;
		
	}	
		
	public PrintWriter getConexionEscritura(){
		
	      FileWriter archivo = null;
	      PrintWriter pw = null;
	        
	        try
	        {
	        	archivo = new FileWriter(ruta, true);
	            pw = new PrintWriter(archivo);

	        }catch (Exception e) {
	            e.printStackTrace();
	        } 
	        return pw;
		
	}	
	
	public BufferedReader getConexionLectura(){
		
		  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      
	      try{
	    		archivo = new File (ruta);
	    		fr = new FileReader (archivo);
	    		br = new BufferedReader(fr);
	    	
	      }catch(Exception ex){
	    	  ex.printStackTrace();
	      }
	      return br;
	}
}