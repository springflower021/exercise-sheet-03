package de.unistuttgart.iste.sqa.pse.sheet03.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 * This class implements the mysterious hamster from exercise 1.
 * Notice that something is horribly wrong with the name of this class...
 * You do not need to alter anything in this class. Well, perhaps except for its name...
 */
public final class MysteriousHamster {
	private Integer stepCounter = 0;
	private Hamster hamster;

	/**
	 * This constructor allows to access methods of a mysterous hamster on a specified hamster.
	 * @param hamster A mysterioshamster-object will be created from this hamster.
	 */
	public MysteriousHamster(final Hamster hamster) {
		this.hamster = hamster;
	}

	/**
	 * This method is used to let the mysterious hamster turn 90° left.
	 */
	void turnLeft() {
		hamster.turnLeft();
	}

	/**
	 * Move the mysterious hamster one step forward and let mysterious hamster write the total number of steps
	 * it has taken since the last reset of the step counter, which should happen only at the beginning of the program.
	 */
	void moveAndCountStep() {
		hamster.move();
		stepCounter++;
		hamster.write("I have already walked " + stepCounter + " steps.");
	}

	/**
	 * Turn around mysterious hamster to face the opposite direction.
	 */
	void turnAround() {
		hamster.turnLeft();
		hamster.turnLeft();
	}

	/**
	 * Turn mysterious hamster to the right.
	 */
	void turnRight() {
		hamster.turnLeft();
		hamster.turnLeft();
		hamster.turnLeft();
	}

	/**
	 * Return how man steps the mysterious hamster has taken.
	 * @return stepCounter
	 */
	int getStepCounter() {
		return stepCounter;
	}

	/**
	 * Let the mysterious hamster write how many steps it has taken.
	 */
	void writeNumberOfTakenSteps() {
		hamster.write(stepCounter.toString());
	}

	/**
	 * Let the mysterious hamster pick up a grain from the field it is standing on.
	 */
	void pickGrain() {
		hamster.pickGrain();
	}

	/**
	 * Let the mysterious hamster write that it is done.
	 */
	void writeFinishMessage() {
		hamster.write("I'm done! :)");
	}

	/**
	 * This method is used to let the mysterious hamster loose grains while it moves 2 field forward.
	 * Therefore, the mysterious hamster moves on field. Puts all the grains in his mouth on to the field
	 * and moves another step forward. Then the mysterious hamster will announce that it was too fast.
	 */
	void moveFastAndLooseGrains() {
		hamster.move();
		stepCounter++;
		boolean hadGrain = !hamster.mouthEmpty();
		while (!hamster.mouthEmpty()) {
			hamster.putGrain();
		}
		hamster.move();
		stepCounter++;
		if (hadGrain) {
			hamster.write("Oops! I guess I was too fast there!");
		}
	}

	/**
	 * This method is used to grant mysterioushamster-objects access the {@link Hamster#write(String)} method.
	 * @param text This text will be printed out in the game log.
	 */
	void write(final String text) {
		hamster.write(text);
	}
}
