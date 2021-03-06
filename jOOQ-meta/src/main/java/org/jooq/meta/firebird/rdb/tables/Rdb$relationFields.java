/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.firebird.rdb.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;
import org.jooq.meta.firebird.rdb.DefaultSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rdb$relationFields extends TableImpl<Record> {

    private static final long serialVersionUID = 72913382;

    /**
     * The reference instance of <code>RDB$RELATION_FIELDS</code>
     */
    public static final Rdb$relationFields RDB$RELATION_FIELDS = new Rdb$relationFields();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$FIELD_NAME</code>.
     */
    public final TableField<Record, String> RDB$FIELD_NAME = createField(DSL.name("RDB$FIELD_NAME"), org.jooq.impl.SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$RELATION_NAME</code>.
     */
    public final TableField<Record, String> RDB$RELATION_NAME = createField(DSL.name("RDB$RELATION_NAME"), org.jooq.impl.SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$FIELD_SOURCE</code>.
     */
    public final TableField<Record, String> RDB$FIELD_SOURCE = createField(DSL.name("RDB$FIELD_SOURCE"), org.jooq.impl.SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$QUERY_NAME</code>.
     */
    public final TableField<Record, String> RDB$QUERY_NAME = createField(DSL.name("RDB$QUERY_NAME"), org.jooq.impl.SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$BASE_FIELD</code>.
     */
    public final TableField<Record, String> RDB$BASE_FIELD = createField(DSL.name("RDB$BASE_FIELD"), org.jooq.impl.SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$EDIT_STRING</code>.
     */
    public final TableField<Record, String> RDB$EDIT_STRING = createField(DSL.name("RDB$EDIT_STRING"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$FIELD_POSITION</code>.
     */
    public final TableField<Record, Short> RDB$FIELD_POSITION = createField(DSL.name("RDB$FIELD_POSITION"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$QUERY_HEADER</code>.
     */
    public final TableField<Record, String> RDB$QUERY_HEADER = createField(DSL.name("RDB$QUERY_HEADER"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$UPDATE_FLAG</code>.
     */
    public final TableField<Record, Short> RDB$UPDATE_FLAG = createField(DSL.name("RDB$UPDATE_FLAG"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$FIELD_ID</code>.
     */
    public final TableField<Record, Short> RDB$FIELD_ID = createField(DSL.name("RDB$FIELD_ID"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$VIEW_CONTEXT</code>.
     */
    public final TableField<Record, Short> RDB$VIEW_CONTEXT = createField(DSL.name("RDB$VIEW_CONTEXT"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$DESCRIPTION</code>.
     */
    public final TableField<Record, String> RDB$DESCRIPTION = createField(DSL.name("RDB$DESCRIPTION"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$DEFAULT_VALUE</code>.
     */
    public final TableField<Record, byte[]> RDB$DEFAULT_VALUE = createField(DSL.name("RDB$DEFAULT_VALUE"), org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$SYSTEM_FLAG</code>.
     */
    public final TableField<Record, Short> RDB$SYSTEM_FLAG = createField(DSL.name("RDB$SYSTEM_FLAG"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$SECURITY_CLASS</code>.
     */
    public final TableField<Record, String> RDB$SECURITY_CLASS = createField(DSL.name("RDB$SECURITY_CLASS"), org.jooq.impl.SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$COMPLEX_NAME</code>.
     */
    public final TableField<Record, String> RDB$COMPLEX_NAME = createField(DSL.name("RDB$COMPLEX_NAME"), org.jooq.impl.SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$NULL_FLAG</code>.
     */
    public final TableField<Record, Short> RDB$NULL_FLAG = createField(DSL.name("RDB$NULL_FLAG"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$DEFAULT_SOURCE</code>.
     */
    public final TableField<Record, String> RDB$DEFAULT_SOURCE = createField(DSL.name("RDB$DEFAULT_SOURCE"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$COLLATION_ID</code>.
     */
    public final TableField<Record, Short> RDB$COLLATION_ID = createField(DSL.name("RDB$COLLATION_ID"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$GENERATOR_NAME</code>.
     */
    public final TableField<Record, String> RDB$GENERATOR_NAME = createField(DSL.name("RDB$GENERATOR_NAME"), org.jooq.impl.SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$RELATION_FIELDS.RDB$IDENTITY_TYPE</code>.
     */
    public final TableField<Record, Short> RDB$IDENTITY_TYPE = createField(DSL.name("RDB$IDENTITY_TYPE"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>RDB$RELATION_FIELDS</code> table reference
     */
    public Rdb$relationFields() {
        this(DSL.name("RDB$RELATION_FIELDS"), null);
    }

    /**
     * Create an aliased <code>RDB$RELATION_FIELDS</code> table reference
     */
    public Rdb$relationFields(String alias) {
        this(DSL.name(alias), RDB$RELATION_FIELDS);
    }

    /**
     * Create an aliased <code>RDB$RELATION_FIELDS</code> table reference
     */
    public Rdb$relationFields(Name alias) {
        this(alias, RDB$RELATION_FIELDS);
    }

    private Rdb$relationFields(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$relationFields(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(
              Internal.createUniqueKey(org.jooq.meta.firebird.rdb.tables.Rdb$relationFields.RDB$RELATION_FIELDS, "RDB$INDEX_15", org.jooq.meta.firebird.rdb.tables.Rdb$relationFields.RDB$RELATION_FIELDS.RDB$FIELD_NAME, org.jooq.meta.firebird.rdb.tables.Rdb$relationFields.RDB$RELATION_FIELDS.RDB$RELATION_NAME)
        );
    }

    @Override
    public Rdb$relationFields as(String alias) {
        return new Rdb$relationFields(DSL.name(alias), this);
    }

    @Override
    public Rdb$relationFields as(Name alias) {
        return new Rdb$relationFields(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$relationFields rename(String name) {
        return new Rdb$relationFields(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$relationFields rename(Name name) {
        return new Rdb$relationFields(name, null);
    }
}
