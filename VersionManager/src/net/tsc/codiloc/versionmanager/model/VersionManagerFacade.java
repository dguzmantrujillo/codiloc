package net.tsc.codiloc.versionmanager.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import net.tsc.codiloc.loccomparator.exception.ComparatorException;
import net.tsc.codiloc.loccomparator.model.ComparatorFacade;
import net.tsc.codiloc.loccomparator.model.ComparedLine;
import net.tsc.codiloc.loccounter.model.LOCFacade;

/**
 * Fachada para el manejo de versiones de c�digo fuente.
 * 
 * @author Carolina Benavides <gc.benavides10@uniandes.edu.co>
 * @version 1.0
 */
public class VersionManagerFacade {

	/**
	 * logger - Bit�cora
	 */
	private static Logger logger = Logger.getLogger(ComparatorFacade.class.getName());

	/**
	 * instance - Instancia singleton.
	 */
	private static VersionManagerFacade instance;

	private int addedLines;
	private int deletedLines;
	private int totalLines;
	private List<ComparedLine> addedLinesList;
	private List<ComparedLine> deletedLinesList;

	/**
	 * Inicializa la fachada asegurando el singleton.
	 */
	public VersionManagerFacade() {
	}

	/**
	 * Crea una instancia singleton de <code>VersionManagerFacade</code>.
	 */
	private static synchronized void createInstance() {
		if (instance == null) {
			instance = new VersionManagerFacade();
		}
	}

	/**
	 * Obtiene una instancia singleton de <code>VersionManagerFacade</code>.
	 * 
	 * @return Instancia singleton de <code>VersionManagerFacade</code>.
	 */
	public static VersionManagerFacade getInstance() {
		createInstance();
		return instance;
	}

	/**
	 * Cuenta el n�mero de l�neas l�gicas en el c�digo fuente.
	 * 
	 * @param sourceCode
	 *            C�digo fuente
	 * @return N�mero de l�neas
	 */
	public int countLOC(String sourceCode) {
		LOCFacade counter = new LOCFacade(); // pendiente de ajustar con el
												// proyecto
		return counter.count(sourceCode);
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
		return comparedLine.size();
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

		// Convertir archivos a listas de l�neas
		List<String> originalLine = new ArrayList<>();
		List<String> modifiedLine = new ArrayList<>();

		ComparatorFacade comparator = ComparatorFacade.getInstance();

		try {
			addedLinesList = comparator.getAddedLOC(originalLine, modifiedLine);
			deletedLinesList = comparator.getDeletedLOC(originalLine, modifiedLine);

			addedLines = countComparedLOC(addedLinesList);
			deletedLines = countComparedLOC(deletedLinesList);
			totalLines = countLOC("ComparatorFacade comparator = ComparatorFacade.getInstance();");

		} catch (ComparatorException e) {
			logger.severe(e.getMessage());
			System.exit(-1);
		}

		return "En proceso...";
	}

	public void print() {
		logger.info("RESULTADO DE LA COMPARACION");
		logger.info("\nL�neas adicionadas: " + addedLines);

		for (ComparedLine line : addedLinesList) {
			logger.info(line.getTextLineNumber() + " - " +line.getTextLine());
		}

		logger.info("\nL�neas eliminadas: " + deletedLines);

		for (ComparedLine line : deletedLinesList) {
			logger.info(line.getTextLineNumber() + " - " +line.getTextLine());
		}

		logger.info("\nL�neas totales: " + totalLines);
	}
}
