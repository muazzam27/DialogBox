package com.testapplication.library.popups

import android.app.Dialog
import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.widget.TextView
import com.testapplication.library.R
import com.testapplication.library.interfaces.IDialogClickListener

public class DialogBoxWithListener : Dialog, View.OnClickListener {

    lateinit var mTextViewYes: TextView
    lateinit var mTextViewMessage: TextView
    lateinit var textViewTitle: TextView
    lateinit var mDividerViewOne: View
    lateinit var mDividerViewTwo: View
    lateinit var mTextViewNO: TextView
    lateinit var mClickListener: IDialogClickListener
    lateinit var mTextViewTitle: TextView

    constructor(context: Context) : super(context, R.style.dialog_style_simple) {
        setContentView(R.layout.layout_popup_yes_no)
        mTextViewTitle = findViewById(R.id.textview_title)
        mTextViewMessage = findViewById(R.id.textview_error_message)

        mTextViewYes = findViewById(R.id.textview_popup_yes)
        mTextViewNO = findViewById(R.id.textview_popup_no)

        mDividerViewOne = findViewById(R.id.divider_color_one)
        mDividerViewTwo = findViewById(R.id.divider_color_two)

        mTextViewYes.setOnClickListener(this)
        mTextViewNO.setOnClickListener(this)
    }

    fun setClickListener(listener: IDialogClickListener):DialogBoxWithListener {
        this.mClickListener = listener
        return this
    }

//    fun setNoClickListener(listener: IDialogClickListener){
//        this.mNoClickListener = listener
//    }


    override fun onClick(p0: View?) {
        if (p0 == mTextViewYes) {
            mClickListener.onYesClick(this@DialogBoxWithListener)
        } else if (p0 == mTextViewNO) {
            mClickListener.onNoClick(this@DialogBoxWithListener)
        }
    }

    /*
    Labels String assigned here
     */
    fun setTitleLabel(title: String): DialogBoxWithListener {
        mTextViewTitle.setText(title)
        return this
    }

    fun setMessageLabel(title: String): DialogBoxWithListener {
        mTextViewMessage.setText(title)
        return this
    }

    fun setActionOneLabel(title: String): DialogBoxWithListener {
        mTextViewYes.setText(title)
        return this
    }

    fun setActionTwoLabel(title: String): DialogBoxWithListener {
        mTextViewNO.setText(title)
        return this
    }


    /*
    Labels colors assigned here
     */
    fun setTitleColor(color: Int): DialogBoxWithListener {
        mTextViewTitle.setTextColor(color)
        return this
    }

    fun setMessageColor(color: Int): DialogBoxWithListener {
        mTextViewMessage.setTextColor(color)
        return this
    }

    fun setActionButtonOneColor(color: Int): DialogBoxWithListener {
        mTextViewYes.setTextColor(color)
        return this
    }

    fun setActionButtonTwoColor(color: Int): DialogBoxWithListener {
        mTextViewNO.setTextColor(color)
        return this
    }


    /*
    Fonts applied here
     */

    fun setTitleTypeFace(typeface: Typeface): DialogBoxWithListener {
        mTextViewTitle.typeface = typeface
        return this
    }

    fun setMessageTypeFace(typeface: Typeface): DialogBoxWithListener {
        mTextViewMessage.typeface = typeface
        return this
    }

    fun setActionOneTypeFace(typeface: Typeface): DialogBoxWithListener {
        mTextViewYes.typeface = typeface
        return this
    }

    fun setActionTwoTypeFace(typeface: Typeface): DialogBoxWithListener {
        mTextViewNO.typeface = typeface
        return this
    }


    /*
    Divider View
     */

    fun setDividerOneColor(color: Int): DialogBoxWithListener {
        mDividerViewOne.setBackgroundColor(color)
        return this
    }

    fun setDividerTwoColor(color: Int): DialogBoxWithListener {
        mDividerViewTwo.setBackgroundColor(color)
        return this
    }


    /*

    Text Sizes
     */

    fun setTitleTextSize(unit: Int, size: Float): DialogBoxWithListener {
        mTextViewTitle.setTextSize(unit, size)
        return this
    }

    fun setMessageTextSize(unit: Int, size: Float): DialogBoxWithListener {
        mTextViewMessage.setTextSize(unit, size)
        return this
    }

    fun setActionOneTextSize(unit: Int, size: Float): DialogBoxWithListener {
        mTextViewYes.setTextSize(unit, size)
        return this
    }

    fun setActionTwoTextSize(unit: Int, size: Float): DialogBoxWithListener {
        mTextViewNO.setTextSize(unit, size)
        return this
    }


    fun showPopup(): Unit {
        this.show()
    }


}