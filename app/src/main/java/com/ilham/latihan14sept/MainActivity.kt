package com.ilham.latihan14sept

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnMi : Button
    private lateinit var btnTekom : Button
    private lateinit var btnGaleri : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMi = findViewById(R.id.btnMi)
        btnTekom = findViewById(R.id.btnTekom)
        btnGaleri = findViewById(R.id.btnGaleri)

        btnMi.setOnClickListener() {
            intent = Intent(this@MainActivity, MiActivity::class.java)
            startActivity(intent)
        }

        btnTekom.setOnClickListener() {
            intent = Intent(this@MainActivity, TekomActivity::class.java)
            startActivity(intent)
        }

        btnGaleri.setOnClickListener() {
            intent = Intent(this@MainActivity, RecyclePnpActivity::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}