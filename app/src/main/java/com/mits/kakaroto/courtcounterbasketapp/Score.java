package com.mits.kakaroto.courtcounterbasketapp;

import java.io.Serializable;

/**
 * Created by kakaroto on 12/19/16.
 */

public class Score implements Serializable{
    private int scoreA;
    private int scoreB;

    public Score(int scoreA, int scoreB) {
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public int getScoreA() {
        return scoreA;
    }

    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }
}
