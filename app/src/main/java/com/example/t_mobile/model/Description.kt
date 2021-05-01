package com.example.t_mobile.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Description(
    @Json(name = "attributes")
    val attributes: AttributesX?,
    @Json(name = "value")
    val value: String?
)