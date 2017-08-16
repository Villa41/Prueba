package vista;
import java.util.ArrayList;
import java.util.List;

import controlador.ControladorDron;
import modelo.Dron;


public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArchivoIniDTO usDTO= new ArchivoIniDTO();
//		IniDAOArchivo usDAO= new IniDAOArchivo();
//		
//		ArchivoOutDTO usDTOE = new ArchivoOutDTO();
//		OutDAOArchivo usDAOE= new OutDAOArchivo();
//		
//		/**
//		 * Ejemplo Crear Usuario
//		 * */
//		usDTO.setTipoId("A");
//		usDTO.setNumId("D");
//		usDTO.setNomUs("D");
//		usDAO.crearUsuario(usDTO);
//		
//		usDTOE.setTipoId("1");
//		usDTOE.setNumId("2");
//		usDTOE.setNomUs("ORIENTE");
//		usDAOE.CREARPOSICION(usDTOE);
		
		
		String recorrido;
		List<String> recorridos = new ArrayList<String>();
		//PEDIDO1
		recorrido = "DD";
		recorridos.add(recorrido);
		
		//PEDIDO2
		recorrido = "AA";
		recorridos.add(recorrido);

		//PEDIDO3
		recorrido = "RI";
		recorridos.add(recorrido);
		
		Dron dron = new Dron();
		ControladorDron controladorDron = new ControladorDron(dron);
		
		controladorDron.entregarPedidos(recorridos);
		controladorDron.registrarPosicion();
 
	}

}
