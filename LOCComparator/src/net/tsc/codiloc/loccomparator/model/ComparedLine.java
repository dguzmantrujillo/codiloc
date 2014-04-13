package net.tsc.codiloc.loccomparator.model;

/**
 * Clase que representa una línea de código comparada y su ubicación dentro del
 * archivo fuente.
 * 
 * @author Technologycal Synergy Company
 * @version 1.0
 */
public class ComparedLine {

	/**
	 * Línea de código.
	 */
	private String textLine;
	/**
	 * Ubicación de la línea de código.
	 */
	private int textLineNumber;

	/**
	 * @return Línea de código
	 */
	public String getTextLine() {
		return textLine;
	}

	/**
	 * @param textLine
	 *            Línea de código
	 */
	public void setTextLine(String textLine) {
		this.textLine = textLine;
	}

	/**
	 * @return Ubicación de la línea de código
	 */
	public int getTextLineNumber() {
		return textLineNumber;
	}

	/**
	 * @param textLineNumber
	 *            Ubicación de la línea de código
	 */
	public void setTextLineNumber(int textLineNumber) {
		this.textLineNumber = textLineNumber;
	}

}
