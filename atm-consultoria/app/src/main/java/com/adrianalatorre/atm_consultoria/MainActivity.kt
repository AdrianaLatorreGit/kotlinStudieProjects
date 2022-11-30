package com.adrianalatorre.atm_consultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_contato.setOnClickListener {

            Toast.makeText( this, "Contato foi clicado", Toast.LENGTH_SHORT ).show()

            val intent = Intent( this, DetalheContatoActivity::class.java )
            startActivity(intent)
        }

        button_empresa.setOnClickListener {
            val intent = Intent( this, DetalheEmpresaActivity::class.java )
            startActivity(intent)

            Toast.makeText( this, "Empresa foi clicado", Toast.LENGTH_SHORT ).show()
        }

        button_servicos.setOnClickListener {
            val intent = Intent( this, DetalheServicosActivity::class.java )
            startActivity(intent)

            Toast.makeText( this, "Serviços foi clicado", Toast.LENGTH_SHORT ).show()
        }

        button_cliente.setOnClickListener {
            val intent = Intent( this, DetalheClientesActivity::class.java )
            startActivity(intent)

            Toast.makeText( this, "Cliente foi clicado", Toast.LENGTH_SHORT ).show()
        }

    }



}