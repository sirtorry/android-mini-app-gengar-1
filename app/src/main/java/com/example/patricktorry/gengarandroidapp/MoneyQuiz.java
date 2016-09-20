package com.example.patricktorry.gengarandroidapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Torry on 10/09/2016.
 */

public class MoneyQuiz implements Serializable{
    private String name = "Money Quiz";
    private String result = "Hard to tell...";
    private int curQuestion;
    private boolean finished = false;

    ArrayList<Integer> tally = new ArrayList<Integer>();
    ArrayList<Question> questionList = new ArrayList<Question>();

    public MoneyQuiz(int curQuestion) {
        this.curQuestion = curQuestion;
        questionList.add(new Question("Do you want to give Torry & Patrick $5?", "Sure!", "No way!", 0, 1));
        questionList.add(new Question("Would you like to give them $5?", "F*ck no!", "Hell ye!", 1, 0));
        questionList.add(new Question("Do you like Patrick and Torry?", "Yes", "No", 0, 1));
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

        if(x == 3) {
            result = "You will give us $5.";
        }
        else {
            result = "Unfortunately, I doubt you'll give us $5";
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
