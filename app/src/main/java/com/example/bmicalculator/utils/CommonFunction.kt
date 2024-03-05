package com.example.bmicalculator.utils

import android.content.Context
import android.widget.Toast

object CommonFunction {

    fun getToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}