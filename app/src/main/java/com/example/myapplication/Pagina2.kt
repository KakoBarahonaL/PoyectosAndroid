package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pagina2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)
        //Cambio de página
        val btn1: Button = findViewById(R.id.btnCP)

        btn1.setOnClickListener{
            val intent: Intent = Intent(this, Pagina3:: class.java)
            startActivity(intent)
        }

        //volver al login
        val btn2: Button = findViewById(R.id.btncerrar)

        btn2.setOnClickListener{

            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        }
}