package com.example.studyapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context) : SQLiteOpenHelper(context, "study.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE summaries(id INTEGER PRIMARY KEY, text TEXT)")
        db.execSQL("CREATE TABLE quizzes(id INTEGER PRIMARY KEY, text TEXT)")
        db.execSQL("CREATE TABLE videos(id INTEGER PRIMARY KEY, subject TEXT, filename TEXT)")
        db.execSQL("CREATE TABLE subtitles(id INTEGER PRIMARY KEY, videoId INTEGER, lang TEXT, filename TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldV: Int, newV: Int) {}
}