package com.myproject.converter2.domian.repository

interface CurrencyRepository {
    fun getRateRudDin():Double
    fun getRateRudLir():Double
    fun getRateRudUsd():Double
    fun getRateRudEur():Double

    fun getRateDinRub():Double
    fun getRateDinLir():Double
    fun getRateDinUsd():Double
    fun getRateDinEur():Double

    fun getRateLirRub():Double
    fun getRateLirDin():Double
    fun getRateLirUsd():Double
    fun getRateLirEur():Double

    fun getRateUsdRub():Double
    fun getRateUsdDin():Double
    fun getRateUsdLir():Double
    fun getRateUsdEur():Double

    fun getRateEurRub():Double
    fun getRateEurDin():Double
    fun getRateEurLir():Double
    fun getRateEurUsd():Double

}