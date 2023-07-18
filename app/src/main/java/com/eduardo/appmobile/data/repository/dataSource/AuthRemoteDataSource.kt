package com.eduardo.appmobile.data.repository.dataSource

import com.eduardo.appmobile.domain.model.User
import retrofit2.Response

interface AuthRemoteDataSource {
    suspend fun login(email: String, password: String): Response<User>
    //suspend fun register(user: User): Response<AuthResponse>
}