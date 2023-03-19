package com.myproject.converter2.domian.models

import android.util.Log
import com.myproject.converter2.domian.repository.ApiLayerApi
import kotlinx.coroutines.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

object Rates {
    val RudDin by lazy {runBlocking { search("RSD", "RUB") }}
    val RudLir by lazy {runBlocking { search("TRY", "RUB") }}
    val RudUsd by lazy {runBlocking { search("USD", "RUB") }}
    val RudEur by lazy {runBlocking { search("EUR", "RUB") }}
    val DinRub by lazy {runBlocking { search("RUB", "RSD") }}
    val DinLir by lazy {runBlocking { search("TRY", "RSD") }}
    val DinUsd by lazy {runBlocking { search("USD", "RSD") }}
    val DinEur by lazy {runBlocking { search("EUR", "RSD") }}
    val LirRub by lazy {runBlocking { search("RUB", "TRY") }}
    val LirDin by lazy {runBlocking { search("RSD", "TRY") }}
    val LirUsd by lazy {runBlocking { search("USD", "TRY") }}
    val LirEur by lazy {runBlocking { search("RUB", "TRY") }}
    val UsdRub by lazy {runBlocking { search("RUB", "USD") }}
    val UsdDin by lazy {runBlocking { search("RSD", "USD") }}
    val UsdLir by lazy {runBlocking { search("TRY", "USD") }}
    val UsdEur by lazy {runBlocking { search("EUR", "USD") }}
    val EurRub by lazy {runBlocking { search("RUB", "EUR") }}
    val EurDin by lazy {runBlocking { search("RSD", "EUR") }}
    val EurLir by lazy {runBlocking { search("TRY", "EUR") }}
    val EurUsd by lazy {runBlocking { search("USD", "EUR") }}


    private const val apiLayerBaseUrl = "https://api.apilayer.com/"
    private var token = "hoCJhjkHJkhJKJhjKopkKtLXMSQ0P"

    private val retrofit: Retrofit by lazy {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
        Retrofit.Builder().client(client)
            .baseUrl(apiLayerBaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private val apiLayerService: ApiLayerApi by lazy {
        retrofit.create(ApiLayerApi::class.java)
    }

    private suspend fun search(to: String, from: String): Double {
        val response = apiLayerService.getRate(token, to, from, 1).awaitResponse()
        if (response.isSuccessful) {
            val result = response.body()?.result ?: 0.0
            if (result != 0.0) {
                showMessage("Yraaaaa", Event.SUCCESS)
                return result
            } else {
                showMessage("nothing found", Event.NOTHING_FOUND)
            }
        } else {
            showMessage(response.message(), Event.ERROR)
        }
        throw RuntimeException("Failed to get rate")
    }

    init {
        GlobalScope.launch {
            RudDin
            RudLir
            RudUsd
            RudEur
            DinRub
            DinLir
            DinUsd
            DinEur
            LirRub
            LirDin
            LirUsd
            LirEur
            UsdRub
            UsdDin
            UsdLir
            UsdEur
            EurRub
            EurDin
            EurLir
            EurUsd
        }
    }

    private fun showMessage(text: String, event: Event) {
        when (event) {
            Event.SUCCESS -> {
                Log.d("MY_LOG", text)
            }
            Event.NOTHING_FOUND -> {
                Log.d("MY_LOG", text)
            }
            Event.ERROR -> {
                Log.d("MY_LOG", text)
            }
            Event.SERVER_ERROR -> {
                Log.d("MY_LOG", text)
            }
            else -> {
                Log.d("MY_LOG", text)
            }
        }
    }
}