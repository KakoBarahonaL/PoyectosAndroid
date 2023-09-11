package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    //Declaramos las variables
    private lateinit var txtUser: EditText
    private lateinit var txtClave: EditText
    private lateinit var btn1: Button
    private lateinit var musica:MediaPlayer


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        musica = MediaPlayer.create(this, R.raw.arcade)
        musica.isLooping=true
        musica.start()

        val progressBar:ProgressBar = findViewById(R.id.PBar)
        progressBar.progress = 10
        progressBar.visibility = View.INVISIBLE

        // Inicializamos las referencias de las vistas
        txtUser = findViewById(R.id.txtUser)
        txtClave = findViewById(R.id.txtClave)
        btn1 = findViewById(R.id.btn1)

        // Configurar el listener para el botón de inicio de sesión
        btn1.setOnClickListener{
            validarUsuario()


        }
    }

    private fun validarUsuario() {
        val usuario = txtUser.text.toString()
        val clave = txtClave.text.toString()

        val progressBar:ProgressBar = findViewById(R.id.PBar)
        progressBar.visibility = View.VISIBLE
        Handler(Looper.getMainLooper()).postDelayed({

            //implementacion logica de validación
            if (usuario == "usuario" && clave == "123456") {

                musica.stop()
                musica.prepare()
                val intent: Intent = Intent(this, Pagina2::class.java)
                startActivity(intent)



            } else {
                //Se muestra mensaje de error
                Toast.makeText(this, "Error en los datos", Toast.LENGTH_SHORT).show()
                progressBar.visibility = View.INVISIBLE
            }
        },2000)
    }
}
