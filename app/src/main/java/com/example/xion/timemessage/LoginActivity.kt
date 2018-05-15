package com.example.xion.timemessage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.Toast
import com.example.xion.timemessage.R.id.message

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val twitterLoginButton = findViewById<Button>(R.id.button2)
        twitterLoginButton.setOnClickListener{
            Toast.makeText(this, "ログイン!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, InboxActivity::class.java)
            startActivity(intent)
        }
    }
}
