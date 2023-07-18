package com.eduardo.appmobile.domain.repository

import com.eduardo.appmobile.domain.model.User
import com.eduardo.appmobile.domain.util.Response

interface AuthRepository {
    suspend fun login(email: String, password: String): Response<User>
    //suspend fun login(email: String, password: String): Resource<AuthResponse>
    //suspend fun register(user: User): Resource<AuthResponse>
    //suspend fun logout()
    //suspend fun saveSession(authResponse: AuthResponse)
    //suspend fun updateSession(user: User)
    //fun getSessionData(): Flow<AuthResponse>
}