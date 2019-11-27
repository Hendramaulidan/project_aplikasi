package com.hendra.learnc
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
lateinit var mTTs : TextToSpeech
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnlearn.setOnClickListener {
            pindahlayout()
        }

        btnprofil.setOnClickListener { startActivity(Intent(this,about_me::class.java))

    }}
    private fun pindahlayout() {
        val inten = Intent(this, menu_apps::class.java)
        Toast.makeText(this,"menu apps",Toast.LENGTH_LONG).show()
        startActivity(inten)
    }
    fun tekanTombol(view: View){
        if(image.getTag()=="background_art2") {
            image.setBackgroundResource(R.drawable.background_art3)
            image.setTag("background_art3")
        }else{
            image.setBackgroundResource(R.drawable.background_art2)
            image.setTag("background_art2")
        }
    }
}






