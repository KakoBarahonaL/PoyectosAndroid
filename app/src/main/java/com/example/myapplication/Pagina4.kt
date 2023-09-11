package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class Pagina4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina4)

        val ratingBar: RatingBar = findViewById(R.id.ratEval)

        val rating = ratingBar.rating
        ratingBar.numStars = 5

        ratingBar.setOnRatingBarChangeListener {_,rating, _ ->
            Toast.makeText(this, "Calificación: $rating", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Gracias por su calificación", Toast.LENGTH_SHORT).show()
        }

        //Cambio de página anterior
        val btn: Button = findViewById(R.id.btnCP)

        btn.setOnClickListener{
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