package com.example.ipo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView mQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mQuestion = (TextView) findViewById(R.id.textView_ipo);
        //get the static method getRiskTolerance() to a string array
        String[] questionsLists = RiskTolerance.getRiskTolerance();
        for (String questionList : questionsLists)
        {
            mQuestion.append(questionList + "\n\n\n");
        }
    }
}