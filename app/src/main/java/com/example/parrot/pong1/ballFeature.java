package com.example.parrot.pong1;

public class ballFeature {
    int ballXPos;
    int ballYPos;

    public ballFeature(int ballXPos, int ballYPos) {
        this.ballXPos = ballXPos;
        this.ballYPos = ballYPos;
    }

    public int getBallXPos() {
        return ballXPos;
    }

    public void setBallXPos(int ballXPos) {
        this.ballXPos = ballXPos;
    }

    public int getBallYPos() {
        return ballYPos;
    }

    public void setBallYPos(int ballYPos) {
        this.ballYPos = ballYPos;
    }
}
