package com.mits.kakaroto.courtcounterbasketapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE=1;
    public static final String TAG = "TagMain";

    private TextView tvResultScoreA, tvResultScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultScoreA = (TextView) findViewById(R.id.tv_resultScoreA);
        tvResultScoreB = (TextView) findViewById(R.id.tv_resultScoreB);

    }

    public void submitStart(View view){
        Intent intent = new Intent(this, ResultActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    public void submitExit(View view){

        new AlertDialog.Builder(this)
                .setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(REQUEST_CODE == REQUEST_CODE){
            if(resultCode == RESULT_OK){
                Log.d(TAG, "Result Score Succes");
                Score resultScore = data.getParcelableExtra("score");

                tvResultScoreA.setText(String.valueOf(resultScore.getScoreA()));
                tvResultScoreB.setText(String.valueOf(resultScore.getScoreB()));

            }else if(resultCode == RESULT_CANCELED){
                Log.d(TAG, "No Result For Score");
            }
        }
    }
}

