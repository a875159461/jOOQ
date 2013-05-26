/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "V_BOOK")
public class V_BOOK_POJO extends java.lang.Object implements java.io.Serializable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_BOOK_INTERFACE {

	private static final long serialVersionUID = -1270623297;

	private java.lang.Integer ID;
	private java.lang.Integer AUTHOR_ID;
	private java.lang.Integer CO_AUTHOR_ID;
	private java.lang.Integer DETAILS_ID;
	private java.lang.String  TITLE;
	private java.lang.Integer PUBLISHED_IN;
	private java.lang.Integer LANGUAGE_ID;
	private java.lang.String  CONTENT_TEXT;
	private byte[]            CONTENT_PDF;

	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getAUTHOR_ID() {
		return this.AUTHOR_ID;
	}

	@Override
	public void setAUTHOR_ID(java.lang.Integer AUTHOR_ID) {
		this.AUTHOR_ID = AUTHOR_ID;
	}

	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	@Override
	public java.lang.Integer getCO_AUTHOR_ID() {
		return this.CO_AUTHOR_ID;
	}

	@Override
	public void setCO_AUTHOR_ID(java.lang.Integer CO_AUTHOR_ID) {
		this.CO_AUTHOR_ID = CO_AUTHOR_ID;
	}

	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	@Override
	public java.lang.Integer getDETAILS_ID() {
		return this.DETAILS_ID;
	}

	@Override
	public void setDETAILS_ID(java.lang.Integer DETAILS_ID) {
		this.DETAILS_ID = DETAILS_ID;
	}

	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	@Override
	public java.lang.String getTITLE() {
		return this.TITLE;
	}

	@Override
	public void setTITLE(java.lang.String TITLE) {
		this.TITLE = TITLE;
	}

	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getPUBLISHED_IN() {
		return this.PUBLISHED_IN;
	}

	@Override
	public void setPUBLISHED_IN(java.lang.Integer PUBLISHED_IN) {
		this.PUBLISHED_IN = PUBLISHED_IN;
	}

	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getLANGUAGE_ID() {
		return this.LANGUAGE_ID;
	}

	@Override
	public void setLANGUAGE_ID(java.lang.Integer LANGUAGE_ID) {
		this.LANGUAGE_ID = LANGUAGE_ID;
	}

	@javax.persistence.Column(name = "CONTENT_TEXT")
	@Override
	public java.lang.String getCONTENT_TEXT() {
		return this.CONTENT_TEXT;
	}

	@Override
	public void setCONTENT_TEXT(java.lang.String CONTENT_TEXT) {
		this.CONTENT_TEXT = CONTENT_TEXT;
	}

	@javax.persistence.Column(name = "CONTENT_PDF")
	@Override
	public byte[] getCONTENT_PDF() {
		return this.CONTENT_PDF;
	}

	@Override
	public void setCONTENT_PDF(byte[] CONTENT_PDF) {
		this.CONTENT_PDF = CONTENT_PDF;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_BOOK_INTERFACE from) {
		setID(from.getID());
		setAUTHOR_ID(from.getAUTHOR_ID());
		setCO_AUTHOR_ID(from.getCO_AUTHOR_ID());
		setDETAILS_ID(from.getDETAILS_ID());
		setTITLE(from.getTITLE());
		setPUBLISHED_IN(from.getPUBLISHED_IN());
		setLANGUAGE_ID(from.getLANGUAGE_ID());
		setCONTENT_TEXT(from.getCONTENT_TEXT());
		setCONTENT_PDF(from.getCONTENT_PDF());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_BOOK_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
