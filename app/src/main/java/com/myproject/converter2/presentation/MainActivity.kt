package com.myproject.converter2.presentation

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.myproject.converter2.R
import com.myproject.converter2.data.repository.CurrencyRepositoryImpl
import com.myproject.converter2.domian.models.Rates
import com.myproject.converter2.domian.usecase.EnterAmountUseCase
import com.myproject.converter2.domian.usecase.SelectCurrencyUseCase

class MainActivity : AppCompatActivity() {
    private val rate = Rates
    private val currencyRepository = CurrencyRepositoryImpl(rate)
    private val enterAmountUseCase = EnterAmountUseCase()
    private val selectCurrencyUseCase =
        SelectCurrencyUseCase(currencyRepository = currencyRepository)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityManager = getSystemService(ACTIVITY_SERVICE) as ActivityManager
        // размер по умолчанию
        val memory = activityManager.memoryClass

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
        val buttonDot = findViewById<Button>(R.id.buttonDot)
        val buttonBack = findViewById<Button>(R.id.buttonBack)
        val buttonDel = findViewById<Button>(R.id.buttonDel)
        buttonBack.tag = 1

        val dataEditView = findViewById<TextView>(R.id.editText)

        val mapOfCurrencyTextView = mutableMapOf<String, TextView>()
        mapOfCurrencyTextView["textViewRub"] = findViewById(R.id.textViewRub)
        mapOfCurrencyTextView["textViewDin"] = findViewById(R.id.textViewDin)
        mapOfCurrencyTextView["textViewLir"] = findViewById(R.id.textViewLir)
        mapOfCurrencyTextView["textViewUsd"] = findViewById(R.id.textViewUsd)
        mapOfCurrencyTextView["textViewEur"] = findViewById(R.id.textViewEur)

//

        buttonDin.setOnClickListener {
            vibrate()
            if (dataEditView.text.isEmpty()) {
                Toast.makeText(this, "Enter the amount", Toast.LENGTH_SHORT).show()
            } else {
                selectCurrencyUseCase.execute(
                    mapOfCurrencyTextView,
                    button = buttonDin,
                    dataEditView = dataEditView
                )

                buttonDin.setTextColor(Color.GREEN)
                buttonRub.setTextColor(Color.WHITE)
                buttonLir.setTextColor(Color.WHITE)
                buttonUsd.setTextColor(Color.WHITE)
                buttonEur.setTextColor(Color.WHITE)
            }
        }
        buttonRub.setOnClickListener {
            vibrate()
            if (dataEditView.text.isEmpty()) {
                Toast.makeText(this, "Enter the amount", Toast.LENGTH_SHORT).show()
            } else {
                selectCurrencyUseCase.execute(
                    mapOfCurrencyTextView,
                    button = buttonRub,
                    dataEditView = dataEditView
                )

                buttonDin.setTextColor(Color.WHITE)
                buttonRub.setTextColor(Color.GREEN)
                buttonLir.setTextColor(Color.WHITE)
                buttonUsd.setTextColor(Color.WHITE)
                buttonEur.setTextColor(Color.WHITE)
            }
        }
        buttonLir.setOnClickListener {
            vibrate()
            if (dataEditView.text.isEmpty()) {
                Toast.makeText(this, "Enter the amount", Toast.LENGTH_SHORT).show()
            } else {
                selectCurrencyUseCase.execute(
                    mapOfCurrencyTextView,
                    button = buttonLir,
                    dataEditView = dataEditView
                )

                buttonDin.setTextColor(Color.WHITE)
                buttonRub.setTextColor(Color.WHITE)
                buttonLir.setTextColor(Color.GREEN)
                buttonUsd.setTextColor(Color.WHITE)
                buttonEur.setTextColor(Color.WHITE)
            }
        }
        buttonUsd.setOnClickListener {
            vibrate()
            if (dataEditView.text.isEmpty()) {
                Toast.makeText(this, "Enter the amount", Toast.LENGTH_SHORT).show()
            } else {
                selectCurrencyUseCase.execute(
                    mapOfCurrencyTextView,
                    button = buttonUsd,
                    dataEditView = dataEditView
                )

                buttonDin.setTextColor(Color.WHITE)
                buttonRub.setTextColor(Color.WHITE)
                buttonLir.setTextColor(Color.WHITE)
                buttonUsd.setTextColor(Color.GREEN)
                buttonEur.setTextColor(Color.WHITE)
            }
        }
        buttonEur.setOnClickListener {
            vibrate()
            if (dataEditView.text.isEmpty()) {
                Toast.makeText(this, "Enter the amount", Toast.LENGTH_SHORT).show()
            } else {
                selectCurrencyUseCase.execute(
                    mapOfCurrencyTextView,
                    button = buttonEur,
                    dataEditView = dataEditView
                )

                buttonDin.setTextColor(Color.WHITE)
                buttonRub.setTextColor(Color.WHITE)
                buttonLir.setTextColor(Color.WHITE)
                buttonUsd.setTextColor(Color.WHITE)
                buttonEur.setTextColor(Color.GREEN)
            }
        }
        button1.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = button1, dataEditView = dataEditView)
        }
        button2.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = button2, dataEditView = dataEditView)
        }
        button3.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = button3, dataEditView = dataEditView)
        }
        button4.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = button4, dataEditView = dataEditView)
        }
        button5.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = button5, dataEditView = dataEditView)
        }
        button6.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = button6, dataEditView = dataEditView)
        }
        button7.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = button7, dataEditView = dataEditView)
        }
        button8.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = button8, dataEditView = dataEditView)
        }
        button9.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = button9, dataEditView = dataEditView)
        }
        button0.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = button0, dataEditView = dataEditView)
        }
        buttonDot.setOnClickListener {
            vibrate()
            dataEditView.text =
                enterAmountUseCase.execute(button = buttonDot, dataEditView = dataEditView)
            Toast.makeText(this, "Size of memory = $memory", Toast.LENGTH_SHORT).show()
        }
        buttonBack.setOnClickListener {
            vibrate()
            if (dataEditView.text.isEmpty()) {
                Toast.makeText(this, "Enter the amount", Toast.LENGTH_SHORT).show()
            } else {
                dataEditView.text =
                    enterAmountUseCase.execute(button = buttonBack, dataEditView = dataEditView)
            }
        }
        buttonDel.setOnClickListener {
            vibrate()
            if (dataEditView.text.isEmpty()) {
                Toast.makeText(this, "Enter the amount", Toast.LENGTH_SHORT).show()
            } else {
                dataEditView.text =
                    ""
            }
        }
    }

    private fun vibrate() {
        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            vibrator.vibrate(50)
        }
    }

}