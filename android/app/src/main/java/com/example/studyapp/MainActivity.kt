package com.example.studyapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnScan).setOnClickListener {
            startActivity(Intent(this, OCRActivity::class.java))
        }
        findViewById<Button>(R.id.btnSummarize).setOnClickListener {
            startActivity(Intent(this, SummarizerActivity::class.java))
        }
        findViewById<Button>(R.id.btnQuiz).setOnClickListener {
            startActivity(Intent(this, QuizActivity::class.java))
        }
        findViewById<Button>(R.id.btnVideo).setOnClickListener {
            startActivity(Intent(this, VideoPlayerActivity::class.java))
        }
        findViewById<Button>(R.id.btnTranslate).setOnClickListener {
            startActivity(Intent(this, TranslatorActivity::class.java))
        }
    }
}