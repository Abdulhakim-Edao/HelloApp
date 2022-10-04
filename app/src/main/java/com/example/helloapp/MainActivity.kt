package com.example.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.temp.*
import kotlinx.android.synthetic.main.temp.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.temp)
    }

    fun clickedFun(view: View) {
//        var tv:TextView = findViewById<TextView>(R.id.textView)
//        tv.text =  " Hello Kotlin"



        button.setOnClickListener{
            textView.text = "Hello Kotlin"
        }

    }

    fun surpriseClick(view: View){
//        var txt: TextView = findViewById(R.id.tview)
//        txt.text = "Surpise Buddy"
//        var imgg: ImageView = findViewById(R.id.img)
        surprisebtn.setOnClickListener{
            tview.text = "Surprise ${bview.text}!"
            imgview.setImageResource(R.drawable.img_1);

        }


    }


}