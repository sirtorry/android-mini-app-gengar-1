package com.example.patricktorry.gengarandroidapp;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button topButton;
    private Button bottomButton;
    private int progressStatus = 0;
    private TextView progressText;
    private TextView questionText;
    private Handler handler = new Handler();
    private MyersBriggsQuiz mbtiObject = new MyersBriggsQuiz();

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

        if(value == 1) {
            setTitle(mbtiObject.getName());
            mbtiObject.getQuestions();
        }

        if(value == 2) {
            setTitle("Spirit Quiz");
        }

        if(value == 3) {
            setTitle("5 Dolla?");
        }

       // ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);

    }
}
