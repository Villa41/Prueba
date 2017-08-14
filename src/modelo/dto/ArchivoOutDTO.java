package modelo.dto;

import modelo.Dron;

public class ArchivoOutDTO {
	
	private int x, y;
	private String orientacion;
	
	
	public void toArchivoDTO(Dron dron) {
		this.x = dron.getX();
		this.y = dron.getY();
		this.orientacion = dron.getOrientacion();
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}
	
}