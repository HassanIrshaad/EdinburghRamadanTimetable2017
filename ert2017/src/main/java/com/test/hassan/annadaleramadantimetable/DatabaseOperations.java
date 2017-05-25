package com.test.hassan.annadaleramadantimetable;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Hassan on 21-May-17.
 */

public class DatabaseOperations extends SQLiteOpenHelper {

    Calendar now = Calendar.getInstance();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    String nowDate = formatter.format(now.getTime());
    String[] separateCurrentDate = nowDate.split("-");
    String year = separateCurrentDate[0];
    String month = separateCurrentDate[1];
    String day = separateCurrentDate[2];
    int currentYear = Integer.parseInt(year);
    int currentMonth = Integer.parseInt(month);
    int currentDay = Integer.parseInt(day);

    SimpleDateFormat month_date = new SimpleDateFormat("MMMM");
    String month_name = month_date.format(now.getTime());

    String date = currentDay + " " + month_name;

    int test = 1;



    //Database name
    private static final String DATABASE_NAME = "ramadan_timetable.db";

    private static final String DB_PATH = "data/data/com.test.hassan.annadaleramadantimetable/databases/ramadan_timetable.db";

    //Table name
    private static final String TABLE_NAME = "timetable";

    //Table columns
    private static final String KEY_ID = "ID";
    private static final String KEY_DAY = "DAY";
    private static final String KEY_DATE = "DATE";
    private static final String KEY_SEHRI = "SEHRI";
    private static final String KEY_SUNRISE = "SUNRISE";
    private static final String KEY_ZUHR = "ZUHR";
    private static final String KEY_ASR = "ASR";
    private static final String KEY_IFTAR = "IFTAR";
    private static final String KEY_ISHA = "ISHA";

    //Database version
    private static final int database_version = 1;

    public DatabaseOperations(Context context) {
        super(context, DATABASE_NAME, null,  database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            String CREATE_RAMADAN_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                    + KEY_ID + " INTEGER PRIMARY KEY," +
                    KEY_DAY + " TEXT,"
                    + KEY_DATE + " TEXT,"
                    + KEY_SEHRI + " TEXT,"
                    + KEY_SUNRISE + " TEXT,"
                    + KEY_ZUHR + " TEXT,"
                    + KEY_ASR + " TEXT,"
                    + KEY_IFTAR + " TEXT,"
                    + KEY_ISHA + " TEXT" + ")";
            db.execSQL(CREATE_RAMADAN_TABLE);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    /*
    ALL CRUD OPERATIONS (CREATE, READ, UPDATE, DELETE)
     */

    //Adding a new ramadan day
    public void addRoza(Ramadan ramadan){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_DAY, ramadan.get_day());
        values.put(KEY_DATE, ramadan.get_date());
        values.put(KEY_SEHRI, ramadan.get_sehri());
        values.put(KEY_SUNRISE, ramadan.get_sunrise());
        values.put(KEY_ZUHR, ramadan.get_zuhr());
        values.put(KEY_ASR, ramadan.get_asr());
        values.put(KEY_IFTAR, ramadan.get_iftar());
        values.put(KEY_ISHA, ramadan.get_isha());

        //Insert rows
        db.insert(TABLE_NAME, null, values);
        db.close(); //Close db connection
    }

    //Getting single roza
    public Ramadan getRamadan(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, new String[] { KEY_ID,
        KEY_DAY, KEY_DATE, KEY_SEHRI, KEY_SUNRISE, KEY_ZUHR, KEY_ASR, KEY_IFTAR, KEY_ISHA}, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Ramadan ramadan = new Ramadan(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5),
                cursor.getString(6), cursor.getString(7), cursor.getString(8));
        //return
        return ramadan;
    }

    //Getting all rozay
    public List<Ramadan> getAllRozay() {
        List<Ramadan> ramadanList = new ArrayList<Ramadan>();
        //Select ALL query
        String selectQuery = "SELECT * FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        //loop through all rows and add to the list
        if(cursor.moveToFirst()){
            do {
                Ramadan ramadan = new Ramadan();
                ramadan.set_id(Integer.parseInt(cursor.getString(0)));
                ramadan.set_day(cursor.getString(1));
                ramadan.set_date(cursor.getString(2));
                ramadan.set_sehri(cursor.getString(3));
                ramadan.set_sunrise(cursor.getString(4));
                ramadan.set_zuhr(cursor.getString(5));
                ramadan.set_asr(cursor.getString(6));
                ramadan.set_iftar(cursor.getString(7));
                ramadan.set_isha(cursor.getString(8));
                ramadanList.add(ramadan);
            }while(cursor.moveToNext());
        }

        //return
        return ramadanList;
    }

    //Getting rozay count
    public int getRozayCount() {
        String countQuery = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        //return count
        return cursor.getCount();
    }

    //Updating single contact
    public int updateRozah(Ramadan ramadan) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_DAY, ramadan.get_day());
        values.put(KEY_DATE, ramadan.get_date());
        values.put(KEY_SEHRI, ramadan.get_sehri());
        values.put(KEY_SUNRISE, ramadan.get_sunrise());
        values.put(KEY_ZUHR, ramadan.get_zuhr());
        values.put(KEY_ASR, ramadan.get_asr());
        values.put(KEY_IFTAR, ramadan.get_iftar());
        values.put(KEY_ISHA, ramadan.get_isha());

        //updating row
        return db.update(TABLE_NAME, values, KEY_ID + "=?",
                new String[] { String.valueOf(ramadan.get_id()) });
    }

    //Deleting single rozah
    public void deleteRozah(Ramadan ramadan) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, KEY_ID + "=?",
                new String[] { String.valueOf(ramadan.get_id()) });
        db.close();
    }

    public Cursor getData(){
        SQLiteDatabase db = this.getWritableDatabase();
        String selectQuery = "SELECT * FROM " + TABLE_NAME + " WHERE "+KEY_DATE+" = '"+date.toUpperCase()+"'";
        Cursor res = db.rawQuery(selectQuery, null);
        //res.close();
        return res;
    }

    public Cursor getDay(String d){
        SQLiteDatabase db = this.getWritableDatabase();
        String selectQuery = "SELECT * FROM " + TABLE_NAME + " WHERE "+KEY_DATE+" = '"+d.toUpperCase()+"'";
        Cursor res = db.rawQuery(selectQuery, null);
        //res.close();
        return res;
        //String selectQuery = "SELECT * FROM " + TABLE_NAME + " WHERE "+KEY_ID + "="+id;
       // Cursor res = db.rawQuery(selectQuery, null);
        //res.close();
    }

    public void clearDatabase(String TABLE_NAME) {
        SQLiteDatabase db = this.getWritableDatabase();
        String clearDBQuery = "DELETE FROM "+TABLE_NAME;
        db.execSQL(clearDBQuery);
    }

//    //print database as string
//    public String databaseToString(){
//        String dbString = "";
//        SQLiteDatabase db = getWritableDatabase();
//        String query = "SELECT * FROM " + TABLE_NAME + " WHERE 1";
//
//        //cursor point to a location in your results
//        Cursor c = db.rawQuery(query, null);
//        c.moveToFirst();
//
//        while(!c.isAfterLast()){
//            if(c.getString(c.getColumnIndex("day")) != null){
//                dbString += c.getString(c.getColumnIndex("day"));
//                dbString += "\n";
//            }
//        }
//        db.close();
//        return dbString;
//    }

}
