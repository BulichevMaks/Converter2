package com.myproject.converter2.domian.models

data class RateResponse(
    val date: String,
    val info: Info,
    val query: Query,
    val result: Double,
    val success: Boolean
)