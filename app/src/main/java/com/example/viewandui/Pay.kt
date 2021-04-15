package com.example.viewandui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pay.*

class Pay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)
        cardView3.setOnClickListener {
            val intent: Intent = Intent(this, Cards::class.java)
            startActivity(intent)
            finish()
        }
        arrowBack.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}