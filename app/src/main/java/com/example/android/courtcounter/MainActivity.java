package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int team_a_score = 0;
    int team_b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(team_a_score);
        displayForTeamA(team_b_score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the addThreeForTeamA button is clicked.
     */
    public void addThreeForTeamA(View view) {
        team_a_score += 3;
        displayForTeamA(team_a_score);
    }

    /**
     * This method is called when the addTwoForTeamA button is clicked.
     */
    public void addTwoForTeamA(View view) {
        team_a_score += 2;
        displayForTeamA(team_a_score);
    }

    /**
     * This method is called when Team A's Free Throw button is clicked.
     */
    public void addOneForTeamA(View view) {
        team_a_score += 1;
        displayForTeamA(team_a_score);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the addThreeForTeamB button is clicked.
     */
    public void addThreeForTeamB(View view) {
        team_b_score += 3;
        displayForTeamB(team_b_score);
    }

    /**
     * This method is called when the addTwoForTeamB button is clicked.
     */
    public void addTwoForTeamB(View view) {
        team_b_score += 2;
        displayForTeamB(team_b_score);
    }

    /**
     * This method is called when Team A's Free Throw button is clicked.
     */
    public void addOneForTeamB(View view) {
        team_b_score += 1;
        displayForTeamB(team_b_score);
    }

    /**
     * This method is resets both scores to zero to start a new game.
     */
    public void reset(View view) {
        team_a_score = 0;
        displayForTeamA(team_a_score);

        team_b_score = 0;
        displayForTeamB(team_b_score);
    }
}

