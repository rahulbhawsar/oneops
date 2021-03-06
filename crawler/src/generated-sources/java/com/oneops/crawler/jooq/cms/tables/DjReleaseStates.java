/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.DjReleaseStatesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DjReleaseStates extends TableImpl<DjReleaseStatesRecord> {

    private static final long serialVersionUID = -575042339;

    /**
     * The reference instance of <code>kloopzcm.dj_release_states</code>
     */
    public static final DjReleaseStates DJ_RELEASE_STATES = new DjReleaseStates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DjReleaseStatesRecord> getRecordType() {
        return DjReleaseStatesRecord.class;
    }

    /**
     * The column <code>kloopzcm.dj_release_states.release_state_id</code>.
     */
    public final TableField<DjReleaseStatesRecord, Integer> RELEASE_STATE_ID = createField("release_state_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_release_states.state_name</code>.
     */
    public final TableField<DjReleaseStatesRecord, String> STATE_NAME = createField("state_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>kloopzcm.dj_release_states</code> table reference
     */
    public DjReleaseStates() {
        this(DSL.name("dj_release_states"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.dj_release_states</code> table reference
     */
    public DjReleaseStates(String alias) {
        this(DSL.name(alias), DJ_RELEASE_STATES);
    }

    /**
     * Create an aliased <code>kloopzcm.dj_release_states</code> table reference
     */
    public DjReleaseStates(Name alias) {
        this(alias, DJ_RELEASE_STATES);
    }

    private DjReleaseStates(Name alias, Table<DjReleaseStatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DjReleaseStates(Name alias, Table<DjReleaseStatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kloopzcm.KLOOPZCM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DJ_RELEASE_STATES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DjReleaseStatesRecord> getPrimaryKey() {
        return Keys.DJ_RELEASE_STATES_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DjReleaseStatesRecord>> getKeys() {
        return Arrays.<UniqueKey<DjReleaseStatesRecord>>asList(Keys.DJ_RELEASE_STATES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleaseStates as(String alias) {
        return new DjReleaseStates(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleaseStates as(Name alias) {
        return new DjReleaseStates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DjReleaseStates rename(String name) {
        return new DjReleaseStates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DjReleaseStates rename(Name name) {
        return new DjReleaseStates(name, null);
    }
}
