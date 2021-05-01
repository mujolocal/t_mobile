package com.example.t_mobile.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AttributesX(
    @Json(name = "font")
    val font: FontX?,
    @Json(name = "text_color")
    val textColor: String?
)