package com.himanshu.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0, scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threeIncreament(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoIncreament(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void oneIncreament(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOneIncreament(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoIncreament(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeIncreament(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView2);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textView_2);
        scoreView.setText(String.valueOf(score));
    }

}