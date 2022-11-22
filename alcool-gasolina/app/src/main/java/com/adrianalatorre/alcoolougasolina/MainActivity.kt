package com.adrianalatorre.alcoolougasolina

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btCalcular(view: View) {
        //val precoAlcool = findViewById(R.id.edit_preco_alcool) as EditText

        val precoAlcool = edit_preco_alcool.text.toString()
        val precoGasolina = edit_preco_gasolina.text.toString()


        calcularMelhorPreco(precoAlcool, precoGasolina)
    }

    fun calcularMelhorPreco( precoAlcool: String, precoGasolina: String ){

        //Converte valores string para números
        val valorAlcool = precoAlcool.toDouble()
        val valorGasolina = precoGasolina.toDouble()

        /* Faz cálculo (precoAlcool/ precoGasolina)
        * Se resultado >= 0.7 melhor utilizar gasolina
        * se não melhor utilizar álcool
        * */

        val resultadoPreco = valorAlcool / valorGasolina

        if( resultadoPreco >= 0.7 ){
            text_resultado.setText("Melhor utilizazr Gasolina!")
        }else{
            text_resultado.setText("Melhor utilizar Álcool!")
        }

    }

}