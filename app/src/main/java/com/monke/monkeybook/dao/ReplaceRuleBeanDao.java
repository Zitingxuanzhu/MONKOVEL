package com.monke.monkeybook.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.monke.monkeybook.bean.ReplaceRuleBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "REPLACE_RULE_BEAN".
*/
public class ReplaceRuleBeanDao extends AbstractDao<ReplaceRuleBean, String> {

    public static final String TABLENAME = "REPLACE_RULE_BEAN";

    /**
     * Properties of entity ReplaceRuleBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ReplaceSummary = new Property(0, String.class, "replaceSummary", false, "REPLACE_SUMMARY");
        public final static Property Regex = new Property(1, String.class, "regex", true, "REGEX");
        public final static Property Replacement = new Property(2, String.class, "replacement", false, "REPLACEMENT");
        public final static Property Enable = new Property(3, Boolean.class, "enable", false, "ENABLE");
    }


    public ReplaceRuleBeanDao(DaoConfig config) {
        super(config);
    }
    
    public ReplaceRuleBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"REPLACE_RULE_BEAN\" (" + //
                "\"REPLACE_SUMMARY\" TEXT," + // 0: replaceSummary
                "\"REGEX\" TEXT PRIMARY KEY NOT NULL ," + // 1: regex
                "\"REPLACEMENT\" TEXT," + // 2: replacement
                "\"ENABLE\" INTEGER);"); // 3: enable
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"REPLACE_RULE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ReplaceRuleBean entity) {
        stmt.clearBindings();
 
        String replaceSummary = entity.getReplaceSummary();
        if (replaceSummary != null) {
            stmt.bindString(1, replaceSummary);
        }
 
        String regex = entity.getRegex();
        if (regex != null) {
            stmt.bindString(2, regex);
        }
 
        String replacement = entity.getReplacement();
        if (replacement != null) {
            stmt.bindString(3, replacement);
        }
 
        Boolean enable = entity.getEnable();
        if (enable != null) {
            stmt.bindLong(4, enable ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ReplaceRuleBean entity) {
        stmt.clearBindings();
 
        String replaceSummary = entity.getReplaceSummary();
        if (replaceSummary != null) {
            stmt.bindString(1, replaceSummary);
        }
 
        String regex = entity.getRegex();
        if (regex != null) {
            stmt.bindString(2, regex);
        }
 
        String replacement = entity.getReplacement();
        if (replacement != null) {
            stmt.bindString(3, replacement);
        }
 
        Boolean enable = entity.getEnable();
        if (enable != null) {
            stmt.bindLong(4, enable ? 1L: 0L);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1);
    }    

    @Override
    public ReplaceRuleBean readEntity(Cursor cursor, int offset) {
        ReplaceRuleBean entity = new ReplaceRuleBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // replaceSummary
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // regex
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // replacement
            cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0 // enable
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ReplaceRuleBean entity, int offset) {
        entity.setReplaceSummary(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setRegex(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setReplacement(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEnable(cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0);
     }
    
    @Override
    protected final String updateKeyAfterInsert(ReplaceRuleBean entity, long rowId) {
        return entity.getRegex();
    }
    
    @Override
    public String getKey(ReplaceRuleBean entity) {
        if(entity != null) {
            return entity.getRegex();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ReplaceRuleBean entity) {
        return entity.getRegex() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
