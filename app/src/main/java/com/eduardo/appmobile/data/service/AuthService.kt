package com.eduardo.appmobile.data.service

import com.eduardo.appmobile.domain.model.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthService {

    // http://192.168.18.6:3000/auth/login
    @FormUrlEncoded
    @POST("auth/login")
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String,
    ): Response<User>

    //@POST("auth/register")
    //suspend fun register(
    //    @Body() user: User,
    //): Response<User>
}