package com.example.callinginterface

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), onClickInterface {
    lateinit var button: Button
    lateinit var dia: Dialogclass
    lateinit var secondbtn:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dia = Dialogclass()
        button = findViewById(R.id.button)
        secondbtn = findViewById(R.id.btnSecond)
        dia.initilizeInterface(this)
        button.setOnClickListener {
            dia.showdialog(this@MainActivity,"Call from Activity",false)
        }
        secondbtn.setOnClickListener {
            var intent= Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onokclick() {

        Toast.makeText(this@MainActivity,"call through interface",Toast.LENGTH_LONG).show()
        dia. dismissDialogue()

    }

    override fun noclick() {
        Toast.makeText(this@MainActivity,"No click",Toast.LENGTH_LONG).show()
        dia. dismissDialogue()
    }


}