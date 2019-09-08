package com.testapplication.library.popups

import android.app.Dialog
import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.widget.TextView
import com.testapplication.library.R

public class DialogBox : Dialog, View.OnClickListener {

    lateinit var mTextViewOk: TextView
    lateinit var mTextViewMessage: TextView
    lateinit var mTextViewTitle: TextView
    lateinit var mDividerView: View

    constructor(context: Context) : super(context, R.style.dialog_style_simple) {
        setContentView(R.layout.layout_popup_ok)
        mTextViewTitle = findViewById(R.id.textview_title)
        mTextViewMessage = findViewById(R.id.textview_message)
        mTextViewOk = findViewById(R.id.textview_popup_ok)
        mDividerView = findViewById(R.id.divider_color)
        mTextViewOk.setOnClickListener(this)
    }


    override fun onClick(p0: View?) {
        if (p0 == mTextViewOk) {
            this.cancel()
        }
    }

    /*
    Labels String assigned here
     */
    fun setTitleLabel(title: String): DialogBox {
        mTextViewTitle.setText(title)
        return this
    }

    fun setMessageLabel(title: String): DialogBox {
        mTextViewMessage.setText(title)
        return this
    }

    fun setActionLabel(title: String): DialogBox {
        mTextViewOk.setText(title)
        return this
    }


    /*
    Labels colors assigned here
     */
    fun setTitleColor(color: Int): DialogBox {
        mTextViewTitle.setTextColor(color)
        return this
    }

    fun setMessageColor(color: Int): DialogBox {
        mTextViewMessage.setTextColor(color)
        return this
    }

    fun setActionButtonColor(color: Int): DialogBox {
        mTextViewOk.setTextColor(color)
        return this
    }


    /*
    Fonts applied here
     */

    fun setTitleTypeFace(typeface: Typeface): DialogBox {
        mTextViewTitle.typeface = typeface
        return this
    }

    fun setMessageTypeFace(typeface: Typeface): DialogBox {
        mTextViewMessage.typeface = typeface
        return this
    }

    fun setActionTypeFace(typeface: Typeface): DialogBox {
        mTextViewOk.typeface = typeface
        return this
    }

    /*
    Divider View
     */

    fun setDividerColor(color: Int): DialogBox {
        mDividerView.setBackgroundColor(color)
        return this
    }


    /*

    Text Sizes
     */

    fun setTitleTextSize(unit: Int,size:Float): DialogBox {
        mTextViewTitle.setTextSize(unit,size)
        return this
    }

    fun setMessageTextSize(unit: Int,size:Float): DialogBox {
        mTextViewMessage.setTextSize(unit,size)
        return this
    }

    fun setActionTextSize(unit: Int,size:Float): DialogBox {
        mTextViewOk.setTextSize(unit,size)
        return this
    }


    fun showPopup(): Unit {
        this.show()
    }


}