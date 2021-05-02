package com.example.gm_coding.repo

import com.example.gm_coding.repo.remote.RetrofitInstance

object TrackRepo {

    val tmobileService = RetrofitInstance.TMOBILE_SERVICE

    suspend fun getTrackResponse(term: String) = tmobileService.getTmobileResponse()
}