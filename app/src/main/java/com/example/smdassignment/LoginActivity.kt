package com.example.smdassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<TextView>(R.id.registertext).setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        findViewById<Button>(R.id.loginbtn).setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }

}