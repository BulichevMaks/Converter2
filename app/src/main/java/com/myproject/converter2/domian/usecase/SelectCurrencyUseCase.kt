package com.myproject.converter2.domian.usecase

import android.graphics.Color
import android.widget.Button
import android.widget.TextView
import com.myproject.converter2.R
import com.myproject.converter2.domian.repository.CurrencyRepository

class SelectCurrencyUseCase(private val currencyRepository: CurrencyRepository) {

    fun execute(
        mapOfCurrencyTextView: MutableMap<String, TextView>,
        button: Button,
        dataEditView: TextView
    ) {
        when (button.id) {
            R.id.buttonDin -> {
                mapOfCurrencyTextView["textViewDin"]?.setTextColor(Color.GREEN)
                mapOfCurrencyTextView["textViewRub"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewLir"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewUsd"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewEur"]?.setTextColor(Color.WHITE)

                val text = dataEditView.text.toString().toDouble()
                mapOfCurrencyTextView["textViewDin"]?.text = format(text.toInt().toString())
                mapOfCurrencyTextView["textViewRub"]?.text = format((text * currencyRepository.getRateDinRub()).toInt().toString())
                mapOfCurrencyTextView["textViewLir"]?.text = format((text * currencyRepository.getRateDinLir()).toInt().toString())
                mapOfCurrencyTextView["textViewUsd"]?.text = format((text * currencyRepository.getRateDinUsd()).toInt().toString())
                mapOfCurrencyTextView["textViewEur"]?.text = format((text * currencyRepository.getRateDinEur()).toInt().toString())
            }
            R.id.buttonRub -> {
                mapOfCurrencyTextView["textViewDin"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewRub"]?.setTextColor(Color.GREEN)
                mapOfCurrencyTextView["textViewLir"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewUsd"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewEur"]?.setTextColor(Color.WHITE)

                val text = dataEditView.text.toString().toDouble()
                mapOfCurrencyTextView["textViewDin"]?.text = format((text * currencyRepository.getRateRudDin()).toInt().toString())
                mapOfCurrencyTextView["textViewRub"]?.text = format(text.toInt().toString())
                mapOfCurrencyTextView["textViewLir"]?.text = format((text * currencyRepository.getRateRudLir()).toInt().toString())
                mapOfCurrencyTextView["textViewUsd"]?.text = format((text * currencyRepository.getRateRudUsd()).toInt().toString())
                mapOfCurrencyTextView["textViewEur"]?.text = format((text * currencyRepository.getRateRudEur()).toInt().toString())
            }
            R.id.buttonLir -> {
                mapOfCurrencyTextView["textViewDin"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewRub"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewLir"]?.setTextColor(Color.GREEN)
                mapOfCurrencyTextView["textViewUsd"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewEur"]?.setTextColor(Color.WHITE)

                val text = dataEditView.text.toString().toDouble()
                mapOfCurrencyTextView["textViewDin"]?.text = format((text * currencyRepository.getRateLirDin()).toInt().toString())
                mapOfCurrencyTextView["textViewRub"]?.text = format((text * currencyRepository.getRateLirRub()).toInt().toString())
                mapOfCurrencyTextView["textViewLir"]?.text = format(text.toInt().toString())
                mapOfCurrencyTextView["textViewUsd"]?.text = format((text * currencyRepository.getRateLirUsd()).toInt().toString())
                mapOfCurrencyTextView["textViewEur"]?.text = format((text * currencyRepository.getRateLirEur()).toInt().toString())
            }
            R.id.buttonUsd -> {
                mapOfCurrencyTextView["textViewDin"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewRub"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewLir"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewUsd"]?.setTextColor(Color.GREEN)
                mapOfCurrencyTextView["textViewEur"]?.setTextColor(Color.WHITE)

                val text = dataEditView.text.toString().toDouble()
                mapOfCurrencyTextView["textViewDin"]?.text = format((text * currencyRepository.getRateUsdDin()).toInt().toString())
                mapOfCurrencyTextView["textViewRub"]?.text = format((text * currencyRepository.getRateUsdRub()).toInt().toString())
                mapOfCurrencyTextView["textViewLir"]?.text = format((text * currencyRepository.getRateUsdLir()).toInt().toString())
                mapOfCurrencyTextView["textViewUsd"]?.text = format(text.toInt().toString())
                mapOfCurrencyTextView["textViewEur"]?.text = format((text * currencyRepository.getRateUsdEur()).toInt().toString())
            }
            R.id.buttonEur -> {
                mapOfCurrencyTextView["textViewDin"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewRub"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewLir"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewUsd"]?.setTextColor(Color.WHITE)
                mapOfCurrencyTextView["textViewEur"]?.setTextColor(Color.GREEN)

                val text = dataEditView.text.toString().toDouble()
                mapOfCurrencyTextView["textViewDin"]?.text = format((text * currencyRepository.getRateEurDin()).toInt().toString())
                mapOfCurrencyTextView["textViewRub"]?.text = format((text * currencyRepository.getRateEurRub()).toInt().toString())
                mapOfCurrencyTextView["textViewLir"]?.text = format((text * currencyRepository.getRateEurLir()).toInt().toString())
                mapOfCurrencyTextView["textViewUsd"]?.text = format((text * currencyRepository.getRateEurUsd()).toInt().toString())
                mapOfCurrencyTextView["textViewEur"]?.text = format(text.toInt().toString())

            }
        }
    }
    private fun format(str:String) :String {
        var resultStr = str
        return if(str.length in 4..5) {
            resultStr.addCharAtIndex(' ', str.length - 3)
        } else if(str.length == 6) {
            resultStr.addCharAtIndex(' ', str.length - 3)
        } else if(str.length >= 7) {
            resultStr = str.addCharAtIndex(' ', str.length - 3)
            resultStr.addCharAtIndex(' ', str.length - 6)
        } else {
            str
        }
    }
    private fun String.addCharAtIndex(char: Char, index: Int) =
        StringBuilder(this).apply { insert(index, char) }.toString()
}