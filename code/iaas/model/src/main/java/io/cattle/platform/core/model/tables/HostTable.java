/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HostTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.HostRecord> {

	private static final long serialVersionUID = -667086310;

	/**
	 * The singleton instance of <code>cattle.host</code>
	 */
	public static final io.cattle.platform.core.model.tables.HostTable HOST = new io.cattle.platform.core.model.tables.HostTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.HostRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.HostRecord.class;
	}

	/**
	 * The column <code>cattle.host.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.host.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.host.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.host.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.host.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.host.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.host.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.host.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.host.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.host.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.host.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.host.uri</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.String> URI = createField("uri", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.host.compute_free</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.Long> COMPUTE_FREE = createField("compute_free", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.host.compute_total</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.Long> COMPUTE_TOTAL = createField("compute_total", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.host.agent_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.Long> AGENT_ID = createField("agent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.host.zone_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.Long> ZONE_ID = createField("zone_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.host.physical_host_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.Long> PHYSICAL_HOST_ID = createField("physical_host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.host.is_public</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.Boolean> IS_PUBLIC = createField("is_public", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>cattle.host</code> table reference
	 */
	public HostTable() {
		this("host", null);
	}

	/**
	 * Create an aliased <code>cattle.host</code> table reference
	 */
	public HostTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.HostTable.HOST);
	}

	private HostTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.HostRecord> aliased) {
		this(alias, aliased, null);
	}

	private HostTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.HostRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.HostRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.HostRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_HOST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.HostRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.HostRecord>>asList(io.cattle.platform.core.model.Keys.KEY_HOST_PRIMARY, io.cattle.platform.core.model.Keys.KEY_HOST_IDX_HOST_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.HostRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.HostRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_HOST__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_HOST__AGENT_ID, io.cattle.platform.core.model.Keys.FK_HOST__ZONE_ID, io.cattle.platform.core.model.Keys.FK_HOST__PHYSICAL_HOST_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.HostTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.HostTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.HostTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.HostTable(name, null);
	}
}
