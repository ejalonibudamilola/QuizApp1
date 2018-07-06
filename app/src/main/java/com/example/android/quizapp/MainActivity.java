package com.example.android.quizapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

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

        CheckBox three =(CheckBox) findViewById(R.id.three);
        boolean isThree = three.isChecked();

        RadioButton four = (RadioButton) findViewById(R.id.four);
        boolean isFour = four.isChecked();

        CheckBox five = (CheckBox) findViewById(R.id.five);
        boolean isFive = five.isChecked();

        EditText six = (EditText) findViewById(R.id.six);
        String sixs = six.getText().toString();
        sixs = sixs.toLowerCase();

        EditText seven = (EditText) findViewById(R.id.seven);
        String sevens = seven.getText().toString();
        sevens = sevens.toLowerCase();

        int totalScore = calculateScore(isOne, isTwo, isThree, isFour, isFive, sixs,sevens);

        String grading = "Your total score is: "+totalScore +" out of 7";
        displayMessage(grading);

    }

    private int calculateScore (boolean one, boolean two, boolean three, boolean four, boolean five, String six, String seven){
        String check1 = "continent";
        String check2 = "bible";
        int score =0;

        if(one){
            score=score+1;
        }

        if(two){
            score=score+1;
        }

        if(three){
            score=score+1;
        }

        if(four){
            score=score+1;
        }

       if(five){
            score=score+1;
       }
       if(six.equals(check1) ){
           score=score+1;
       }
       if(seven.equals(check2)){
           score=score+1;
       }

        return score;
    }

    private void displayMessage(String message) {
        TextView ResultTextView = (TextView) findViewById(R.id.result);
        ResultTextView.setText(message);
    }
}