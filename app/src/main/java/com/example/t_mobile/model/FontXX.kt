package com.example.t_mobile.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FontXX(
    @Json(name = "size")
    val size: Int?
)