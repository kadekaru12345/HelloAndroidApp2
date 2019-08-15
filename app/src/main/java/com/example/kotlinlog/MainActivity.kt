package com.example.kotlinlog

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human = Human("ショウ",30,"ダイビング")
        human.say()
        human.think()

        val humanA = Human("カケル",35,"スカイダイビング")
        humanA.say()
        humanA.think()











    }
}
