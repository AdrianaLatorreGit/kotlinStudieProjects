package com.adrianalatorre.caracoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_jogar.setOnClickListener {

            val intent = Intent( this, ResultadoActivity::class.java )

            //Gerar número randômico
            val numero = Random.nextInt(2)

            //Enviar número para a próxima activity
            intent.putExtra("numero", numero)

            startActivity(intent)

        }

    }
}