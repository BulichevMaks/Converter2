package com.myproject.converter2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDin = findViewById<Button>(R.id.buttonDin)
        val buttonRub = findViewById<Button>(R.id.buttonRub)
        val buttonLir = findViewById<Button>(R.id.buttonLir)
        val buttonUsd = findViewById<Button>(R.id.buttonUsd)
        val buttonEur = findViewById<Button>(R.id.buttonEur)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button0 = findViewById<Button>(R.id.button0)
        val buttonDel = findViewById<Button>(R.id.buttonDEL)

        val dataEditView = findViewById<TextView>(R.id.editText)

        val textViewRub = findViewById<TextView>(R.id.textViewRub)
        val textViewDin = findViewById<TextView>(R.id.textViewDin)
        val textViewLir = findViewById<TextView>(R.id.textViewLir)
        val textViewUsd = findViewById<TextView>(R.id.textViewUsd)
        val textViewEur = findViewById<TextView>(R.id.textViewEur)
//

        buttonDin.setOnClickListener {
            textViewDin.setTextColor(Color.GREEN)
            textViewRub.setTextColor(Color.WHITE)
            textViewLir.setTextColor(Color.WHITE)
            textViewUsd.setTextColor(Color.WHITE)
            textViewEur.setTextColor(Color.WHITE)

            buttonDin.setTextColor(Color.GREEN)
            buttonRub.setTextColor(Color.WHITE)
            buttonLir.setTextColor(Color.WHITE)
            buttonUsd.setTextColor(Color.WHITE)
            buttonEur.setTextColor(Color.WHITE)

            val text = dataEditView.text.toString().toDouble()
            textViewDin.text = text.toInt().toString()
            textViewRub.text = (text * 0.64144).toInt().toString()
            textViewLir.text = (text * 0.17447).toInt().toString()
            textViewUsd.text = (text * 0.009273).toInt().toString()
            textViewEur.text = (text * 0.008514).toInt().toString()
        }

        buttonRub.setOnClickListener {
            textViewDin.setTextColor(Color.WHITE)
            textViewRub.setTextColor(Color.GREEN)
            textViewLir.setTextColor(Color.WHITE)
            textViewUsd.setTextColor(Color.WHITE)
            textViewEur.setTextColor(Color.WHITE)

            buttonDin.setTextColor(Color.WHITE)
            buttonRub.setTextColor(Color.GREEN)
            buttonLir.setTextColor(Color.WHITE)
            buttonUsd.setTextColor(Color.WHITE)
            buttonEur.setTextColor(Color.WHITE)

            val text = dataEditView.text.toString().toDouble()
            textViewDin.text = (text * 1.55).toInt().toString()
            textViewRub.text = text.toInt().toString()
            textViewLir.text = (text * 0.27117).toInt().toString()
            textViewUsd.text = (text * 0.014502).toInt().toString()
            textViewEur.text = (text * 0.013262).toInt().toString()
        }
        buttonLir.setOnClickListener {
            textViewDin.setTextColor(Color.WHITE)
            textViewRub.setTextColor(Color.WHITE)
            textViewLir.setTextColor(Color.GREEN)
            textViewUsd.setTextColor(Color.WHITE)
            textViewEur.setTextColor(Color.WHITE)

            buttonDin.setTextColor(Color.WHITE)
            buttonRub.setTextColor(Color.WHITE)
            buttonLir.setTextColor(Color.GREEN)
            buttonUsd.setTextColor(Color.WHITE)
            buttonEur.setTextColor(Color.WHITE)

            val text = dataEditView.text.toString().toDouble()
            textViewRub.text = (text * 3.69).toInt().toString()
            textViewDin.text = (text * 5.73).toInt().toString()
            textViewLir.text = text.toInt().toString()
            textViewUsd.text = (text * 0.053159).toInt().toString()
            textViewEur.text = (text * 0.048932).toInt().toString()
        }
        buttonUsd.setOnClickListener {
            textViewDin.setTextColor(Color.WHITE)
            textViewRub.setTextColor(Color.WHITE)
            textViewLir.setTextColor(Color.WHITE)
            textViewUsd.setTextColor(Color.GREEN)
            textViewEur.setTextColor(Color.WHITE)

            buttonDin.setTextColor(Color.WHITE)
            buttonRub.setTextColor(Color.WHITE)
            buttonLir.setTextColor(Color.WHITE)
            buttonUsd.setTextColor(Color.GREEN)
            buttonEur.setTextColor(Color.WHITE)

            val text = dataEditView.text.toString().toDouble()
            textViewRub.text = (text * 69.34).toInt().toString()
            textViewDin.text = (text * 107.77).toInt().toString()
            textViewLir.text = (text * 18.81).toInt().toString()
            textViewUsd.text = text.toInt().toString()
            textViewEur.text = (text * 0.92013).toInt().toString()
        }
        buttonEur.setOnClickListener {
            textViewDin.setTextColor(Color.WHITE)
            textViewRub.setTextColor(Color.WHITE)
            textViewLir.setTextColor(Color.WHITE)
            textViewUsd.setTextColor(Color.WHITE)
            textViewEur.setTextColor(Color.GREEN)

            buttonDin.setTextColor(Color.WHITE)
            buttonRub.setTextColor(Color.WHITE)
            buttonLir.setTextColor(Color.WHITE)
            buttonUsd.setTextColor(Color.WHITE)
            buttonEur.setTextColor(Color.GREEN)

            val text = dataEditView.text.toString().toDouble()
            textViewRub.text = (text * 69.34).toInt().toString()
            textViewDin.text = (text * 107.77).toInt().toString()
            textViewLir.text = (text * 18.81).toInt().toString()
            textViewUsd.text = (text * 1.09).toInt().toString()
            textViewEur.text = text.toInt().toString()
        }

        button1.setOnClickListener {
            dataEditView.text = addText(button1.text.toString(), dataEditView.text.toString())
        }
        button2.setOnClickListener {
            dataEditView.text = addText(button2.text.toString(), dataEditView.text.toString())
        }
        button3.setOnClickListener {
            dataEditView.text = addText(button3.text.toString(), dataEditView.text.toString())
        }
        button4.setOnClickListener {
            dataEditView.text = addText(button4.text.toString(), dataEditView.text.toString())
        }
        button5.setOnClickListener {
            dataEditView.text = addText(button5.text.toString(), dataEditView.text.toString())
        }
        button6.setOnClickListener {
            dataEditView.text = addText(button6.text.toString(), dataEditView.text.toString())
        }
        button7.setOnClickListener {
            dataEditView.text = addText(button7.text.toString(), dataEditView.text.toString())
        }
        button8.setOnClickListener {
            dataEditView.text = addText(button8.text.toString(), dataEditView.text.toString())
        }
        button9.setOnClickListener {
            dataEditView.text = addText(button9.text.toString(), dataEditView.text.toString())
        }
        button0.setOnClickListener {
            dataEditView.text = addText(button0.text.toString(), dataEditView.text.toString())
        }
        buttonDel.setOnClickListener {
            dataEditView.text = delText(dataEditView.text.toString())
        }

    }

    private fun addText(text: String, text2: String): String {
        return text2 + text
    }

    private fun delText(text: String): String {
        return text.substring(0, text.length - 1)
    }

}