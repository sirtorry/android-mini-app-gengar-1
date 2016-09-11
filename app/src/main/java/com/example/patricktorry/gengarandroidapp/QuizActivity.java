package com.example.patricktorry.gengarandroidapp;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
    private PokemonQuiz pokemonObject = new PokemonQuiz(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressText = (TextView) findViewById(R.id.progressText);
        questionText = (TextView) findViewById(R.id.questionText);
        topButton = (Button) findViewById(R.id.topButton);
        bottomButton = (Button) findViewById(R.id.bottomButton);

        Bundle b = getIntent().getExtras();
        int value = -1; // or other values
        if(b != null)
            value = b.getInt("key");

        if(value == 1) {
            setTitle(mbtiObject.getName());
        }

        if(value == 2) {
            setTitle(pokemonObject.getName());
            displayPokemonQuestion();
        }

        if(value == 3) {
            setTitle("5 Dolla?");
        }
       // ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
    }

    protected void displayPokemonQuestion() {
        progressBar.setProgress(pokemonObject.getCurQuestion());
        progressBar.setMax(pokemonObject.getTotalQuestions());
        progressText.setText(pokemonObject.getCurQuestion() + "/" + pokemonObject.getTotalQuestions());

        Question temp = pokemonObject.getQuestion();

        questionText.setText(temp.getQuestion());
        topButton.setText(temp.getAnswer1());
        bottomButton.setText(temp.getAnswer2());

        topButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pokemonObject.tally(pokemonObject.getQuestion().getRes1());
                pokemonObject.nextQuestion();
                if(pokemonObject.getCurQuestion() == pokemonObject.getTotalQuestions()) {
                    pokemonObject.findResult();
                    finish();
                }
                displayPokemonQuestion();
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pokemonObject.tally(pokemonObject.getQuestion().getRes2());
                pokemonObject.nextQuestion();
                if(pokemonObject.getCurQuestion() == pokemonObject.getTotalQuestions()) {
                    pokemonObject.findResult();
                    finish();
                }
                displayPokemonQuestion();
            }
        });
    }
}
