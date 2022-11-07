package de.unistuttgart.iste.sqa.pse.sheet03.presence;

import de.hamstersimulator.objectsfirst.datatypes.Size;
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

		logAndWriteTerritoryInformation(territory);


	}

	private void logAndWriteTerritoryInformation(Territory territory) {
		logAndWriteNumberOfGrains(territory);
		logAndWriteNumberOfHamsters(territory);
		logAndWriteTerritorySize(territory);
	}

	private void logAndWriteNumberOfGrains(Territory territory) {
		paule.write("Number of grains on field: " + territory.getTotalGrainCount());
		output.append("Number of grains on field: ").append(String.valueOf(territory.getTotalGrainCount()))
				.println();
	}

	private void logAndWriteNumberOfHamsters(Territory territory) {
		paule.write("Number of hamsters on field: " + territory.getTotalHamsterCount());
		output.append("Number of hamsters on field: ").append(String.valueOf(territory.getTotalHamsterCount()))
				.println();
	}

	private void logAndWriteTerritorySize(Territory territory) {
		Size territorySize = territory.getTerritorySize();
		paule.write("Size of territory: "
				+ "Columns: " + territorySize.getColumnCount()
				+ " Rows: " + territorySize.getRowCount()
				+ " Size: " + territorySize.getRowCount() * territorySize.getColumnCount());
		output.append("Size of territory: ")
				.append("Columns: ").append(String.valueOf(territorySize.getColumnCount()))
				.append(" Rows: ").append(String.valueOf(territorySize.getRowCount()))
				.append(" Size: ").append(String.valueOf(territorySize.getRowCount() * territorySize.getColumnCount()))
				.println();
	}

	/**
	 * Put the code for challenge 3 here. It is run on the JavaFX thread.
	 * You may ignore this method if you do not want to work on challenge 3.
	 */
	void printWithJavaFX() {}
}
