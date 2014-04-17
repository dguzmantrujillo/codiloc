package net.tsc.codiloc.loccomparator.model;

import java.util.ArrayList;
import java.util.List;

import net.tsc.codiloc.loccomparator.exception.ComparatorException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComparatorFacadeTest {

	private static List<String> originalLines;

	private static List<String> modifiedLines;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		generateOriginalLines();
		generateModifiedLines();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		originalLines.clear();
		modifiedLines.clear();
		originalLines = null;
		modifiedLines = null;
	}

	@Test
	public final void testGetInstance() {
		// fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAddedLOC() throws ComparatorException {
		List<ComparedLine> comparedLines = ComparatorFacade.getInstance()
				.getAddedLOC(originalLines, modifiedLines);
		System.out.println(comparedLines);
		comparedLines = ComparatorFacade.getInstance().getDeletedLOC(
				originalLines, modifiedLines);
		System.out.println(comparedLines);
	}

	@Test
	public final void testGetDeletedLOC() {
		// fail("Not yet implemented"); // TODO
	}

	/**
	 * 
	 */
	private static void generateModifiedLines() {
		modifiedLines = new ArrayList<String>();
		modifiedLines.add("1");
		modifiedLines.add("3");
		modifiedLines.add("5");
		modifiedLines.add("20");
	}

	/**
	 * 
	 */
	private static void generateOriginalLines() {
		originalLines = new ArrayList<String>();
		originalLines.add("This is the original file");
		originalLines.add("1");
		originalLines.add("5");
		originalLines.add("10");
		originalLines.add("30");
	}
}
