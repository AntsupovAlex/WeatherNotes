package com.example.weathernotes;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "weather.db";
    private static final int SHEMA = 1;
    static final String TABLE = "weather_notes";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TEXT = "temperature";
    public static final String COLUMN_WEATHER = "weather";
    public static final String COLUMN_RAIN = "rain";
    public static final String COLUMN_WIND = "wind";
    public static final String COLUMN_DATE = "date";

    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME,null,SHEMA);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE weather (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"+ COLUMN_TEXT + " TEXT,"+ COLUMN_WEATHER + "TEXT,"
                + COLUMN_RAIN + "TEXT,"+ COLUMN_WIND + "TEXT,"+ COLUMN_DATE + "TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
    }
}
