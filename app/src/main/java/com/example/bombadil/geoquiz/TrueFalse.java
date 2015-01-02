package com.example.bombadil.geoquiz;


/**
 * Created by Bombadil on 12/31/2014.
 */
public class TrueFalse {
    private int mQuestion;  // resource ID of the question

    private boolean mTrueQuestion;  // answer (true / false)


    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
