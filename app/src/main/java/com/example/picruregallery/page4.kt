package com.example.picruregallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page4 : AppCompatActivity() {
    lateinit var btnprev4:Button
    lateinit var btngo4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        castView4()
        onClick4()

    }
fun castView4() {

    btnprev4 = findViewById(R.id.btnprev4)
     btngo4 = findViewById(R.id.btngo4)
}
    fun onClick4(){


        btnprev4.setOnClickListener {
            var intent=Intent(baseContext,page3::class.java)
            startActivity(intent)
        }
        btngo4.setOnClickListener {
            var intent=Intent(baseContext,page5::class.java)
            startActivity(intent)
        }
    }
}