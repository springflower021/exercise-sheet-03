package de.unistuttgart.iste.sqa.pse.sheet03.presence;

/**
 * Please describe this class here.
 */
final class LocationVector {

	private final int deltaRow;
	private final int deltaColumn;

	public LocationVector(final int deltaRow, final int deltaColumn) {
		super();
		this.deltaRow = deltaRow;
		this.deltaColumn = deltaColumn;
	}

	/**
	 * Please write your documentation here.
	 */
	public int getDeltaRow() {
		return deltaRow;
	}

	/**
	 * Please write your documentation here.
	 */
	public int getDeltaColumn() {
		return deltaColumn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deltaRow;
		result = prime * result + deltaColumn;
		return result;
	}

	@Override
	public boolean equals(final Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (getClass() != object.getClass()) {
			return false;
		}
		final LocationVector other = (LocationVector) object;
		if (deltaRow != other.deltaRow) {
			return false;
		}
		if (deltaColumn != other.deltaColumn) {
			return false;
		}
		return true;
	}
}
