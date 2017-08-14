package modelo.enumeracion;

import java.util.HashMap;
import java.util.Map;

public enum TipoOrientacion {
	ARRIBA("A","NORTE"),
	ATRAS("R","SUR"),
	DERECHA("D","ORIENTE"),
	IZQUIERDA("I","OCCIDENTE");
	
	private String codigoDesplazamiento ;
	private String codigoOrientacion;
	
	
	 private static final Map<String, TipoOrientacion> lookup = new HashMap<String, TipoOrientacion>();
	
	public String getCodigoDesplazamiento() {
		return codigoDesplazamiento;
	}

	public void setCodigoDesplazamiento(String codigoDesplazamiento) {
		this.codigoDesplazamiento = codigoDesplazamiento;
	}

	public String getCodigoOrientacion() {
		return codigoOrientacion;
	}

	public void setCodigoOrientacion(String codigoOrientacion) {
		this.codigoOrientacion = codigoOrientacion;
	}

	
	private TipoOrientacion(String codigoDesplazamiento,String codigoOrientacion) {
		this.codigoDesplazamiento = codigoDesplazamiento;
		this.codigoOrientacion = codigoOrientacion;
	}
	
	
	static {
        for (TipoOrientacion d : TipoOrientacion.values()) {
            lookup.put(d.getCodigoDesplazamiento(), d);
        }
    }
	
	public static TipoOrientacion get(String f ){
		return lookup.get(f);
	}
	
	
}
