package com.example.patricktorry.gengarandroidapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Torry on 10/09/2016.
 */

public class MyersQuiz implements Serializable{
    private String name = "Myers-Briggs Typer Indicator";
    private String result = "unknown";
    private int curQuestion;
    private boolean finished = false;

    ArrayList<Integer> tally = new ArrayList<Integer>();
    ArrayList<Question> questionList = new ArrayList<Question>();

    public MyersQuiz(int curQuestion) {
        this.curQuestion = curQuestion;
        questionList.add(new Question("At a party do you:", "Interact with many, including strangers", "Interact with a few, known to you", 1, 0));
        questionList.add(new Question("Are you more:", "Realistic than speculative", "Speculative than realistic", 3, 2));
        questionList.add(new Question("Is it worse to:", "Have your head in the clouds", "Be in a rut", 3, 2));
        questionList.add(new Question("Are you more impressed by:", "Principles", "Emotions", 5, 4));
        questionList.add(new Question("Are more drawn toward the:", "Convincing", "Touching", 5, 4));
        questionList.add(new Question("Do you prefer to work:", "To deadlines", "Just whenever", 7, 6));
        questionList.add(new Question("Do you tend to choose:", "Rather carefully", "Somewhat impulsively", 7, 6));
        questionList.add(new Question("At parties do you:", "Stay late, with increasing energy", "Leave early with decreased energy", 1, 0));
        questionList.add(new Question("Are you more attracted to:", "Sensible people", "Imaginative people", 3, 2));
        questionList.add(new Question("Are you more interested in:", "What is actual", "What is possible", 3, 2));
        questionList.add(new Question("In judging others are you more swayed by:", "Laws than circumstances", "Circumstances than laws", 5, 4));
        questionList.add(new Question("In approaching others is your inclination to be somewhat:", "Objective", "Personal", 5, 4));
        questionList.add(new Question("Are you more:", "Punctual", "Leisurely", 7, 6));
        questionList.add(new Question("Does it bother you more having things:", "Incomplete", "Completed", 7, 6));
        questionList.add(new Question("In your social groups do you:", "Keep abreast of other’s happenings", "Get behind on the news", 1, 0));
        questionList.add(new Question("In doing ordinary things are you more likely to:", "Do it the usual way", "Do it your own way", 3, 2));
        questionList.add(new Question("Writers should:", "Say what they mean and mean what they say", "Express things more by use of analogy", 3, 2));
        questionList.add(new Question("Which appeals to you more:", "Consistency of thought", "Harmonious human relationships", 5, 4));
        questionList.add(new Question("Are you more comfortable in making:", "Logical judgments", "Value judgments", 5, 4));
        questionList.add(new Question("Do you want things:", "Settled and decided", "Unsettled and undecided", 7, 6));
        questionList.add(new Question("Would you say you are more:", "Serious and determined", "Easy-going", 7, 6));
        questionList.add(new Question("In phoning do you:", "Rarely question that it will all be said", "Rehearse what you’ll say", 1, 0));
        questionList.add(new Question("Facts:", "Speak for themselves", "Illustrate principles", 3, 2));
        questionList.add(new Question("Are visionaries:", "somewhat annoying", "rather fascinating", 3, 2));
        questionList.add(new Question("Are you more often:", "a cool-headed person", "a warm-hearted person", 5, 4));
        questionList.add(new Question("Is it worse to be:", "unjust", "merciless", 5, 4));
        questionList.add(new Question("Should one usually let events occur:", "by careful selection and choice", "randomly and by chance", 7, 6));
        questionList.add(new Question("Do you feel better about:", "having purchased", "having the option to buy", 7, 6));
        questionList.add(new Question("In company do you:", "initiate conversation", "wait to be approached", 1, 0));
        questionList.add(new Question("Common sense is:", "rarely questionable", "frequently questionable", 3, 2));
        questionList.add(new Question("Children often do not:", "make themselves useful enough", "exercise their fantasy enough", 3, 2));
        questionList.add(new Question("In making decisions do you feel more comfortable with:", "standards", "feelings", 5, 4));
        questionList.add(new Question("Are you more:", "firm than gentle", "gentle than firm", 5, 4));
        questionList.add(new Question("Which is more admirable:", "the ability to organize and be methodical", "the ability to adapt and make do", 7, 6));
        questionList.add(new Question("Do you put more value on:", "infinite", "open-minded", 7, 6));
        questionList.add(new Question("Does new and non-routine interaction with others:", "stimulate and energize you", "tax your reserves", 1, 0));
        questionList.add(new Question("Are you more frequently:", "a practical sort of person", "a fanciful sort of person", 3, 2));
        questionList.add(new Question("Are you more likely to:", "see how others are useful", "see how others see", 3, 2));
        questionList.add(new Question("Which is more satisfying:", "to discuss an issue thoroughly", "to arrive at agreement on an issue", 5, 4));
        questionList.add(new Question("Which rules you more:", "your head", "your heart", 5, 4));
        questionList.add(new Question("Are you more comfortable with work that is:", "contracted", "done on a casual basis", 7, 6));
        questionList.add(new Question("Do you tend to look for:", "the orderly", "whatever turns up", 7, 6));
        questionList.add(new Question("Do you prefer:", "many friends with brief contact", "a few friends with more lengthy contact", 1, 0));
        questionList.add(new Question("Do you go more by:", "facts", "principles", 3, 2));
        questionList.add(new Question("Are you more interested in:", "production and distribution", "design and research", 3, 2));
        questionList.add(new Question("Which is more of a compliment:", "There is a very logical person.", "There is a very sentimental person.", 5, 4));
        questionList.add(new Question("Do you value in yourself more that you are:", "unwavering", "devoted", 5, 4));
        questionList.add(new Question("Do you more often prefer the", "final and unalterable statement", "tentative and preliminary statement", 7, 6));
        questionList.add(new Question("Are you more comfortable:", "after a decision", "before a decision", 7, 6));
        questionList.add(new Question("Do you:", "speak easily and at length with strangers", "find little to say to strangers", 1, 0));
        questionList.add(new Question("Are you more likely to trust your:", "experience", "hunch", 3, 2));
        questionList.add(new Question("Do you feel:", "more practical than ingenious", "more ingenious than practical", 3, 2));
        questionList.add(new Question("Which person is more to be complimented – one of:", "clear reason", "strong feeling", 5, 4));
        questionList.add(new Question("Are you inclined more to be:", "fair-minded", "sympathetic", 5, 4));
        questionList.add(new Question("Is it preferable mostly to:", "make sure things are arranged", "just let things happen", 7, 6));
        questionList.add(new Question("In relationships should most things be:", "re-negotiable", "random and circumstantial", 7, 6));
        questionList.add(new Question("When the phone rings do you:", "hasten to get to it first", "hope someone else will answer", 1, 0));
        questionList.add(new Question("Do you prize more in yourself:", "a strong sense of reality", "a vivid imagination", 3, 2));
        questionList.add(new Question("Are you drawn more to:", "fundamentals", "overtones", 3, 2));
        questionList.add(new Question("Which seems the greater error:", "to be too passionate", "to be too objective", 5, 4));
        questionList.add(new Question("Do you see yourself as basically:", "hard-headed", "soft-hearted", 5, 4));
        questionList.add(new Question("Which situation appeals to you more:", "the structured and scheduled", "the unstructured and unscheduled", 7, 6));
        questionList.add(new Question("Are you a person that is more:", "routinized than whimsical", "whimsical than routinized", 7, 6));
        questionList.add(new Question("Are you more inclined to be:", "easy to approach", "somewhat reserved", 1, 0));
        questionList.add(new Question("In writings do you prefer:", "the more literal", "the more figurative", 3, 2));
        questionList.add(new Question("Is it harder for you to:", "identify with others", "utilize others", 3, 2));
        questionList.add(new Question("Which do you wish more for yourself:", "clarity of reason", "strength of compassion", 5, 4));
        questionList.add(new Question("Which is the greater fault:", "being indiscriminate", "being critical", 5, 4));
        questionList.add(new Question("Do you prefer the:", "planned event", "unplanned event", 7, 6));
        questionList.add(new Question("Do you tend to be more:", "deliberate than spontaneous", "spontaneous than deliberate", 7, 6));
        tally.add(0);
        tally.add(0);
        tally.add(0);
        tally.add(0);
        tally.add(0);
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
//        0 I
//        1 E
//        2 N
//        3 S
//        4 F
//        5 T
//        6 P
//        7 J
        int i = tally.get(0);
        int e = tally.get(1);
        int n = tally.get(2);
        int s = tally.get(3);
        int f = tally.get(4);
        int t = tally.get(5);
        int p = tally.get(6);
        int j = tally.get(7);

        String res = "";

        if(i > e) {
            res += "I";
        }
        else {
            res += "E";
        }

        if(n > s) {
            res += "N";
        }
        else {
            res += "S";
        }

        if(f > t) {
            res += "F";
        }
        else {
            res += "T";
        }

        if(p > j) {
            res += "P";
        }
        else {
            res += "J";
        }

        result = "Your Myers Briggs type is: " + res;
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
