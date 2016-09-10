package com.example.patricktorry.gengarandroidapp;

import java.util.ArrayList;

/**
 * Created by Torry on 10/09/2016.
 */

public class PokemonQuiz {
    private String name = "Pokemon Quiz";
    private String result = "unknown";
    private int totalQuestions = 10;
    private int curQuestion;
    private boolean finished = false;

    ArrayList<Question> questionList = new ArrayList<Question>();
    questionList.add(new Question("Are you passionate or detached?", "Passionate", "Detached", 1, 0));

    public PokemonQuiz(int curQuestion) {
        this.curQuestion = curQuestion;
    }

    public String getName() {
        return name;
    }

    public int getCurQuestion() {
        return curQuestion;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public String getResult() {
        return result;
    }

    public boolean isFinished() {
        return finished;
    }
}
