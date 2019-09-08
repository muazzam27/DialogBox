package com.testapplication.example

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Toast
import com.testapplication.library.interfaces.IDialogClickListener
import com.testapplication.library.popups.DialogBox
import com.testapplication.library.popups.DialogBoxWithListener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun showBox(view: View) {
        DialogBox(this@MainActivity)
            .setTitleLabel("Error")
            .setMessageLabel("This is layout_popup_ok error message")
            .setActionLabel("OK")
            .setTitleColor(resources.getColor(R.color.vpi__background_holo_dark))
            .setMessageColor(resources.getColor(R.color.vpi__background_holo_dark))
            .setDividerColor(resources.getColor(R.color.color_standard_blue))
            .setActionButtonColor(resources.getColor(R.color.vpi__background_holo_dark))
            .setTitleTextSize(TypedValue.COMPLEX_UNIT_SP,18f)
            .setMessageTextSize(TypedValue.COMPLEX_UNIT_SP,14f)
            .setActionTextSize(TypedValue.COMPLEX_UNIT_SP,16f)
            .setTitleTypeFace(Typeface.createFromAsset(applicationContext.assets, "font/museosans_300.ttf"))
            .setMessageTypeFace(Typeface.createFromAsset(applicationContext.assets, "font/museosans_300.ttf"))
            .setActionTypeFace(Typeface.createFromAsset(applicationContext.assets, "font/museosans_300.ttf"))
            .showPopup()
    }

    fun showBoxYesNO(view: View){

        DialogBoxWithListener(this@MainActivity)
            .setTitleLabel("Error")
            .setMessageLabel("This is error message")
            .setActionOneLabel("Yes")
            .setActionTwoLabel("No")
            .setTitleColor(resources.getColor(R.color.vpi__background_holo_dark))
            .setMessageColor(resources.getColor(R.color.vpi__background_holo_dark))
            .setDividerOneColor(resources.getColor(R.color.color_grey))
            .setDividerTwoColor(resources.getColor(R.color.color_grey))
            .setActionButtonOneColor(resources.getColor(R.color.color_standard_blue))
            .setActionButtonTwoColor(resources.getColor(R.color.color_standard_blue))
            .setTitleTextSize(TypedValue.COMPLEX_UNIT_SP,18f)
            .setMessageTextSize(TypedValue.COMPLEX_UNIT_SP,16f)
            .setActionOneTextSize(TypedValue.COMPLEX_UNIT_SP,18f)
            .setActionTwoTextSize(TypedValue.COMPLEX_UNIT_SP,18f)
            .setTitleTypeFace(Typeface.createFromAsset(applicationContext.assets, "font/museosans_300.ttf"))
            .setMessageTypeFace(Typeface.createFromAsset(applicationContext.assets, "font/museosans_300.ttf"))
            .setActionOneTypeFace(Typeface.createFromAsset(applicationContext.assets, "font/museosans_300.ttf"))
            .setActionTwoTypeFace(Typeface.createFromAsset(applicationContext.assets, "font/museosans_300.ttf"))
            .setClickListener(object : IDialogClickListener {
                override fun onYesClick(dialogBoxWithListener: DialogBoxWithListener) {
                   Toast.makeText(this@MainActivity,"Yes tapped",Toast.LENGTH_SHORT).show()
                    dialogBoxWithListener.dismiss()
                }

                override fun onNoClick(dialogBoxWithListener: DialogBoxWithListener) {
                    Toast.makeText(this@MainActivity,"No tapped",Toast.LENGTH_SHORT).show()
                    dialogBoxWithListener.dismiss()
                }
            }).showPopup()

    }
}
