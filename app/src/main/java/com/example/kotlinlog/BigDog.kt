package com.example.kotlinlog

import android.util.Log

 open class BigDog : Dog {

    constructor(name: String,age: Int): super(name,age){
    }

    override fun say() {

        Log.d("kotlintest","大きな犬です。")
    }
}