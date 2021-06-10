package com.example.picruregallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page5 : AppCompatActivity() {
    lateinit var btnprev5:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        castViews5()
        onClick5()
    }
    fun castViews5() {

        btnprev5 = findViewById(R.id.btnprev5)
    }
    fun onClick5(){
        btnprev5.setOnClickListener {
            var intent=Intent(baseContext,page4::class.java)
            startActivity(intent)
        }
    }
}