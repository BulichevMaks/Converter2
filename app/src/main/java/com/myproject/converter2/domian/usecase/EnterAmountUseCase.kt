package com.myproject.converter2.domian.usecase

import android.widget.Button
import android.widget.TextView

class EnterAmountUseCase {
    fun execute(button: Button, dataEditView: TextView): String {
        return if (button.text.equals("DEL")) {
            delText(dataEditView.text.toString())
        } else {
            addText(button.text.toString(), dataEditView.text.toString())
        }
    }

    private fun addText(text: String, text2: String): String {
        return text2 + text
    }

    private fun delText(text: String): String {
        return text.substring(0, text.length - 1)
    }

}
