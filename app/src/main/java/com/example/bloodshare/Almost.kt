package com.example.bloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * Tanggal Pengerjaan : 29-04-2023
 * NIM      : 10120789
 * Nama     : Taufiq Ridho Adi Waskita
 * Kelas    : If-9
 * **/

class Almost : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost)
        var btnVerify = findViewById<Button>(R.id.almost_btnVerify);
        btnVerify.setOnClickListener {
            Intent(this, Verify::class.java).also {
                startActivity(it)
            }
        }
    }
}