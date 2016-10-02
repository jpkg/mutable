package jpkg.mutable;

import java.io.Serializable;

public class MutableInteger extends Number implements Serializable, Comparable<MutableInteger>, MutablePrimitive {

	private static final long serialVersionUID = -2285917765136376454L;
	
	/**
	 * The value of this MutableInteger
	 */
	private int val;

	/**
	 * Make a new MutableInteger with an initial value
	 * @param val initial value
	 */
	public MutableInteger(int val) {
		this.val = val;
	}

	/**
	 * Get the value of this MutableInteger
	 * @return
	 */
	public int get() {
		return val;
	}

	/**
	 * Set the value of this MutableInteger
	 * @param val new value
	 */
	public void set(int val) {
		this.val = val;
	}
	
	/**
	 * Does what it says on the tin. Increments value of this MutableInteger.
	 */
	public void increment() {
		val++;
	}
	
	/**
	 * Does what it says on the tin. Decrements value of this MutableInteger.
	 */
	public void decrement() {
		val--;
	}
	
	/**
	 * Change the value by amount
	 * @param delta
	 * @return the value, for reference
	 */
	public int changeBy(int delta) {
		val += delta;
		return val;
	}
	
	@Override
	public String toString() {
		return Integer.toString(val);
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(val);
	}
	
	@Override
	public boolean equals(Object another) {
		if(another instanceof MutableInteger) {
			return ((MutableInteger) another).val == this.val;
		} else return false;
	}

	@Override
	public int compareTo(MutableInteger arg0) {
		return Integer.compare(this.val, arg0.val);
	}

	@Override
	public double doubleValue() {
		return (double) val;
	}

	@Override
	public float floatValue() {
		return (float) val;
	}

	@Override
	public int intValue() {
		return val;
	}

	@Override
	public long longValue() {
		return (long) val;
	}
}