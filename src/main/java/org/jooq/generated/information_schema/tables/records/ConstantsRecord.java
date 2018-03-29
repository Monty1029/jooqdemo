/**
 * This class is generated by jOOQ
 */
package org.jooq.generated.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.generated.information_schema.tables.Constants;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConstantsRecord extends TableRecordImpl<ConstantsRecord> implements Record7<String, String, String, Integer, String, String, Integer> {

	private static final long serialVersionUID = -1139496286;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_CATALOG</code>.
	 */
	public void setConstantCatalog(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_CATALOG</code>.
	 */
	public String getConstantCatalog() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_SCHEMA</code>.
	 */
	public void setConstantSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_SCHEMA</code>.
	 */
	public String getConstantSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_NAME</code>.
	 */
	public void setConstantName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_NAME</code>.
	 */
	public String getConstantName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.DATA_TYPE</code>.
	 */
	public void setDataType(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.DATA_TYPE</code>.
	 */
	public Integer getDataType() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.REMARKS</code>.
	 */
	public void setRemarks(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.REMARKS</code>.
	 */
	public String getRemarks() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.SQL</code>.
	 */
	public void setSql(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.SQL</code>.
	 */
	public String getSql() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CONSTANTS.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<String, String, String, Integer, String, String, Integer> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<String, String, String, Integer, String, String, Integer> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Constants.CONSTANTS.CONSTANT_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Constants.CONSTANTS.CONSTANT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Constants.CONSTANTS.CONSTANT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Constants.CONSTANTS.DATA_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Constants.CONSTANTS.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Constants.CONSTANTS.SQL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return Constants.CONSTANTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getConstantCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getConstantSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getConstantName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getDataType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getRemarks();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getSql();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value1(String value) {
		setConstantCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value2(String value) {
		setConstantSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value3(String value) {
		setConstantName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value4(Integer value) {
		setDataType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value5(String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value6(String value) {
		setSql(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord value7(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConstantsRecord values(String value1, String value2, String value3, Integer value4, String value5, String value6, Integer value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ConstantsRecord
	 */
	public ConstantsRecord() {
		super(Constants.CONSTANTS);
	}

	/**
	 * Create a detached, initialised ConstantsRecord
	 */
	public ConstantsRecord(String constantCatalog, String constantSchema, String constantName, Integer dataType, String remarks, String sql, Integer id) {
		super(Constants.CONSTANTS);

		setValue(0, constantCatalog);
		setValue(1, constantSchema);
		setValue(2, constantName);
		setValue(3, dataType);
		setValue(4, remarks);
		setValue(5, sql);
		setValue(6, id);
	}
}