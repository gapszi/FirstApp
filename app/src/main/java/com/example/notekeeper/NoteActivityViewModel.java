package com.example.notekeeper;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {
    public static final String ORIGINAL_NOTE_COURSE_ID = "com.example.notekeeper.ORIGINAL_NOTE_COURSE_ID";
    public static final String ORIGINAL_NOTE_COURSE_TITLE = "com.example.notekeeper.ORIGINAL_NOTE_COURSE_TITLE";
    public static final String ORIGINAL_NOTE_COURSE_TEXT = "com.example.notekeeper.ORIGINAL_NOTE_COURSE_TEXT";

    public String mOriginalNoteCourseId;
    public String mOriginalNoteCourseTitle;
    public String mOriginalNoteCourseText;

    public boolean isNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        outState.putString(ORIGINAL_NOTE_COURSE_TITLE, mOriginalNoteCourseTitle);
        outState.putString(ORIGINAL_NOTE_COURSE_TEXT, mOriginalNoteCourseText);
    }

    public void restoreState(Bundle inState) {
        mOriginalNoteCourseId = inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalNoteCourseTitle = inState.getString(ORIGINAL_NOTE_COURSE_TITLE);
        mOriginalNoteCourseText = inState.getString(ORIGINAL_NOTE_COURSE_TEXT);
    }
}
