package com.example.patricktorry.gengarandroidapp;

import java.util.ArrayList;

/**
 * Created by Torry on 10/09/2016.
 */

public class PokemonQuiz {
    private String name = "Pokemon Quiz";
    private String result = "unknown";
    private int curQuestion;
    private boolean finished = false;

    ArrayList<Integer> tally = new ArrayList<Integer>();
    ArrayList<Question> questionList = new ArrayList<Question>();

    public PokemonQuiz(int curQuestion) {
        this.curQuestion = curQuestion;
        questionList.add(new Question("Water or Fire?", "Water", "Fire", 0, 1));
        questionList.add(new Question("Are you passionate or detached?", "Passionate", "Detached", 1, 0));
        questionList.add(new Question("Do you like facts or ideas?", "Facts", "Ideas", 2, 1));
        questionList.add(new Question("Would you rather go to a volcano or your friend's house?", "Volcano", "Friend's House", 1, 2));
        questionList.add(new Question("Would you rather live in the countryside or in a city?", "Countryside", "City", 2, 0));
        questionList.add(new Question("Are you high-strung or mellow?", "High-Strung", "Mellow", 0, 2));
        questionList.add(new Question("Night Owl or Early Bird?", "Night Owl", "Early Bird", 0, 1));
        questionList.add(new Question("Would you rather run or lift weights?", "Run", "Lift Weights", 1, 2));
        questionList.add(new Question("Glass half full or glass half empty?", "Half full", "Half empty", 2, 0));
        tally.add(0);
        tally.add(0);
        tally.add(0);
    }

    public Question getQuestion() {
        return questionList.get(curQuestion);
    }

    public String getName() {
        return name;
    }

    public int getCurQuestion() {
        return curQuestion + 1;
    }

    public int getTotalQuestions() {
        return questionList.size();
    }

    public void findResult() {
        int x = tally.get(0);
        int y = tally.get(1);
        int z = tally.get(2);

        if(x > y && x > z) {
            result = "Squirtle";
        }
        else if(y > z) {
            result = "Charmander";
        }
        else {
            result = "Bulbasaur";
        }
    }

    public String getResult() {
        return result;
    }

    public boolean isFinished() {
        return finished;
    }

    public void tally(int x) {
        Integer value = tally.get(x);
        value++;
        tally.set(x,value);
    }

    public void nextQuestion(){
        curQuestion++;
    }
}
