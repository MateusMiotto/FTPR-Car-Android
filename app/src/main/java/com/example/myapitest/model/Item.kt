package com.example.myapitest.model

data class ApiEnvelope<T>(
    val id: String?,
    val value: T
)

data class Item(
    val id: String,
    val image: String,
    val year: String,
    val name: String,
    val place: Place,
    val licence: String
)

data class Place(
    val lat: Double,
    val long: Double
)
