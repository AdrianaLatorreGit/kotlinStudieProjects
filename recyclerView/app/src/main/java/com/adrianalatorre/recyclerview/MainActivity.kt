package com.adrianalatorre.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var rvLista: RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = listOf(
            Mensagem("Adriana Latorre", "Olá, tudo bem", "10:43"),
            Mensagem("João da Sila", "Muito interessante", "15:34"),
            Mensagem("Maria do Jesus", "Não me diga", "17:23"),
            Mensagem("Joana Maria", "Que interessante", "19:17"),
        )

        rvLista = findViewById(R.id.rv_list)
        rvLista.adapter = MensagemAdapter(lista)   // tipo: MensagemAdapter, mas precisa tbm ser do tipo Adapter
        rvLista.layoutManager = LinearLayoutManager(this)


    }
}