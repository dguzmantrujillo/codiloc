package net.tsc.codiloc.loccomparator.model;

import java.util.List;

/**
 * Fachada para la comparaci�n de c�digo fuente.
 * 
 * @author Technologycal Synergy Company
 * @version 1.0
 */
public class ComparatorFacade {

	/**
	 * Obtener las l�neas de c�digo adicionadas en el archivo modificado.
	 * 
	 * @param originalLines
	 *            C�digo fuente original
	 * @param modifiedLines
	 *            C�digo fuente modificado
	 * @return Lista de l�neas de c�digo adicionadas
	 */
	public List<ComparedLine> getAddedLOC(List<String> originalLines,
			List<String> modifiedLines) {
		return null;
	}

	/**
	 * Obtener las l�neas de c�digo eliminadas en el archivo modificado.
	 * 
	 * @param originalLines
	 *            C�digo fuente original
	 * @param modifiedLines
	 *            C�digo fuente modificado
	 * @return Lista de l�neas de c�digo eliminadas
	 */
	public List<ComparedLine> getDeletedLOC(List<String> originalLines,
			List<String> modifiedLines) {
		return null;
	}

}
