package com.myproject.converter2.data.repository

import com.myproject.converter2.domian.repository.CurrencyRepository

class CurrencyRepositoryImpl : CurrencyRepository {
    override fun getRateRudDin(): Double {
        return 1.52
    }

    override fun getRateRudLir(): Double {
        return 0.26851
    }

    override fun getRateRudUsd(): Double {
        return 0.014277
    }

    override fun getRateRudEur(): Double {
        return 0.012994
    }

    override fun getRateDinRub(): Double {
        return 0.65729
    }

    override fun getRateDinLir(): Double {
        return 0.17627
    }

    override fun getRateDinUsd(): Double {
        return 0.009374
    }

    override fun getRateDinEur(): Double {
        return 0.008623
    }

    override fun getRateLirRub(): Double {
        return 3.72
    }

    override fun getRateLirDin(): Double {
        return 5.67
    }

    override fun getRateLirUsd(): Double {
        return 0.053145
    }

    override fun getRateLirEur(): Double {
        return 0.048364
    }

    override fun getRateUsdRub(): Double {
        return 70.04
    }

    override fun getRateUsdDin(): Double {
        return 106.68
    }

    override fun getRateUsdLir(): Double {
        return 18.82
    }

    override fun getRateUsdEur(): Double {
        return 0.91609
    }

    override fun getRateEurRub(): Double {
        return 76.96
    }

    override fun getRateEurDin(): Double {
        return 115.97
    }

    override fun getRateEurLir(): Double {
        return 20.68
    }

    override fun getRateEurUsd(): Double {
        return 1.09
    }
}