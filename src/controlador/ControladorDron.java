package controlador;

import java.util.List;

import modelo.DesplazarDron;
import modelo.Dron;
import modelo.dao.IniDAOArchivo;
import modelo.dao.OutDAOArchivo;
import modelo.dto.ArchivoIniDTO;
import modelo.dto.ArchivoOutDTO;
import modelo.enumeracion.TipoOrientacion;

public class ControladorDron {
	
	private DesplazarDron desplazarDron;
	private Dron  dron;
	
	

	public ControladorDron (Dron  dron){
		desplazarDron = new DesplazarDron(dron);
		this.dron = dron; // con esta linea ya puede tener el dron diferente de nulo
		//asdasdasdasdasdasdasdasdf
	}
	
	/**
	 * validar que se hagan 3 pedidos
	 */
	public void entregarPedidos(List<String> recorridos){
		if(recorridos.size() == 3){
			//ciclo pedidos
			for (String recorrido : recorridos){
				
				
				//aqui en este punto el objeto dron es nulo porque el dron que recibe el controlador se le envia al constructor del objeto desplazar dron
				
				ArchivoIniDTO initDTO = new ArchivoIniDTO();
				initDTO.setRecorrido(recorrido);
				
				IniDAOArchivo iniDAOArchivo = new IniDAOArchivo();
				iniDAOArchivo.guardarDesplazamiento(initDTO);
				
				char[] listaDesplazamientos = recorrido.toCharArray();
				//ciclo de desplazamientos
				for(char desplazamiento : listaDesplazamientos){
					TipoOrientacion tipoOrientacion = TipoOrientacion.get(desplazamiento+"");
					
					switch (tipoOrientacion) {
					case ARRIBA:
						desplazarDron.moverArriba();
						break;
					case ATRAS:
						desplazarDron.moverAtras();
						break;
					case DERECHA:
						desplazarDron.moverDerecha();
						break;
					case IZQUIERDA:
						desplazarDron.moverIzquierda();
						break;
					default:
						break;
					}
				}
			}
			
		} else{
			System.out.println("no presenta los 3 recorridos requeridos");
		}
	}
	/**
	 * guardar en archivo la posicion luego de hacer los tres pedidos
	 */
	public void registrarPosicion(){
		
		dron = desplazarDron.getDron();
		//TODO guardar en archivo out.txt
		String posicion = dron.getX()+","+dron.getY()+","+dron.getOrientacion();
		System.out.println("out.txt: "+posicion);
		
		ArchivoOutDTO archivoOutDTO = new ArchivoOutDTO();
		archivoOutDTO.toArchivoDTO(dron);
		
//		archivoOutDTO.setX(dron.getX());
//		archivoOutDTO.setY(dron.getY());
//		archivoOutDTO.setOrientacion(dron.getOrientacion());
		
		OutDAOArchivo outDAOArchivo = new OutDAOArchivo();
		outDAOArchivo.guardarPosicion(archivoOutDTO);

	}
}
