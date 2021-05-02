package com.example.t_mobile.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gm_coding.repo.TmobileRepo
import com.example.gm_coding.util.ApiState
import com.example.t_mobile.model.Card
import com.example.t_mobile.model.TmobileResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception


class HomeViewModel: ViewModel() {


    private  val TAG = "HomeViewModel"

    fun getResponse() {
        Log.d(TAG, "tmobileresponse: get got")
        try {


            viewModelScope.launch(Dispatchers.IO) {
                val tmobileResponse: TmobileResponse = TmobileRepo.getTmobileResponse()
                Log.d(TAG, "getTmobileResponse: ${tmobileResponse}")


            }
        }catch (e: Exception){
            Log.d(TAG, "getResponse: $e")
        }
        }
    

}