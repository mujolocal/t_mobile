package com.example.gm_coding.repo

import com.example.gm_coding.repo.remote.RetrofitInstance

object TmobileRepo {

    val tmobileService = RetrofitInstance.TMOBILE_SERVICE

    suspend fun getTmobileResponse() = tmobileService.getTmobileResponse()
}