package com.mits.kakaroto.courtcounterbasketapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class ResultActivity extends AppCompatActivity {

    TextView tvScoreA, tvScoreB;
    int hasilA, hasilB, scoreA, scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        tvScoreA = (TextView) findViewById(R.id.tv_scoreA);
        tvScoreB = (TextView) findViewById(R.id.tv_scoreB);

    }

    public void addScoreA(int score){
        scoreA = Integer.parseInt(tvScoreA.getText().toString());
        hasilA = scoreA + score;
        tvScoreA.setText(String.valueOf(hasilA));
    }

    public void addScoreB(int score){
        scoreB = Integer.parseInt(tvScoreB.getText().toString());
        hasilB = scoreB + score;
        tvScoreB.setText(String.valueOf(hasilB));
    }

    public void submitTwoPointA(View view){
        addScoreA(2);
    }

    public void submitThreePointA(View view){
        addScoreA(3);

    }

    public void submitFreeThrowA(View view){
        addScoreA(1);
    }

    public void submitTwoPointB(View view){
        addScoreB(2);
    }

    public void submitThreePointB(View view){
        addScoreB(3);
    }

    public void submitFreeThrowB(View view){
        addScoreB(1);
    }

    public void submitReset(View view){
        tvScoreA.setText("0");
        tvScoreB.setText("0");
    }

    public void submitEnd(View view){
        Intent returnIntent = new Intent();
        Score score = new Score(hasilA, hasilB);
        returnIntent.putExtra("score", score);
        setResult(RESULT_OK, returnIntent);
        finish();
    }

    public void submitCancel(View view) {
        Intent returnIntent = new Intent();
        setResult(RESULT_CANCELED, returnIntent);
        finish();
    }

}
