package com.example.eamcetapp;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Placements extends AppCompatActivity {
    Button r1,r2,r3;
    DatabaseHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placements);
        mydb = new DatabaseHelper(this);
        r1 = (Button) findViewById(R.id.r1);
        r2 = (Button) findViewById(R.id.r2);
        r3 = (Button) findViewById(R.id.r3);
        viewAll();
        viewAll2();
        viewAll3();
         Insert();

    }
    public void Insert() {
        boolean insert = mydb.insertData("CSE", 120);
        boolean insert1 = mydb.insertData("ECE", 100);
        boolean insert2 = mydb.insertData("IT",   60);
    }

    public void viewAll() {
        r1.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {
                                      Cursor res = mydb.allData();
                                      StringBuffer buffer = new StringBuffer();
                                      int i=0,count =0;
                                      count = res.getCount();
                                      String dept="DEPT NAME\t\t\tSTUDENTS PLACED\n";
                                      //Toast.makeText(MainActivity.this, count, Toast.LENGTH_SHORT).show();
                                      while (res.moveToNext()) {
                                          dept += res.getString(0)+"\t\t\t\t\t\t\t\t\t\t\t\t\t";
                                          dept += res.getString(1)+System.getProperty("line.separator");
                                      }

                                      showMessage("data",dept);
                                      dept = "";
                                      //  stud = "";


                                  }

                              }
        );
    }
    public void viewAll2() {
        r2.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {
                                      Cursor res = mydb.allData();
                                      StringBuffer buffer = new StringBuffer();
                                      int i=0,count =0;
                                      count = res.getCount();
                                      String dept="DEPT NAME\t\t\tSTUDENTS PLACED\n";
                                      //Toast.makeText(MainActivity.this, count, Toast.LENGTH_SHORT).show();
                                      while (res.moveToNext()) {
                                          dept += res.getString(0)+"\t\t\t\t\t\t\t\t\t\t\t\t\t";
                                          dept += res.getString(1)+System.getProperty("line.separator");
                                      }

                                      showMessage("data",dept);
                                      dept = "";
                                      //  stud = "";


                                  }

                              }
        );
    }
    public void viewAll3() {
        r3.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {
                                      Cursor res = mydb.allData();
                                      StringBuffer buffer = new StringBuffer();
                                      int i=0,count =0;
                                      count = res.getCount();
                                      String dept="DEPT NAME\t\t\tSTUDENTS PLACED\n";
                                      //Toast.makeText(MainActivity.this, count, Toast.LENGTH_SHORT).show();
                                      while (res.moveToNext()) {
                                          dept += res.getString(0)+"\t\t\t\t\t\t\t\t\t\t\t\t\t";
                                          dept += res.getString(1)+System.getProperty("line.separator");
                                      }

                                      showMessage("data",dept);
                                      dept = "";
                                      //  stud = "";


                                  }

                              }
        );
    }
    public void showMessage(String Title,String Message)
    {
        AlertDialog.Builder builder=new  AlertDialog.Builder (this);
        builder.setCancelable(true);
        builder.setMessage(Message);
        builder.show();
    }
}








