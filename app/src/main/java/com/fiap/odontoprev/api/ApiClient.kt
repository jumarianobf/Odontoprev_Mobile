package com.fiap.odontoprev.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {


    private val retrofit = Retrofit.Builder()
        .baseUrl("https://0wckkox0JgRpvNNU4RmVR1Th0Q8R8emK.auth0.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val authService: AuthService = retrofit.create(AuthService::class.java)
}
