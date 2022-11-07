package de.unistuttgart.iste.sqa.pse.sheet03.homework;

/**
 * This class implements {@link InternalHomeworkHamsterGame#hamsterRun()} method that runs
 * the {@code doSomething} methods on a mysterious hamster.
 * You do not need to alter anything in this class.
 */
public final class HomeworkHamsterGame extends InternalHomeworkHamsterGame {

	@Override
	protected void hamsterRun() {
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: turnRight()");
		mysteriousPaule.turnRight();
		mysteriousPaule.write("Executing operation: moveFastAndLooseGrains()");
		mysteriousPaule.moveFastAndLooseGrains();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: turnLeft()");
		mysteriousPaule.turnLeft();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: turnLeft()");
		mysteriousPaule.turnLeft();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: turnRight()");
		mysteriousPaule.turnRight();
		mysteriousPaule.write("Executing operation: moveFastAndLooseGrains()");
		mysteriousPaule.moveFastAndLooseGrains();
		mysteriousPaule.write("Executing operation: turnLeft()");
		mysteriousPaule.turnLeft();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: turnTwoTimesLeft()");
		mysteriousPaule.turnTwoTimesLeft();
		mysteriousPaule.write("Executing operation: pickGrain()");
		mysteriousPaule.pickGrain();
		mysteriousPaule.write("Executing operation: writeNumberOfTakenSteps()");
		mysteriousPaule.writeNumberOfTakenSteps();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: turnRight()");
		mysteriousPaule.turnRight();
		mysteriousPaule.write("Executing operation: moveFastAndLooseGrains()");
		mysteriousPaule.moveFastAndLooseGrains();
		mysteriousPaule.write("Executing operation: turnTwoTimesLeft()");
		mysteriousPaule.turnTwoTimesLeft();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: pickGrain()");
		mysteriousPaule.pickGrain();
		mysteriousPaule.write("Executing operation: turnTwoTimesLeft()");
		mysteriousPaule.turnTwoTimesLeft();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: turnRight()");
		mysteriousPaule.turnRight();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: moveAndCountStep()");
		mysteriousPaule.moveAndCountStep();
		mysteriousPaule.write("Executing operation: writeFinishMessage()");
		mysteriousPaule.writeFinishMessage();
	}

	/**
	 * Returns the {@link MysteriousHamster} mysteriousPaule.
	 */
	MysteriousHamster getHamster() {
		return mysteriousPaule;
	}
}
