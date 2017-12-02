package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    /**
     * Global verabels for team A and B.
     */
    int scoreTeamA = 0;
    int redCardA = 0;
    int yellowCardA = 0;

    int scoreTeamB = 0;
    int redCardB = 0;
    int yellowCardB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addYellowA(View view) {
        yellowCardA = yellowCardA + 1;
        displayForTeamA(scoreTeamA, yellowCardA, redCardA);
    }

    public void addRedA(View view) {
        redCardA = redCardA + 1;
        displayForTeamA(scoreTeamA, yellowCardA, redCardA);
    }

    public void add1pointA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA, yellowCardA, redCardA);
    }


    public void addYellowB(View view) {
        yellowCardB = yellowCardB + 1;
        displayForTeamB(scoreTeamB, yellowCardB, redCardB);
    }

    public void addRedB(View view) {
        redCardB = redCardB + 1;
        displayForTeamB(scoreTeamB, yellowCardB, redCardB);
    }

    public void add1pointB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB, yellowCardB, redCardB);
    }

    public void resetButton(View v) {
        scoreTeamA = 0;
        redCardA = 0;
        yellowCardA = 0;
        scoreTeamB = 0;
        redCardB = 0;
        yellowCardB = 0;
        displayForTeamA(yellowCardA, yellowCardA, redCardA);
        displayForTeamB(yellowCardB, yellowCardB, redCardB);
    }

    /**
     * Displays the given score and faults for Team A.
     */
    public void displayForTeamA(int score, int yCard, int rCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        TextView yCardView = (TextView) findViewById(R.id.team_a_yellow);
        yCardView.setText(String.valueOf(yCard));
        TextView rCardView = (TextView) findViewById(R.id.team_a_red);
        rCardView.setText(String.valueOf(rCard));
    }
    /**
     * Displays the given score and faults for Team B.
     */
    public void displayForTeamB(int score, int yCard, int rCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        TextView yCardView = (TextView) findViewById(R.id.team_b_yellow);
        yCardView.setText(String.valueOf(yCard));
        TextView rCardView = (TextView) findViewById(R.id.team_b_red);
        rCardView.setText(String.valueOf(rCard));
    }


}