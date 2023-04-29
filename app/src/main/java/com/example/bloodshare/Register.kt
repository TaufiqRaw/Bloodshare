package com.example.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * Tanggal Pengerjaan : 28-04-2023
 * NIM      : 10120789
 * Nama     : Taufiq Ridho Adi Waskita
 * Kelas    : If-9
 * **/

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var btnRegister = findViewById<Button>(R.id.register_btnRegister)
        btnRegister.setOnClickListener {
            Intent(this, Almost::class.java).also {
                startActivity(it)
            }
        }
    }
}