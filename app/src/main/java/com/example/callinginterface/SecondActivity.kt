package com.example.callinginterface

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity(),onClickInterface {
    lateinit var SecondA:Button
    lateinit var dia: Dialogclass
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        SecondA=findViewById(R.id.seconddiaog)
        dia = Dialogclass()
        dia.initilizeInterface(this)
        SecondA.setOnClickListener {
            dia.showdialog(this@SecondActivity,"Call from Activity",false)
        }
    }


    override fun onokclick() {
        Toast.makeText(this@SecondActivity,"call through interface", Toast.LENGTH_LONG).show()
       dia. dismissDialogue()
    }

    override fun noclick() {
        dia. dismissDialogue()
        Toast.makeText(this@SecondActivity,"No click", Toast.LENGTH_LONG).show()
    }


}