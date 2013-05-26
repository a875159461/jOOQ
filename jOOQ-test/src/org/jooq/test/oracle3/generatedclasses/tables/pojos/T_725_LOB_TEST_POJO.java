/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_725_LOB_TEST")
public class T_725_LOB_TEST_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_725_LOB_TEST_INTERFACE {

	private static final long serialVersionUID = -942481424;

	private java.lang.Integer ID;
	private byte[]            LOB;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "LOB")
	@Override
	public byte[] getLOB() {
		return this.LOB;
	}

	@Override
	public void setLOB(byte[] LOB) {
		this.LOB = LOB;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_725_LOB_TEST_INTERFACE from) {
		setID(from.getID());
		setLOB(from.getLOB());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_725_LOB_TEST_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
