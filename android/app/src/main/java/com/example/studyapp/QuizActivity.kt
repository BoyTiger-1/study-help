package com.example.studyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.github.gpt4all.GPT4All

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val extractedText = intent.getStringExtra("EXTRACTED_TEXT") ?: ""
        val gpt = GPT4All(this, "ggml-gpt4all-j-v1.3-groovy.bin")
        val quizPrompt = "From this text, make 3 simple quiz questions with answers:\n$extractedText"
        val quiz = gpt.generate(quizPrompt)
        findViewById<TextView>(R.id.quizView).text = quiz
    }
}