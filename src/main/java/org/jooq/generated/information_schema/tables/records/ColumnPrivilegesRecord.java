/**
 * This class is generated by jOOQ
 */
package org.jooq.generated.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.generated.information_schema.tables.ColumnPrivileges;
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
public class ColumnPrivilegesRecord extends TableRecordImpl<ColumnPrivilegesRecord> implements Record8<String, String, String, String, String, String, String, String> {

	private static final long serialVersionUID = 1126907829;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTOR</code>.
	 */
	public void setGrantor(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTOR</code>.
	 */
	public String getGrantor() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTEE</code>.
	 */
	public void setGrantee(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTEE</code>.
	 */
	public String getGrantee() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	public String getTableCatalog() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	public String getTableSchema() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_NAME</code>.
	 */
	public void setTableName(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_NAME</code>.
	 */
	public String getTableName() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.COLUMN_NAME</code>.
	 */
	public void setColumnName(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.COLUMN_NAME</code>.
	 */
	public String getColumnName() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	public void setPrivilegeType(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	public String getPrivilegeType() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	public void setIsGrantable(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	public String getIsGrantable() {
		return (String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, String, String, String, String, String, String, String> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return ColumnPrivileges.COLUMN_PRIVILEGES.GRANTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return ColumnPrivileges.COLUMN_PRIVILEGES.GRANTEE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ColumnPrivileges.COLUMN_PRIVILEGES.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ColumnPrivileges.COLUMN_PRIVILEGES.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ColumnPrivileges.COLUMN_PRIVILEGES.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return ColumnPrivileges.COLUMN_PRIVILEGES.COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return ColumnPrivileges.COLUMN_PRIVILEGES.PRIVILEGE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return ColumnPrivileges.COLUMN_PRIVILEGES.IS_GRANTABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getGrantor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getGrantee();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getPrivilegeType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getIsGrantable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value1(String value) {
		setGrantor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value2(String value) {
		setGrantee(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value3(String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value4(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value5(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value6(String value) {
		setColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value7(String value) {
		setPrivilegeType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord value8(String value) {
		setIsGrantable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ColumnPrivilegesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ColumnPrivilegesRecord
	 */
	public ColumnPrivilegesRecord() {
		super(ColumnPrivileges.COLUMN_PRIVILEGES);
	}

	/**
	 * Create a detached, initialised ColumnPrivilegesRecord
	 */
	public ColumnPrivilegesRecord(String grantor, String grantee, String tableCatalog, String tableSchema, String tableName, String columnName, String privilegeType, String isGrantable) {
		super(ColumnPrivileges.COLUMN_PRIVILEGES);

		setValue(0, grantor);
		setValue(1, grantee);
		setValue(2, tableCatalog);
		setValue(3, tableSchema);
		setValue(4, tableName);
		setValue(5, columnName);
		setValue(6, privilegeType);
		setValue(7, isGrantable);
	}
}
