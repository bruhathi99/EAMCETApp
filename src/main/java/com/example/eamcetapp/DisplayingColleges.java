package com.example.eamcetapp;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DisplayingColleges  extends AppCompatActivity {
    Button b1;
    DatabaseHelper2 mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placements);
        mydb = new DatabaseHelper2(this);
        b1 = (Button) findViewById(R.id.b1);

        viewAll();

        //Insert();

    }
    public void Insert() {
        boolean insert = mydb.insertData("JNTU",489,1674,4297);
        boolean insert1 = mydb.insertData("CBIT", 1070,3655,11859);
        boolean insert2 = mydb.insertData("GNITS",   3063,16224,31602);
    }

    public void viewAll() {
        b1.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {
                                      EditText e = (EditText)findViewById(R.id.et_rank);
                                      String txt = e.getText().toString();
                                      Cursor res = mydb.allData(txt);
                                      StringBuffer buffer = new StringBuffer();
                                      int i=0,count =0;
                                      count = res.getCount();
                                      String clg="COLLEGE NAME\n";
                                      //Toast.makeText(MainActivity.this, count, Toast.LENGTH_SHORT).show();
                                      while (res.moveToNext()) {
                                           clg+= res.getString(0)+"\t\t\t\t\t\t\t\t\t\t\t\t\t";
                                          clg+= res.getString(1)+System.getProperty("line.separator");
                                      }

                                      showMessage("Colleges",clg);
                                      clg = "";
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










