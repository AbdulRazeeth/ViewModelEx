package com.example.viewmodelex1

import androidx.lifecycle.ViewModel
import java.lang.Integer.parseInt
import kotlin.random.Random

open class SecondMain: ViewModel() {
    var randomnum="";
    fun getRandom():String{
        var ran = Random.nextInt(9)+1
        randomnum="Number"+ ran.toString()
        return randomnum
    }
}