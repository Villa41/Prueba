package modelo;

import modelo.enumeracion.TipoOrientacion;

public class DesplazarDron {
	
	private Dron dron;
	
	
	public DesplazarDron(Dron dron) {
		this.dron = dron;
	}

	public void moverArriba(){
		dron.setY(dron.getY()+1);
		dron.setOrientacion(TipoOrientacion.ARRIBA.getCodigoOrientacion());
	}
	
	public void moverAtras(){
		dron.setY(dron.getY()-1);
		dron.setOrientacion(TipoOrientacion.ATRAS.getCodigoOrientacion());
	}
	
	public void moverDerecha(){
		dron.setX(dron.getX()+1);
		dron.setOrientacion(TipoOrientacion.DERECHA.getCodigoOrientacion());
	}

	public void moverIzquierda(){
		dron.setX(dron.getX()-1);
		dron.setOrientacion(TipoOrientacion.IZQUIERDA.getCodigoOrientacion());
	}

	public Dron getDron() {
		return dron;
	}

	public void setDron(Dron dron) {
		this.dron = dron;
	}
	
}