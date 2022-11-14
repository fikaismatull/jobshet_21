package com.example.jobshet21_fika

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "CHELSIA ADITYA SUYATNO",
        "DIMAS ILHAMSYAH RAMADHAN",
        "DINA MUSTIKA",
        "DWI RANI SYARIFAH",
        "FIFIT SOLIKHATUN MUFALAH",
        "FIKA ISMATUL HAWA",
        "FIKI ZULKARNAIN",
        "HEYDARISTO ZHAHIR RAZAQ",
        "IKHA NUR ROCHAYATIN",
        "IMA AZKA ROSADAH",
        "KHAMILA NUR LUTFI AZZAHRA",

        )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.KelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    
    }
}