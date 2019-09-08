package com.testapplication.library

import android.app.Dialog
import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.widget.TextView

public class DialogBox : Dialog, View.OnClickListener {

    lateinit var textViewOk: TextView
    lateinit var textViewMessage: TextView
    lateinit var textViewTitle: TextView
    lateinit var dividerView: View

    constructor(context: Context) : super(context, R.style.dialog_style_simple) {
        setContentView(R.layout.test)
        textViewTitle = findViewById(R.id.textview_title)
        textViewMessage = findViewById(R.id.textview_message)
        textViewOk = findViewById(R.id.textview_popup_ok)
        dividerView = findViewById(R.id.divider_color)
        textViewOk.setOnClickListener(this)
    }


    override fun onClick(p0: View?) {
        if (p0 == textViewOk) {
            this.cancel()
        }
    }

    /*
    Labels String assigned here
     */
    fun setTitleLabel(title: String): DialogBox {
        textViewTitle.setText(title)
        return this
    }

    fun setMessageLabel(title: String): DialogBox {
        textViewMessage.setText(title)
        return this
    }

    fun setActionLabel(title: String): DialogBox {
        textViewOk.setText(title)
        return this
    }


    /*
    Labels colors assigned here
     */
    fun setTitleColor(color: Int): DialogBox {
        textViewTitle.setTextColor(color)
        return this
    }

    fun setMessageColor(color: Int): DialogBox {
        textViewMessage.setTextColor(color)
        return this
    }

    fun setActionButtonColor(color: Int): DialogBox {
        textViewOk.setTextColor(color)
        return this
    }


    /*
    Fonts applied here
     */

    fun setTitleTypeFace(typeface: Typeface): DialogBox {
        textViewTitle.typeface = typeface
        return this
    }

    fun setMessageTypeFace(typeface: Typeface): DialogBox {
        textViewMessage.typeface = typeface
        return this
    }

    fun setActionTypeFace(typeface: Typeface): DialogBox {
        textViewOk.typeface = typeface
        return this
    }

    /*
    Divider View
     */

    fun setDividerColor(color: Int): DialogBox {
        dividerView.setBackgroundColor(color)
        return this
    }


    /*

    Text Sizes
     */

    fun setTitleTextSize(unit: Int,size:Float): DialogBox {
        textViewTitle.setTextSize(unit,size)
        return this
    }

    fun setMessageTextSize(unit: Int,size:Float): DialogBox {
        textViewMessage.setTextSize(unit,size)
        return this
    }

    fun setActionTextSize(unit: Int,size:Float): DialogBox {
        textViewOk.setTextSize(unit,size)
        return this
    }


    fun showPopup(): Unit {
        this.show()
    }


}