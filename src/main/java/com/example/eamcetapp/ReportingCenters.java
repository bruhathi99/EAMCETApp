package com.example.eamcetapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ReportingCenters extends AppCompatActivity {
        Button center1,center2,center3,center4,center5,center6,center7,center8,center9,center10,center11,center12,center13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporting_centers);

        center1= findViewById(R.id.center1);
        center2= findViewById(R.id.center2);
        center3= findViewById(R.id.center3);
        center4= findViewById(R.id.center4);
        center5= findViewById(R.id.center5);
        center6= findViewById(R.id.center6);
        center7= findViewById(R.id.center7);
        center8= findViewById(R.id.center8);
        center9= findViewById(R.id.center9);
        center10= findViewById(R.id.center10);
        center11= findViewById(R.id.center11);
        center12= findViewById(R.id.center12);
        center13= findViewById(R.id.center13);


    }

        public void maps1 (View view)
        {
            String data1 = center1.getText().toString();
            Uri uri = Uri.parse("geo:0,0?q=" + data1);
            Intent i = new Intent(Intent.ACTION_VIEW, uri);
            if (i.resolveActivity(getPackageManager()) != null)
                startActivity(i);
            else
                Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

        }
    public void maps2 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    }
    public void maps3 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    }
    public void maps4 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    }
    public void maps5 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    }
    public void maps6 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    }
    public void maps7 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    } public void maps8 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    } public void maps9 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    }
    public void maps10 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    }
    public void maps11 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    }
    public void maps12 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    }
    public void maps13 (View view)
    {
        String data1 = center1.getText().toString();
        Uri uri = Uri.parse("geo:0,0?q=" + data1);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);
        else
            Toast.makeText(this, "can't handle this type", Toast.LENGTH_SHORT).show();

    }

    }
