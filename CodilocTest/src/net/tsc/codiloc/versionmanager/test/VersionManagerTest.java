package net.tsc.codiloc.versionmanager.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.tsc.codiloc.loccomparator.exception.ComparatorException;
import net.tsc.codiloc.loccomparator.model.ComparatorFacade;
import net.tsc.codiloc.loccomparator.model.ComparedLine;
import net.tsc.codiloc.versionmanager.exception.VersionManagerException;
import net.tsc.codiloc.versionmanager.model.VersionManagerFacade;

import org.junit.Test;

public class VersionManagerTest {
	
	private final File original = new File("C:\\Pruebas\\original\\ComparedLine.java");
	 
    private final File modified = new File("C:\\Pruebas\\modificado\\ComparedLine.java");
    
	@Test
	public void compareVersion() throws VersionManagerException {

		int addedLines = 0;
		int deletedLines = 0;
		int totalLines = 0;
		
		List<ComparedLine> addedLinesList = new ArrayList<>();
		List<ComparedLine> deletedLinesList = new ArrayList<>();

		VersionManagerFacade versionManager = VersionManagerFacade.getInstance();
		ComparatorFacade comparator = ComparatorFacade.getInstance();

		// ADICIONAR FILEMANAGER
		// Convertir archivos a listas de líneas
		List<String> originalLines = new ArrayList<>();
		List<String> modifiedLines = new ArrayList<>();

		try {
			addedLinesList = comparator.getAddedLOC(originalLines, modifiedLines);
			addedLinesList = comparator.getAddedLOC(originalLines, modifiedLines);
    		assertEquals("private String addLine;", addedLinesList.get(0).getTextLine());
    		assertEquals("private int addLineNumber;", addedLinesList.get(1).getTextLine());
    		
			deletedLinesList = comparator.getDeletedLOC(originalLines, modifiedLines);
			deletedLinesList = comparator.getDeletedLOC(originalLines, modifiedLines);
    		assertEquals("public void setTextLineNumber(int textLineNumber) {", deletedLinesList.get(0).getTextLine());
    		assertEquals("this.textLineNumber = textLineNumber;", deletedLinesList.get(1).getTextLine());
    		assertEquals("}", deletedLinesList.get(2).getTextLine());

			addedLines = versionManager.countComparedLOC(addedLinesList);
			assertEquals(2, addedLines);
			
			deletedLines = versionManager.countComparedLOC(deletedLinesList);
			assertEquals(3, deletedLines);
			
			totalLines = versionManager.countLOC("AQUI VA EL TEXTO DEL ARCHIVO MODIFICADO");
			assertEquals(15, totalLines); //LA LLAVE QUE CIERRA Y ESTÁ SOLA EN LA LÍNEA CUENTA????

		} catch (ComparatorException e) {
			e.printStackTrace();
		}

	}

}
