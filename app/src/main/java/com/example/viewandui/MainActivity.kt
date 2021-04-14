package com.example.viewandui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.Path

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigation.background = null
        floatingButton.setOnClickListener {
            val intent: Intent = Intent(this,Pay::class.java)
            startActivity(intent)
            finish()
        }
    }
}