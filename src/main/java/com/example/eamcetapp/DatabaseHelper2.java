package com.example.eamcetapp;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.view.View;

import static java.lang.Integer.parseInt;

public class DatabaseHelper2  extends SQLiteOpenHelper
{

    public static final String DATABASE_NAME="placements.db";
    public static final String TABLE_NAME="Opening Closing Ranks";

    public static final String c1="COLLEGE_NAME";
    public static final String c2="OC";
    public static final String c3="BC";
    public static final String c4="ST";

    public DatabaseHelper2(Context context) {
        super(context,DATABASE_NAME,null,1);


    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"(COLLEGE_NAME TEXT,OC INTEGER,BC INTEGER,ST INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String  COLLEGE_NAME,Integer OC,Integer BC,Integer ST)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(c1,COLLEGE_NAME);
        contentValues.put(c2,OC);
        contentValues.put(c3,BC);
        contentValues.put(c4,ST);
        long result =db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }

    public  Cursor allData (String txt)
    {

        SQLiteDatabase db =this.getWritableDatabase();


        int rnk = parseInt(txt);
        Cursor cursor=db.rawQuery("select * from "+TABLE_NAME,null);
        return  cursor;
    }

}

