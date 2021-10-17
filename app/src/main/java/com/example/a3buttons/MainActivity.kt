package com.example.a3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etName : EditText
    lateinit var etMiddleName : EditText
    lateinit var etLastName : EditText

    lateinit var tv : TextView

    lateinit var btToast : Button
    lateinit var btTextView : Button
    lateinit var btNewActivity : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName =findViewById(R.id.etName)
        etMiddleName =findViewById(R.id.etMiddleName)
        etLastName =findViewById(R.id.etLastName)
        tv =findViewById(R.id.textView)
        btToast =findViewById(R.id.btToast)
        btTextView =findViewById(R.id.btTextView)
        btNewActivity =findViewById(R.id.btNewActivity)


        btToast.setOnClickListener {
            Toast.makeText(applicationContext , "name ${etName.text} ${etMiddleName.text} ${etLastName.text}" , Toast.LENGTH_LONG).show()
        }

        btTextView.setOnClickListener {
            tv.text = "name ${etName.text} ${etMiddleName.text} ${etLastName.text}"
        }

        btNewActivity.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name", etName.text.toString() )
            intent.putExtra("middle", etMiddleName.text.toString() )
            intent.putExtra("last", etLastName.text.toString() )

            startActivity(intent)
        }
    }
}