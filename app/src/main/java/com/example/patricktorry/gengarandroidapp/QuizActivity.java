package com.example.patricktorry.gengarandroidapp;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button topButton;
    private Button bottomButton;
    private int progressStatus = 0;
    private TextView progressText;
    private TextView questionText;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressText = (TextView) findViewById(R.id.progressText);
        questionText = (TextView) findViewById(R.id.questionText);
        topButton = (Button) findViewById(R.id.topButton);
        bottomButton = (Button) findViewById(R.id.bottomButton);
        progressBar.setProgress(23);
        progressBar.setMax(69);
        progressText.setText(23+"/"+69);
        questionText.setText("how old is jesus");
        topButton.setText("2016");
        bottomButton.setText("how the fuck would i KNOW");



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
