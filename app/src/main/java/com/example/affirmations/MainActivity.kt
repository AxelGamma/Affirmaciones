package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView: TextView=findViewById(R.id.textview)
//        //crear y mostrar el size de la lista de afirmaciones
//        textView.text= Datasource().loadAffirmation().size.toString()

        val myDataset=Datasource().loadAffirmation()

        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.adapter=ItemAdapter(this,myDataset)
        recyclerView.setHasFixedSize(true)


    }
}