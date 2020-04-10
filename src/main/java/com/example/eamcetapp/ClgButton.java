package com.example.eamcetapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ClgButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clg_button);
    }

    public void btnjntu(View view) {
        startActivity(new Intent(getApplicationContext(),clg2.class));
    }

    public void btncbit(View view) {
        startActivity(new Intent(getApplicationContext(),clg3.class));
    }

    public void btngnit(View view) {
        startActivity(new Intent(getApplicationContext(),clg1.class));
    }
}
