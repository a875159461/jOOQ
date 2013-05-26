/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class P_AUTHOR_EXISTS extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = -792817515;

	/**
	 * The parameter <code>P_AUTHOR_EXISTS.AUTHOR_NAME</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>P_AUTHOR_EXISTS.RESULT</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RESULT = createParameter("RESULT", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public P_AUTHOR_EXISTS() {
		super("P_AUTHOR_EXISTS", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter IN value to the routine
	 */
	public void setAUTHOR_NAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.P_AUTHOR_EXISTS.AUTHOR_NAME, value);
	}

	/**
	 * Get the <code>RESULT</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getRESULT() {
		return getValue(RESULT);
	}
}
