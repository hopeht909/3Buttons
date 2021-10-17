package com.example.a3buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tv = findViewById(R.id.textView2)
        val st1 = intent.getStringExtra("name")
        val st2 = intent.getStringExtra("middle")
        val st3 = intent.getStringExtra("last")
        tv.text = "$st1 $st2 $st3"

    }
}