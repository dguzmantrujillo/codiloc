package net.tsc.codiloc.versionmanager.model;

import java.util.List;

import net.tsc.codiloc.loccomparator.model.ComparedLine;

/**
 * Fachada para el manejo de versiones de código fuente.
 * 
 * @author Carolina Benavides <gc.benavides10@uniandes.edu.co>
 * @version 1.0
 */
public class VersionManagerFacade {

	/**
	 * Cuenta el número de líneas lógicas en el código fuente.
	 * 
	 * @param sourceCode
	 *            Código fuente
	 * @return Número de líneas
	 */
	public int countLOC(String sourceCode) {
		return 0;
	}

	/**
	 * Cuenta el número de líneas comparadas entre la versión origen y la
	 * versión modificada del código fuente.
	 * 
	 * @param comparedLine
	 *            Líneas comparadas entre dos versiones
	 * @return Número de líneas comparadas
	 */
	public int countComparedLOC(List<ComparedLine> comparedLine) {
		return 0;
	}

	/**
	 * Compara dos versiones de código fuente.
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
