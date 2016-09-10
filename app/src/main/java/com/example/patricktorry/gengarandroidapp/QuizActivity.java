package com.example.patricktorry.gengarandroidapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Bundle b = getIntent().getExtras();
        int value = -1; // or other values
        if(b != null)
            value = b.getInt("key");

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        if(value == 1) {
            setTitle("MBTI Quiz");
            Toast toast = Toast.makeText(context, "What MBTI Type are You?", duration);
            toast.show();
        }

        if(value == 2) {
            setTitle("Spirit Quiz");
            Toast toast = Toast.makeText(context, "What Is Your Spirit Pokemon?", duration);
            toast.show();
        }

        if(value == 3) {
            setTitle("5 Dolla?");
            Toast toast = Toast.makeText(context, "Will You Give Patrick and Torry $5?", duration);
            toast.show();
        }

       // ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);

    }
}
