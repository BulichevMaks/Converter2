package com.myproject.converter2.domian.usecase

import android.widget.Button
import android.widget.TextView
import com.myproject.converter2.R

class EnterAmountUseCase {
    fun execute(button: Button, dataEditView: TextView): String {

        return when (button.tag) {
            1 -> delText(dataEditView.text.toString())
            else -> addText(button.text.toString(), dataEditView.text.toString())
        }
    }


    private fun addText(text: String, text2: String): String {
        return text2 + text
    }

    private fun delText(text: String): String {
        return text.substring(0, text.length - 1)
    }

}
