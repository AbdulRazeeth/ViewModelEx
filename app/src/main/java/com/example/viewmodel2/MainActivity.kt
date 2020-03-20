package com.example.viewmodel2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val editorActivityViewModel:SecondMain = ViewModelProviders.of(this).get(SecondMain::class.java)
      //  val editorActivityViewModel=SecondMain()
       var ran:LiveData<String> =editorActivityViewModel.getRandom()
      //  findViewById<TextView>(R.id.textview1).setText(ran)
       findViewById<TextView>(R.id.textview1).setText(ran.toString())
        ran.observe(this, Observer {s :String->
            findViewById<TextView>(R.id.textview1).setText(s)

        })

        findViewById<Button>(R.id.button1).setOnClickListener{
            editorActivityViewModel.createRandom()
        }
    }
}
