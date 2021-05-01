package com.example.t_mobile.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TmobileResponse(
    @Json(name = "page")
    val page: Page?
)