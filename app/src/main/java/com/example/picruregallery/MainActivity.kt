package com.example.picruregallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btngo1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews1()
        onClick1()

    }
fun castViews1() {

    btngo1 = findViewById(R.id.btngo1)
}
    fun onClick1(){

        btngo1.setOnClickListener {
            var next=Intent(baseContext,page2::class.java)
            startActivity(next)
        }
    }
}