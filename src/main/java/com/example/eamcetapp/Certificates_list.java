package com.example.eamcetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Certificates_list extends AppCompatActivity {
    TextView textViewh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificates_list);
        textViewh=(TextView)findViewById(R.id.tvh);
        textViewh.setMovementMethod(new ScrollingMovementMethod());
        textViewh.setText(R.string.checklist_h);
    }
}
