package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitOrder(View view) {

        RadioButton one = (RadioButton) findViewById(R.id.one);
        boolean isOne = one.isChecked();

        CheckBox two =(CheckBox) findViewById(R.id.two);
        boolean isTwo = two.isChecked();

        CheckBox three =(CheckBox) findViewById(R.id.two);
        boolean isThree = three.isChecked();

        RadioButton five = (RadioButton) findViewById(R.id.one);
        boolean isFive = five.isChecked();

        RadioButton six = (RadioButton) findViewById(R.id.one);
        boolean isSix = six.isChecked();

        int totalScore = calculateScore(isOne, isTwo, isThree, isFive, isSix);

        String grading = "Your total score is: "+totalScore +" out of 5";
        displayMessage(grading);

    }

    private int calculateScore (boolean one, boolean two, boolean three, boolean five, boolean six){
        int score =0;

        if(one){
            score=score+1;
        }
        else{
            score = score+0;
        }
        if(two){
            score=score+1;
       }
        else{
            score = score+0;
        }
        if(three){
            score=score+1;
        }
        else{
            score = score+0;
        }
        if(five){
            score=score+1;
        }
        else{
            score = score+0;
        }
       if(six){
            score=score+1;
        }
       else{
           score = score+0;
       }

        return score;
    }

    private void displayMessage(String message) {
        TextView ResultTextView = (TextView) findViewById(R.id.result);
        ResultTextView.setText(message);
    }
}