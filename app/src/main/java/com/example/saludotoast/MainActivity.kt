package com.example.saludotoast


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datos = arrayOf("uno", "dos", "tres", "cuatro",
            "cinco", "seis", "siete", "ocho",
            "nueve", "diez", "once", "doce",
            "trece", "catorce", "quince")

        val adaptador = ArrayAdapter(this,
            R.layout.item_list,
            datos)

        val miLista: ListView = findViewById(R.id.miLista)
        miLista.adapter = adaptador

        miLista.onItemClickListener =
            object : AdapterView.OnItemClickListener{
                override fun onItemClick(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(
                        applicationContext,
                        "Escogido: ${miLista.getItemAtPosition(position)}",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

    }
}
