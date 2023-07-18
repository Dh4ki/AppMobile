package com.eduardo.appmobile.data.repository

import com.eduardo.appmobile.data.repository.dataSource.AuthRemoteDataSource
import com.eduardo.appmobile.domain.model.User
import com.eduardo.appmobile.domain.repository.AuthRepository
import com.eduardo.appmobile.domain.util.Response
import java.lang.Exception

class AuthRepositoryImpl(
    private val authRemoteDataSource: AuthRemoteDataSource,
   // private val authLocalDataSource: AuthLocalDataSource
): AuthRepository {

    //override suspend fun register(user: User): Resource<AuthResponse> = ResponseToRequest.send(
    //    authRemoteDataSource.register(user)
    //)

    //override suspend fun saveSession(authResponse: AuthResponse) = authLocalDataSource.saveSession(authResponse)
    //override suspend fun updateSession(user: User) = authLocalDataSource.updateSession(user)

    //override suspend fun logout() = authLocalDataSource.logout()

    //override fun getSessionData(): Flow<AuthResponse> = authLocalDataSource.getSessionData()
    override suspend fun login(email: String, password: String): Response<User> {
        return try {
            val result = authRemoteDataSource.login(email, password)
            Response.Success(result.body()!!)
        } catch (e: Exception){
            e.printStackTrace()
            Response.Failure(e)
        }
    }

}