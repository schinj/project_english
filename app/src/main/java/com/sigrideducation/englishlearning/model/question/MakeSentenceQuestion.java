package com.sigrideducation.englishlearning.model.question;

import android.os.Parcel;

public final class MakeSentenceQuestion extends Question<String> {


    public MakeSentenceQuestion(String question, String answer, boolean solved) {
        super(question, answer, solved);
    }

    @SuppressWarnings("unused")
    public MakeSentenceQuestion(Parcel in) {
        super(in);
        setAnswer(in.readString());
    }

    @Override
    public String getStringAnswer() {
        return getAnswer();
    }

    @Override
    public QuestionType getType() {
        return QuestionType.MAKE_SENTENCE;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(getAnswer());
    }
}
