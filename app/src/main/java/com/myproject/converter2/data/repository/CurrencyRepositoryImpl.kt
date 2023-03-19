package com.myproject.converter2.data.repository

import android.util.Log
import android.view.View
import android.widget.TextView
import com.myproject.converter2.domian.models.Event
import com.myproject.converter2.domian.models.RateResponse
import com.myproject.converter2.domian.models.Rates
import com.myproject.converter2.domian.repository.ApiLayerApi
import com.myproject.converter2.domian.repository.CurrencyRepository
import kotlinx.coroutines.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CurrencyRepositoryImpl(private val rate: Rates) : CurrencyRepository {



    override fun getRateRudDin(): Double {
        return rate.RudDin
    }

    override fun getRateRudLir(): Double {
        return rate.RudLir
    }

    override fun getRateRudUsd(): Double {
        return rate.RudUsd
    }

    override fun getRateRudEur(): Double {

        return rate.RudEur
    }

    override fun getRateDinRub(): Double {
        return rate.DinRub
    }

    override fun getRateDinLir(): Double {
        return rate.DinLir
    }

    override fun getRateDinUsd(): Double {
        return rate.DinUsd
    }

    override fun getRateDinEur(): Double {
        return rate.DinEur
    }

    override fun getRateLirRub(): Double {
        return rate.LirRub
    }

    override fun getRateLirDin(): Double {
        return rate.LirDin
    }

    override fun getRateLirUsd(): Double {
        return rate.LirUsd
    }

    override fun getRateLirEur(): Double {
        return rate.LirEur
    }

    override fun getRateUsdRub(): Double {
        return rate.UsdRub
    }

    override fun getRateUsdDin(): Double {
        return rate.UsdDin
    }

    override fun getRateUsdLir(): Double {
        return rate.UsdLir
    }

    override fun getRateUsdEur(): Double {
        return rate.UsdEur
    }

    override fun getRateEurRub(): Double {
        return rate.EurRub
    }

    override fun getRateEurDin(): Double {
        return rate.EurDin
    }

    override fun getRateEurLir(): Double {
        return rate.EurLir
    }

    override fun getRateEurUsd(): Double {
        return rate.EurUsd
    }
}