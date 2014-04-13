package net.tsc.codiloc.versionmanager.model;

import java.util.List;

import net.tsc.codiloc.loccomparator.model.ComparedLine;

/**
 * Fachada para el manejo de versiones de c�digo fuente.
 * 
 * @author Carolina Benavides <gc.benavides10@uniandes.edu.co>
 * @version 1.0
 */
public class VersionManagerFacade {

	/**
	 * Cuenta el n�mero de l�neas l�gicas en el c�digo fuente.
	 * 
	 * @param sourceCode
	 *            C�digo fuente
	 * @return N�mero de l�neas
	 */
	public int countLOC(String sourceCode) {
		return 0;
	}

	/**
	 * Cuenta el n�mero de l�neas comparadas entre la versi�n origen y la
	 * versi�n modificada del c�digo fuente.
	 * 
	 * @param comparedLine
	 *            L�neas comparadas entre dos versiones
	 * @return N�mero de l�neas comparadas
	 */
	public int countComparedLOC(List<ComparedLine> comparedLine) {
		return 0;
	}

	/**
	 * Compara dos versiones de c�digo fuente.
	 * 
	 * @param originalFilePath
	 *            Ruta del archivo fuente original
	 * @param modifiedFilePath
	 *            Ruta del archivo fuente modificado
	 * @return Ruta del nuevo archivo fuente generadom
	 */
	public String compareVersions(String originalFilePath,
			String modifiedFilePath) {
		return null;
	}
}
