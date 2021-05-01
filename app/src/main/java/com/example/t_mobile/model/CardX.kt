package com.example.t_mobile.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CardX(
    @Json(name = "attributes")
    val attributes: Attributes?,
    @Json(name = "description")
    val description: Description?,
    @Json(name = "image")
    val image: Image?,
    @Json(name = "title")
    val title: Title?,
    @Json(name = "value")
    val value: String?
)