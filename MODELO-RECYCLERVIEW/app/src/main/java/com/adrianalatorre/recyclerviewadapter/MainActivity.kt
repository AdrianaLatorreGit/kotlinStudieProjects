package com.adrianalatorre.recyclerviewadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvConversas : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvConversas = findViewById(R.id.rv_conversas)

        val lista = listOf(
            Conversa("Adriana", "<imagem ilustrando perfil>"),
            Conversa("João", "<imagem ilustrando perfil>"),
            Conversa("Paulo", "<imagem ilustrando perfil>"),
            Conversa("Cristina", "<imagem ilustrando perfil>"),
            Conversa("Maria", "<imagem ilustrando perfil>"),
            Conversa("Pedro", "<imagem ilustrando perfil>"),
            Conversa("Antonio", "<imagem ilustrando perfil>"),
        )

        //Adaptador de dados
        rvConversas.adapter = ConversasAdapter( lista )

        //Gerenciador de layout
        rvConversas.layoutManager = LinearLayoutManager(this)


    }
}