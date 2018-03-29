/**
 * This class is generated by jOOQ
 */
package org.jooq.generated.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.generated.information_schema.InformationSchema;
import org.jooq.generated.information_schema.tables.records.CollationsRecord;
import org.jooq.impl.TableImpl;


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
public class Collations extends TableImpl<CollationsRecord> {

	private static final long serialVersionUID = 673791306;

	/**
	 * The reference instance of <code>INFORMATION_SCHEMA.COLLATIONS</code>
	 */
	public static final Collations COLLATIONS = new Collations();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CollationsRecord> getRecordType() {
		return CollationsRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.COLLATIONS.NAME</code>.
	 */
	public final TableField<CollationsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLLATIONS.KEY</code>.
	 */
	public final TableField<CollationsRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.COLLATIONS</code> table reference
	 */
	public Collations() {
		this("COLLATIONS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.COLLATIONS</code> table reference
	 */
	public Collations(String alias) {
		this(alias, COLLATIONS);
	}

	private Collations(String alias, Table<CollationsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Collations(String alias, Table<CollationsRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collations as(String alias) {
		return new Collations(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Collations rename(String name) {
		return new Collations(name, null);
	}
}
