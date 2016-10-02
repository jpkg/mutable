package jpkg.mutable;

import java.io.Serializable;

public class MutableLong extends Number implements Serializable, Comparable<MutableLong>, MutablePrimitive {
	
	private static final long serialVersionUID = 361520893000778060L;
	
	/**
	 * The value of this MutableLong
	 */
	private long val;

	/**
	 * Make a new MutableLong with an initial value
	 * @param val initial value
	 */
	public MutableLong(long val) {
		this.val = val;
	}

	/**
	 * Get the value of this MutableLong
	 * @return
	 */
	public long get() {
		return val;
	}

	/**
	 * Set the value of this MutableLong
	 * @param val new value
	 */
	public void set(long val) {
		this.val = val;
	}
	
	/**
	 * Does what it says on the tin. Increments value of this MutableLong.
	 */
	public void increment() {
		val++;
	}
	
	/**
	 * Does what it says on the tin. Decrements value of this MutableLong.
	 */
	public void decrement() {
		val--;
	}
	
	/**
	 * Change the value by amount
	 * @param delta
	 * @return the value, for reference
	 */
	public long changeBy(long delta) {
		val += delta;
		return val;
	}
	
	@Override
	public String toString() {
		return Long.toString(val);
	}
	
	@Override
	public int hashCode() {
		return Long.hashCode(val);
	}
	
	@Override
	public boolean equals(Object another) {
		if(another instanceof MutableLong) {
			return ((MutableLong) another).val == this.val;
		} else return false;
	}

	@Override
	public int compareTo(MutableLong arg0) {
		return Long.compare(this.val, arg0.val);
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
		return (int) val;
	}

	@Override
	public long longValue() {
		return val;
	}
}