package com.example.kotlinlog


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        total(50,1000)
        total(1)
    }
        private fun total(first:Int,last:Int= 1000) {
            var sum = 0
            for (i in first..last) {
                sum += i
            }
            Log.d("kotlintest", sum .toString())
        }









}
