package com.example.eamcetapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void btnrank(View view) {
        startActivity(new Intent(getApplicationContext(),Cutoff.class));
    }

    public void btnClg(View view) {
        startActivity(new Intent(getApplicationContext(),ClgButton.class));
    }


    public void btnplacements(View view) {
        startActivity(new Intent(getApplicationContext(),Placements.class));
    }

    public void btncenters(View view) {
        startActivity(new Intent(getApplicationContext(),ReportingCenters.class));
    }

    public void btnchecklist(View view) {
        startActivity(new Intent(getApplicationContext(),Certificates_list.class));
    }

    public void btnfeedback(View view) {
        startActivity(new Intent(getApplicationContext(),Feedback.class));
    }


}
