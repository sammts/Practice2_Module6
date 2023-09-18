package com.amaurypm.videogamesrf.application

import android.app.Application
import com.amaurypm.videogamesrf.data.GameRepository
import com.amaurypm.videogamesrf.data.remote.RetrofitHelper

class VideoGamesRFApp: Application() {

    private val retrofit by lazy{
        RetrofitHelper().getRetrofit()
    }

    val repository by lazy{
        GameRepository(retrofit)
    }

}