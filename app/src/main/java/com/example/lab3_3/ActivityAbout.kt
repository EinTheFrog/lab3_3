package com.example.lab3_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3_3.databinding.ActivityAboutBinding

class ActivityAbout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}