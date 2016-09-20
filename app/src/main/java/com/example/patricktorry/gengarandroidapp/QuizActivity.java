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
    private MyersQuiz mbtiObject = new MyersQuiz(0);
    private PokemonQuiz pokemonObject = new PokemonQuiz(0);
    private MoneyQuiz moneyObject = new MoneyQuiz(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        if(savedInstanceState != null) {
            pokemonObject = (PokemonQuiz) savedInstanceState.getSerializable("pok");
            moneyObject = (MoneyQuiz) savedInstanceState.getSerializable("mon");
            mbtiObject = (MyersQuiz) savedInstanceState.getSerializable("mbt");
        }

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
            displayMyersQuestion();
//            findViewById(R.id.mbti).setVisibility(View.GONE);
//            findViewById(R.id.MBTITOAST).setVisibility(View.VISIBLE);
        }

        if(value == 2) {
            setTitle(pokemonObject.getName());
            displayPokemonQuestion();
        }

        if(value == 3) {
            setTitle("5 Dolla?");
            displayDollarQuestion();
        }
       // ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putSerializable("pok", pokemonObject);
        savedInstanceState.putSerializable("mon", moneyObject);
        savedInstanceState.putSerializable("mbt", mbtiObject);
        super.onSaveInstanceState(savedInstanceState);
    }
    //test
    protected void displayPokemonResult() {
        questionText.setText("You are " + pokemonObject.getResult());
        bottomButton.setText("Return to Quizzes");
        findViewById(R.id.topButton).setVisibility(View.GONE);
        bottomButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                Intent i = new Intent(this, MainActivity);
//                Bundle bundle = new Bundle();
//                bundle.putString("pok","You are " + pokemonObject.getResult());
//                i.putExtras(bundle);
//                startActivity(i);
                finish();
            }
        });
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
                if(pokemonObject.getCurQuestion() - 1 == pokemonObject.getTotalQuestions()) {
                    pokemonObject.findResult();
                    displayPokemonResult();
                }
                else {
                    displayPokemonQuestion();
                }
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pokemonObject.tally(pokemonObject.getQuestion().getRes2());
                pokemonObject.nextQuestion();
                if(pokemonObject.getCurQuestion() - 1 == pokemonObject.getTotalQuestions()) {
                    pokemonObject.findResult();
                    displayPokemonResult();
                }
                else {
                    displayPokemonQuestion();
                }
            }
        });
    }

    protected void displayMyersQuestion() {
        progressBar.setProgress(mbtiObject.getCurQuestion());
        progressBar.setMax(mbtiObject.getTotalQuestions());
        progressText.setText(mbtiObject.getCurQuestion() + "/" + mbtiObject.getTotalQuestions());

        Question temp = mbtiObject.getQuestion();

        questionText.setText(temp.getQuestion());
        topButton.setText(temp.getAnswer1());
        bottomButton.setText(temp.getAnswer2());

        topButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mbtiObject.tally(mbtiObject.getQuestion().getRes1());
                mbtiObject.nextQuestion();
                if(mbtiObject.getCurQuestion() - 1 == mbtiObject.getTotalQuestions()) {
                    mbtiObject.findResult();
                    displayMbtiResult();
                } else {
                    displayMyersQuestion();
                }
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mbtiObject.tally(mbtiObject.getQuestion().getRes2());
                mbtiObject.nextQuestion();
                if(mbtiObject.getCurQuestion() - 1 == mbtiObject.getTotalQuestions()) {
                    mbtiObject.findResult();
                    displayMbtiResult();
                }
                else {
                    displayMyersQuestion();
                }
            }
        });
    }

    protected void displayMbtiResult() {
        questionText.setText(mbtiObject.getResult());
        bottomButton.setText("Return to Quizzes");
        findViewById(R.id.topButton).setVisibility(View.GONE);
        bottomButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

    protected void displayDollarQuestion() {
        progressBar.setProgress(moneyObject.getCurQuestion());
        progressBar.setMax(moneyObject.getTotalQuestions());
        progressText.setText(moneyObject.getCurQuestion() + "/" + moneyObject.getTotalQuestions());

        Question temp = moneyObject.getQuestion();

        questionText.setText(temp.getQuestion());
        topButton.setText(temp.getAnswer1());
        bottomButton.setText(temp.getAnswer2());

        topButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moneyObject.tally(moneyObject.getQuestion().getRes1());
                moneyObject.nextQuestion();
                if(moneyObject.getCurQuestion() - 1 == moneyObject.getTotalQuestions()) {
                    moneyObject.findResult();
                    displayMoneyResult();
                }
                else {
                    displayDollarQuestion();
                }
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moneyObject.tally(moneyObject.getQuestion().getRes2());
                moneyObject.nextQuestion();
                if(moneyObject.getCurQuestion() - 1 == moneyObject.getTotalQuestions()) {
                    moneyObject.findResult();
                    displayMoneyResult();
                }
                else {
                    displayDollarQuestion();
                }
            }
        });
    }

    protected void displayMoneyResult() {
        questionText.setText(moneyObject.getResult());
        bottomButton.setText("Return to Quizzes");
        findViewById(R.id.topButton).setVisibility(View.GONE);
        bottomButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}
