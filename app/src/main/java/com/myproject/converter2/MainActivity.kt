package com.myproject.converter2

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

        val dataEditView = findViewById<EditText>(R.id.editText)

        val textViewRub = findViewById<TextView>(R.id.textViewRub)
        val textViewDin = findViewById<TextView>(R.id.textViewDin)
        val textViewLir = findViewById<TextView>(R.id.textViewLir)
        val textViewUsd = findViewById<TextView>(R.id.textViewUsd)
//        val textViewEur = findViewById<TextView>(R.id.textViewEur)
//

        buttonDin.setOnClickListener {
            val text = dataEditView.text.toString().toDouble()
            textViewDin.text = text.toInt().toString()
            textViewRub.text = (text * 0.64144).toInt().toString()
            textViewLir.text = (text * 0.17447).toInt().toString()
            textViewUsd.text = (text * 0.009279).toInt().toString()
//                textViewEur.text = (text * 0.013341).toInt().toString()
        }

        buttonRub.setOnClickListener {
            val text = dataEditView.text.toString().toDouble()
            textViewDin.text = (text * 1.55).toInt().toString()
            textViewRub.text = text.toInt().toString()
            textViewLir.text = (text * 0.27117).toInt().toString()
            textViewUsd.text = (text * 0.014502).toInt().toString()
//                textViewEur.text = (text * 0.013341).toInt().toString()
        }
        buttonLir.setOnClickListener {
            val text = dataEditView.text.toString().toDouble()
            textViewRub.text = (text * 3.69).toInt().toString()
            textViewDin.text = (text * 5.73).toInt().toString()
            textViewLir.text = text.toInt().toString()
            textViewUsd.text = (text * 0.014502).toInt().toString()
//                textViewEur.text = (text * 0.013341).toInt().toString()
        }
        buttonUsd.setOnClickListener {
            val text = dataEditView.text.toString().toDouble()
            textViewRub.text = (text * 69.34).toInt().toString()
            textViewDin.text = (text * 107.77).toInt().toString()
            textViewLir.text = (text * 18.81).toInt().toString()
            textViewUsd.text = text.toInt().toString()
//                textViewEur.text = (text * 0.013341).toInt().toString()
        }
    }
}