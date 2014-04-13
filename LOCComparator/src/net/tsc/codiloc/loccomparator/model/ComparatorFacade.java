package net.tsc.codiloc.loccomparator.model;

import java.util.List;

/**
 * Fachada para la comparación de código fuente.
 * 
 * @author Technologycal Synergy Company
 * @version 1.0
 */
public class ComparatorFacade {

	/**
	 * Obtener las líneas de código adicionadas en el archivo modificado.
	 * 
	 * @param originalLines
	 *            Código fuente original
	 * @param modifiedLines
	 *            Código fuente modificado
	 * @return Lista de líneas de código adicionadas
	 */
	public List<ComparedLine> getAddedLOC(List<String> originalLines,
			List<String> modifiedLines) {
		return null;
	}

	/**
	 * Obtener las líneas de código eliminadas en el archivo modificado.
	 * 
	 * @param originalLines
	 *            Código fuente original
	 * @param modifiedLines
	 *            Código fuente modificado
	 * @return Lista de líneas de código eliminadas
	 */
	public List<ComparedLine> getDeletedLOC(List<String> originalLines,
			List<String> modifiedLines) {
		return null;
	}

}
