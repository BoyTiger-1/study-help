package com.example.studyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.ui.PlayerView

class VideoPlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player)

        // Example: list videos by subject, play with ExoPlayer, select subtitle file
        // You will need to flesh out the video asset loading and subtitle switching logic here
    }
}