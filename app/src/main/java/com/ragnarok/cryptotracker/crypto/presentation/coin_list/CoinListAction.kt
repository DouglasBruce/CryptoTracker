package com.ragnarok.cryptotracker.crypto.presentation.coin_list

import com.ragnarok.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi) : CoinListAction
}