package com.example.eamcetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.hsalf.smilerating.SmileRating;

public class Feedback extends AppCompatActivity {
    public void displayToast(View v)
    {
        Toast.makeText(Feedback.this,"Thanks for your feedback", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        SmileRating smileRating=(SmileRating)findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {


            @Override
            public void onSmileySelected(int smiley, boolean reselected) {
                switch (smiley) {
                    case SmileRating.BAD:
                        Toast.makeText(getApplicationContext(), "Bad", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.GOOD:
                        Toast.makeText(getApplicationContext(), "Good", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.GREAT:
                        Toast.makeText(getApplicationContext(), "Great", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.OKAY:
                        Toast.makeText(getApplicationContext(), "Okay", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.TERRIBLE:
                        Toast.makeText(getApplicationContext(), "Terrible", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}