package com.example.kotlinlog


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num=60

        if (num>=90) {
            Log.d("kotlintest","優")
        }else if (num>=75){
            Log.d("kotlintest","良")
        }else if (num>=60){
            Log.d("kotlintest","可")
        }else
           Log.d("kotlintest","不可")

    }
}
