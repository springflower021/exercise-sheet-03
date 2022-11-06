package de.unistuttgart.iste.sqa.pse.sheet03.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 * This class implements the mysterious hamster from exercise 1.
 * Notice that something is horribly wrong with the name of this class...
 * You do not need to alter anything in this class. Well, perhaps except for its name...
 */
public final class mysterioushamster {
	private Integer stepCounter = 0;
	private Hamster hamster;

	/**
	 * This constructor allows to access methods of a mysterous hamster on a specified hamster.
	 * @param hamster A mysterioshamster-object will be created from this hamster.
	 */
	public mysterioushamster(final Hamster hamster) {
		this.hamster = hamster;
	}

	/**
	 * This method is used to let the mysterious hamster turn 90° left.
	 */
	void doSomething1() {
		hamster.turnLeft();
	}

	/**
	 * This method is used to let the mysterious hamster move one step forward
	 * and let it name the number of steps it has taken.
	 */
	void doSomething2() {
		hamster.move();
		stepCounter++;
		hamster.write("I have already walked " + stepCounter + " steps.");
	}

	/**
	 * This method is used to let the mysterious hamster turns 180° left.
	 * Therefore, the mysterious hamster turns two times left with an angle of 90°.
	 */
	void doSomething3() {
		hamster.turnLeft();
		hamster.turnLeft();
	}

	/**
	 * This method is used to let the mysterious hamster turn right.
	 * For this purpose the mysterious hamster turns 3 times for 90° left.
	 */
	void doSomething4() {
		hamster.turnLeft();
		hamster.turnLeft();
		hamster.turnLeft();
	}

	/**
	 * This method returns how man steps the mysterious hamster has taken.
	 * @return stepCounter
	 */
	int doSomething5() {
		return stepCounter;
	}

	/**
	 *This method is used to let the mysterious hamster announce how many steps it has taken.
	 */
	void doSomething6() {
		hamster.write(stepCounter.toString());
	}

	/**
	 * This method is used to let the mysterious hamster pick a grain from the field it is standing on.
	 */
	void doSomething7() {
		hamster.pickGrain();
	}

	/**
	 * This method is used to let the mysterious hamster announce when he finished his exercise.
	 */
	void doSomething8() {
		hamster.write("I'm done! :)");
	}

	/**
	 * This method is used to let the mysterious hamster loose grains while it moves 2 field forward.
	 * Therefore, the mysterious hamster moves on field. Puts all the grains in his mouth on to the field
	 * and moves another step forward. Then the mysterious hamster will announce that it was too fast.
	 */
	void doSomething9() {
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
