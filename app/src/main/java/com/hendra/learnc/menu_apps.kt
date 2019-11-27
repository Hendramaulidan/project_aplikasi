package com.hendra.learnc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu_apps.*

class menu_apps : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_apps)
        btnIntro.setOnClickListener { startActivity( Intent(this, introc::class.java))
            Toast.makeText(this, "pengantar",Toast.LENGTH_SHORT).show()}
        btnStruktur.setOnClickListener{startActivity(Intent(this,StrukturC::class.java))
            Toast.makeText(this, "struktur",Toast.LENGTH_SHORT).show()}
        btnTypeData.setOnClickListener{startActivity(Intent(this,TypeData::class.java))
            Toast.makeText(this, "Type data",Toast.LENGTH_SHORT).show()}
        btnVar.setOnClickListener{startActivity(Intent(this,Variable_c::class.java))
            Toast.makeText(this, "Variable",Toast.LENGTH_SHORT).show()}
        btnOut.setOnClickListener{startActivity(Intent(this,Output_C::class.java))
            Toast.makeText(this, "OutPut dalam c++",Toast.LENGTH_SHORT).show()}
        btnIn.setOnClickListener{startActivity(Intent(this,Input_c::class.java))
            Toast.makeText(this, "Input dalam c++",Toast.LENGTH_SHORT).show()}
        btnCon.setOnClickListener{startActivity(Intent(this,Condition_C::class.java))
            Toast.makeText(this, "Condition C++",Toast.LENGTH_SHORT).show() }
        btnLoop.setOnClickListener{startActivity(Intent(this,looping_C::class.java))
            Toast.makeText(this, "Loop dalam C++",Toast.LENGTH_SHORT).show() }

    }
    }