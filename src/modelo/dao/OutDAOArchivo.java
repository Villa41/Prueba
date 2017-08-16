package modelo.dao;

import java.io.BufferedReader;
import java.io.PrintWriter;
//import java.util.ArrayList;

import modelo.ConexionArchivoIni;
import modelo.dto.ArchivoIniDTO;
import modelo.dto.ArchivoOutDTO;

public class OutDAOArchivo implements InterfazArchivoDAO {

	ConexionArchivoIni conFile = null;
	PrintWriter pw = null;
	BufferedReader br = null;
	

	@Override
	public void guardarPosicion(ArchivoOutDTO usE) {
		try {

			conFile = new ConexionArchivoIni("datos\\posicion\\out.txt");
			pw = conFile.getConexionEscritura();
			pw.println(usE.getX() + ", " + usE.getY() + ", " + usE.getOrientacion());

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
	
	@Override
	public void guardarDesplazamiento(ArchivoIniDTO us) {
		// TODO Auto-generated method stub

	}

}