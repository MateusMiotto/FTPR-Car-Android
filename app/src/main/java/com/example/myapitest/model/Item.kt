package com.example.myapitest.model
import com.google.gson.annotations.SerializedName

data class Item(
    val id: String,
    val imageUrl: String,
    val year: String,
    val name: String,
    val place: Place,
    val licence: String
)

data class Place(
    val lat: Double,
    @SerializedName("long") val lon: Double
)
