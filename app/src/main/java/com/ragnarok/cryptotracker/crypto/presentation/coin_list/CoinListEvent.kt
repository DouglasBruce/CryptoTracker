package com.ragnarok.cryptotracker.crypto.presentation.coin_list

import com.ragnarok.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}