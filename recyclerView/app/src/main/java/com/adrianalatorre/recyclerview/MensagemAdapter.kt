package com.adrianalatorre.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<Mensagem>
) : Adapter<MensagemAdapter.MensagemViewHolder>() {


    inner class MensagemViewHolder(
        val itemView: View
    ) : ViewHolder(itemView) {

        val textNome: TextView = itemView.findViewById(R.id.text_nome)
        val textUltima: TextView = itemView.findViewById(R.id.text_ultima)
        val textHorario: TextView = itemView.findViewById(R.id.text_horario)

    }

    // Ao criar View Holder -> Criar a visualização
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

        val itemView = layoutInflater.inflate(
            R.layout.item_lista, parent, false
        )

        return MensagemViewHolder(itemView)

    }

    // ao vincular os dados para o view holder (visualização)
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {

        val mensagem = lista[position]
        holder.textNome.text = mensagem.nome
        holder.textUltima.text = mensagem.ultima
        holder.textHorario.text = mensagem.horario

    }

    // recuperar a quantidade de itens
    override fun getItemCount(): Int {
       return lista.size
    }

}