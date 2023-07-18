package com.eduardo.appmobile.data.repository.dataSourceImpl

import com.eduardo.appmobile.data.repository.dataSource.AuthRemoteDataSource
import com.eduardo.appmobile.data.service.AuthService
import com.eduardo.appmobile.domain.model.User
import retrofit2.Response

class AuthRemoteDataSourceImpl(private val  authService: AuthService): AuthRemoteDataSource {

    override suspend fun login(email: String, password: String) = authService.login(email, password)
    //override suspend fun register(user: User): Response<AuthResponse> = authService.register(user)
}