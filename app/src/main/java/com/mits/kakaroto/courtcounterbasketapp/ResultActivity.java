package com.mits.kakaroto.courtcounterbasketapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView tvResultA = (TextView) findViewById(R.id.tv_resultScoreA);
        TextView tvResultB = (TextView) findViewById(R.id.tv_resultScoreB);

        Intent getValueIntent = getIntent();
        Score resultScore = (Score) getValueIntent.getSerializableExtra("score");
        tvResultA.setText(String.valueOf(resultScore.getScoreA()));
        tvResultB.setText(String.valueOf(resultScore.getScoreB()));
    }
}
