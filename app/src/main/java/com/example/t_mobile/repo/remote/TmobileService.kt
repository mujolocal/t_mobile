package com.example.gm_coding.repo.remote


import com.example.t_mobile.model.TmobileResponse
import retrofit2.Call
import retrofit2.http.GET



interface TmobileService {

    @GET("search")
    fun getTmobileResponse():Call<TmobileResponse>

}