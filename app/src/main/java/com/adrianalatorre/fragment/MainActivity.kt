package com.adrianalatorre.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.adrianalatorre.fragment.fragments.ChamadasFragment
import com.adrianalatorre.fragment.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnConversas: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas = findViewById(R.id.btn_chamadas)

//        val fragmentManager = supportFragmentManager.beginTransaction()
//
//        //Diversas alterações em fragments
//        fragmentManager.add( R.id.fragment_conteudo, ConversasFragment() )
//
//        fragmentManager.commit()

        //Escrevendo de maneira mais simplificada
//        supportFragmentManager
//            .beginTransaction()
//            .add( R.id.fragment_conteudo, ConversasFragment() )
//            .commit()

        //Chamando botão
        btnConversas.setOnClickListener {
            supportFragmentManager
            .beginTransaction()
            .replace( R.id.fragment_conteudo, ConversasFragment() )
            .commit()
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, ChamadasFragment())
                .commit()
        }

        //Para remover o fragment
//        val conversasFragment = ConversasFragment()
//        btnChamadas.setOnClickListener {
//            supportFragmentManager
//                .beginTransaction()
//                .remove( ConversasFragment() )
//                .commit()
//        }

    }
}