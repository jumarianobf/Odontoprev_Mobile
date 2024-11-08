package com.fiap.odontoprev.api

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

data class Auth0LoginRequest(
    val grant_type: String = "password",
    val client_id: String,
    val client_secret: String,
    val username: String,
    val password: String,
    val audience: String? = null
)

data class Auth0LoginResponse(val access_token: String, val token_type: String)

interface AuthService {
    @Headers("Content-Type: application/json")
    @POST("/oauth/token")
    fun login(@Body request: Auth0LoginRequest): Call<Auth0LoginResponse>
}
