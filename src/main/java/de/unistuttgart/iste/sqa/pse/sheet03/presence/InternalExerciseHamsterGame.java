package de.unistuttgart.iste.sqa.pse.sheet03.presence;

import de.hamstersimulator.objectsfirst.inspector.InspectableSimpleHamsterGame;
import javafx.application.Platform;

/**
 * This class is used to prepare and run a game.
 * You do not need to alter anything in this class.
 */
public abstract class InternalExerciseHamsterGame extends InspectableSimpleHamsterGame {

	/**
	 * This constructor is used for loading a territory for the game and for displaying it.
	 */
	public InternalExerciseHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/territory.ter");
		this.displayInNewGameWindow();
	}

	@Override
	protected void run() {
		game.startGame();
		hamsterRun();
		challenge3();
		game.stopGame();
	}

	/**
	 * This method contains everything that the hamster is supposed to do.
	 */
	abstract void hamsterRun();

	/**
	 * This method runs {@link #printWithJavaFX()} on the JavaFX thread.
	 */
	public void challenge3() {
		Platform.runLater(() -> {
			printWithJavaFX();
		});
	}

	abstract void printWithJavaFX();
}
