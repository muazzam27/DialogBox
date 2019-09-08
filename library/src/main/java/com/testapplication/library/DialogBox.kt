package com.testapplication.library

import android.app.Dialog
import android.content.Context
import android.view.View
import android.widget.TextView

public class DialogBox : Dialog, View.OnClickListener {

    lateinit var textViewOk: TextView
    lateinit var textViewMessage: TextView

    constructor(context: Context, message: String) : super(context, R.style.dialog_style_simple) {
        setContentView(R.layout.test)
        textViewMessage = findViewById(R.id.textview_error_message)
        textViewMessage.setText(message)
        textViewOk = findViewById(R.id.textview_popup_ok)
        textViewOk.setOnClickListener(this)
    }


    override fun onClick(p0: View?) {
        if (p0 == textViewOk) {
            this.cancel()
        }
    }

    fun setActionLabel(title: String) {
        textViewOk.setText(title)
    }

    fun setActionButtonColor(color: Int) {
        textViewOk.setTextColor(color)
    }

    fun setMessageColor(color: Int) {
        textViewMessage.setTextColor(color)
    }


    fun showPopup(): Unit {
        this.show()
    }


}