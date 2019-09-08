package com.testapplication.library.interfaces

import com.testapplication.library.popups.DialogBoxWithListener

public interface IDialogClickListener {
    public fun onYesClick(dialogBoxWithListener: DialogBoxWithListener)
    public fun onNoClick(dialogBoxWithListener: DialogBoxWithListener)
}