package com.example.studyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.github.gpt4all.GPT4All

class SummarizerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summarizer)

        val extractedText = intent.getStringExtra("EXTRACTED_TEXT") ?: ""
        val gpt = GPT4All(this, "ggml-gpt4all-j-v1.3-groovy.bin")
        val prompt = "Summarize this text in simple words:\n$extractedText"
        val summary = gpt.generate(prompt)
        findViewById<TextView>(R.id.summaryView).text = summary
    }
}