package com.example.smdassignment

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<ImageButton>(R.id.searchbtn).setOnClickListener{
            startActivity(Intent(this, SearchActivity::class.java))
        }
        findViewById<ImageButton>(R.id.profilebtn).setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        findViewById<ImageButton>(R.id.chatbtn).setOnClickListener{
            startActivity(Intent(this, ChatActivity::class.java))
        }
        findViewById<ImageButton>(R.id.addbtn).setOnClickListener{
            startActivity(Intent(this, AddMentorActivity::class.java))
        }
        findViewById<CardView>(R.id.mentorcard).setOnClickListener{
            startActivity(Intent(this, MentorHomeActivity::class.java))
        }
    }
}