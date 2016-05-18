package com.example.janco.spidernest.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by janco on 18.05.2016.
 */
public class SpidersHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MY_SPIDERS.db";
    public static final String TABLE_NAME = "SPIDERS";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "GENUS";
    public static final String COL_3 = "SPECIES";



    public SpidersHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_String = "CREATE TABLE " + TABLE_NAME + "(" + COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT," + COL_2 + " TEXT," + COL_3 + " TEXT "+")";
        db.execSQL(SQL_String);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST" + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String name, String genus, String species) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, genus);
        contentValues.put(COL_3, species);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
}

