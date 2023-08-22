package com.example.lailatulrisa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rveducation)
        educationView.layoutManager = LinearLayoutManager(this)

        list.add(SchoolData("SDN Timbulsloko 1", "Ds.Timbulsloko Kec.Sayung,Kab.Demak"))
        list.add(SchoolData("SMP IT Daaruttahfidz", "DS.Karangasem Kec.Sayung,Kab.Demak"))
        list.add(SchoolData("SMKN 1 Sayung", "Jl. Raya Semarang-Demak"))

        educationAdapter = SchoolAdapter(list)
        educationView.adapter = educationAdapter
    }
}