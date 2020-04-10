package com.example.eamcetapp;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME="placements.db";
    public static final String TABLE_NAME="JNTUH";
    public static final String TABLE_NAME2="CBIT";
    public static final String TABLE_NAME3="GNITS";
    public static final String c1="DEPT_NAME";
    public static final String c2="NO_OF_STUDENTS_PLACED";
    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"(DEPT_NAME TEXT,NO_OF_STUDENTS_PLACED INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String DEPT_NAME,Integer NO_OF_STUDENTS_PLACED)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(c1,DEPT_NAME);
        contentValues.put(c2,NO_OF_STUDENTS_PLACED);
        long result =db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }

    public  Cursor allData ()
    {
        SQLiteDatabase db =this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from "+TABLE_NAME,null);
        return  cursor;
    }

 }