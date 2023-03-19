package com.myproject.converter2.domian.repository

import com.myproject.converter2.domian.models.*
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.Query

interface ApiLayerApi {

    @GET("/exchangerates_data/convert")
    fun getRate(
        @Header("apikey") token: String,
        @Query("to") to: String,
        @Query("from") from: String,
        @Query("amount") amount: Int,
    ): Call<RateResponse>

}