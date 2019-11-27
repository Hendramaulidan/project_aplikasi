package com.hendra.learnc

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_admin2.*

class adminAc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin2)
        btn_admins.setOnClickListener {
            startActivity(Uri.parse("tel:0895620087695").let { number ->
                ( Intent(Intent.ACTION_DIAL, number))})

        }
    }
}
