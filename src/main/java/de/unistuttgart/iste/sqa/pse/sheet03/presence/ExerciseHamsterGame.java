package de.unistuttgart.iste.sqa.pse.sheet03.presence;

import de.hamstersimulator.objectsfirst.external.model.Territory;
import java.io.PrintStream;

/**
 * Please describe this class here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class ExerciseHamsterGame extends InternalExerciseHamsterGame {
	/**
	 * This {@link PrintStream} object is to be used for exercise 2b).
	 */
	protected final PrintStream output = System.out;

	@Override
	protected void hamsterRun() {
		final Territory territory = game.getTerritory();
		paule.write("Number of grains on field: " + territory.getTotalGrainCount());
		paule.write("Number of hamsters on field: " + territory.getTotalHamsterCount());
		paule.write("Size of territory: "
				+ "Columns:" + territory.getTerritorySize().getColumnCount()
				+ "Rows:" + territory.getTerritorySize().getRowCount());

	}

	/**
	 * Put the code for challenge 3 here. It is run on the JavaFX thread.
	 * You may ignore this method if you do not want to work on challenge 3.
	 */
	void printWithJavaFX() {}
}
