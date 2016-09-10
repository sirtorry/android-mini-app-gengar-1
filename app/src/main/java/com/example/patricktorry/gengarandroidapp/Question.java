package com.example.patricktorry.gengarandroidapp;

/**
 * Created by Torry on 10/09/2016.
 */
public class Question {
    public String question;
    public String answer1;
    public String answer2;
    public int res1;
    public int res2;

    public Question(String question, String answer1, String answer2, int res1, int res2) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.res1 = res1;
        this.res2 = res2;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public int getRes1() {
        return res1;
    }

    public int getRes2() {
        return res2;
    }
}
