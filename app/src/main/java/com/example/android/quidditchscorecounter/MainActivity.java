package com.example.android.quidditchscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Give 10 Points to Team A.
     */
    public void tenPointsToTeamA(View view) {
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Give 30 Points to Team A.
     */
    public void teamACatchTheSnicth(View view) {
        scoreTeamA = scoreTeamA + 30;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Give 1 Foul to Team A.
     */
    public void oneFoulToTeamA(View view) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }
    /**
     * Reset the Score.
     */
    public void scoreReset(View view) {
        scoreTeamA = 0;
        foulsTeamA = 0;
        scoreTeamB = 0;
        foulsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Give 10 Points to Team B.
     */
    public void tenPointsToTeamB(View view) {
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Give 30 Points to Team B.
     */
    public void teamBCatchTheSnicth(View view) {
        scoreTeamB = scoreTeamB + 30;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Give 1 Foul to Team B.
     */
    public void oneFoulToTeamB(View view) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }

}
