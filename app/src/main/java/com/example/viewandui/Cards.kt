package com.example.viewandui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.PopupWindow
import kotlinx.android.synthetic.main.activity_cards.*

class Cards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)
        arrowBackCards.setOnClickListener {
            val intent: Intent = Intent(this,Pay::class.java)
            startActivity(intent)
            finish()
        }
        showMenu.setOnClickListener {
            rl1.visibility = View.VISIBLE
        }
        showMenu1.setOnClickListener {
            rl2.visibility = View.VISIBLE
        }
        showMenu2.setOnClickListener {
            rl3.visibility = View.VISIBLE
        }
        imgCancel.setOnClickListener {
            rl1.visibility = View.GONE
        }
        imgCancel1.setOnClickListener {
            rl2.visibility = View.GONE
        }
        imgCancel2.setOnClickListener {
            rl3.visibility = View.GONE
        }

    }

}