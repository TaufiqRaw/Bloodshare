package com.example.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

/**
 * Tanggal Pengerjaan : 28-04-2023
 * NIM      : 10120789
 * Nama     : Taufiq Ridho Adi Waskita
 * Kelas    : If-9
 * **/
class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val registerBtn = findViewById<TextView>(R.id.registerBtn)
        registerBtn.setOnClickListener {
            Intent(this,Register::class.java).also {
                startActivity(it)
            }
        }
    }
}