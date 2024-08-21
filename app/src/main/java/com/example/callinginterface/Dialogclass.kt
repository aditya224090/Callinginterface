package com.example.callinginterface

import android.app.Dialog
import android.content.Context
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Dialogclass {
    lateinit var messageTextView: TextView
    lateinit var okbutton: Button
    lateinit var iref:onClickInterface
    lateinit var no:Button
    lateinit var dialog:Dialog
    fun showdialog(context:Context,msg:String,cancelable:Boolean){
         dialog = Dialog(context)

        dialog.setContentView(R.layout.mylayout)
        messageTextView = dialog.findViewById(R.id.msg)
        messageTextView.text =msg
        okbutton = dialog.findViewById(R.id.ok)
        no = dialog.findViewById(R.id.no)
        dialog.setCancelable(cancelable)
     okbutton.setOnClickListener {
         iref.onokclick()
   }

        no.setOnClickListener {
            iref.noclick()
 }

        dialog.show()
    }
    fun dismissDialogue(){
        dialog.dismiss()
    }
    fun initilizeInterface(iRefObj:onClickInterface){
        iref =iRefObj
    }



}