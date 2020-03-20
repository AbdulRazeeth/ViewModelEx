package com.example.viewmodel2

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Integer.parseInt
import kotlin.random.Random

 class SecondMain: ViewModel() {
      var randomnum= MutableLiveData<String>()//without  intialization app can't opening
    //var randomnum=""
    fun getRandom():MutableLiveData<String>{
        Log.i("SecondMain","getRandom")
    if (randomnum==null)
    {
            randomnum=MutableLiveData<String>()
            createRandom()
    }
        return randomnum
    }
    fun createRandom(){

        var ran = Random.nextInt(9)+1
        randomnum.setValue("Number"+ ran.toString())

    }



}