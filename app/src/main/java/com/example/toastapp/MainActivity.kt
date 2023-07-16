package com.example.toastapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDownload=findViewById<Button>(R.id.download)
        val btnUplaod=findViewById<Button>(R.id.upload)

        btnDownload.setOnClickListener(){
            Toast.makeText(applicationContext, "Downloading in progress...", Toast.LENGTH_LONG).show()
        }

        btnUplaod.setOnClickListener(){
            Toast.makeText(applicationContext, "Uploading in progress...", Toast.LENGTH_LONG).show()
        }
    }
}