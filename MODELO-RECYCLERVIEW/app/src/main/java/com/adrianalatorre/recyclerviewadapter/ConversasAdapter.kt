package com.adrianalatorre.recyclerviewadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ConversasAdapter(
    //passando a lista criada na Main
    private val listaConversas : List<Conversa>
) : Adapter<ConversasAdapter.ConversaViewHolder>() {

    //View Holder -> Responsável pela visualização
    inner class ConversaViewHolder(itemView: View) : ViewHolder(itemView) {

        val textNome = itemView.findViewById<TextView>(R.id.text_nome)
        val imagPerfil = itemView.findViewById<ImageView>(R.id.img_perfil)
        //Aponta para imagens e texto layout


    }

    // 1) executa primeiro e uma única vez para cada item
    //    Executado para cada criação de View, converter XML para Objeto do tipo View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversaViewHolder {

        //Inflar Layout, converter XML para Objeto View
//        val layoutInflater = LayoutInflater.from( parent.context )
//
//        val view = layoutInflater.inflate(
//            R.layout.item_conversa,
//            parent,
//            false // coloca automaticamente na view
//        )

        //Simplificando o processo
       val view =  LayoutInflater
            .from( parent.context )
            .inflate(
                R.layout.item_conversa, parent, false
            )

        return ConversaViewHolder(view) //View
    }


    //recupera a quantidade de itens que será exibido
    override fun getItemCount(): Int {
        return listaConversas.size
    }

    // Conecta os dados com a view
    override fun onBindViewHolder(conversaViewHolder: ConversaViewHolder, position: Int) {

        val conversa = listaConversas[position]
        conversaViewHolder.textNome.text = conversa.nome

    }


}