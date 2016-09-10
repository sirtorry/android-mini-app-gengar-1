package com.example.patricktorry.gengarandroidapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
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
            Toast toast = Toast.makeText(context, "What MBTI Type are You?", duration);
            toast.show();
        }

        if(value == 2) {
            Toast toast = Toast.makeText(context, "What Is Your Spirit Pokemon?", duration);
            toast.show();
        }

        if(value == 3) {
            Toast toast = Toast.makeText(context, "Will You Give Patrick and Torry $5?", duration);
            toast.show();
        }

       // ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);

    }
}
