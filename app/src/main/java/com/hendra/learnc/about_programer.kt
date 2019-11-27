package com.hendra.learnc

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about_programer.*

class about_programer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_programer)
        btn_admins.setOnClickListener {
            startActivity(Uri.parse("tel:0895620087695").let { number ->
                ( Intent(Intent.ACTION_DIAL, number))})

        }

    }


}
