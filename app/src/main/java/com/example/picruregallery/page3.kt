package com.example.picruregallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page3 : AppCompatActivity() {
    lateinit var btngo3:Button
    lateinit var btnprev3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        castViews3()
        onClick3()
    }
    fun castViews3(){
         btnprev3 = findViewById(R.id.btnprev3)
         btngo3 = findViewById(R.id.btngo3)

    }


    fun onClick3(){

        btnprev3.setOnClickListener {
            var previous=Intent(baseContext,page2::class.java)
            startActivity(previous)

        }
        btngo3.setOnClickListener {
            var intent=Intent(baseContext,page4::class.java)
            startActivity(intent)
        }
    }
}