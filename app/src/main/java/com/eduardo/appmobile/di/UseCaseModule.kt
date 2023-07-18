package com.eduardo.appmobile.di

import com.eduardo.appmobile.data.repository.dataSource.AuthRemoteDataSource
import com.eduardo.appmobile.data.repository.dataSourceImpl.AuthRemoteDataSourceImpl
import com.eduardo.appmobile.data.service.AuthService
import com.eduardo.appmobile.domain.repository.AuthRepository
import com.eduardo.appmobile.domain.useCase.auth.AuthUseCase
import com.eduardo.appmobile.domain.useCase.auth.LoginUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideAuthUseCase(authRepository: AuthRepository) = AuthUseCase(
        login = LoginUseCase(authRepository),
        //register = RegisterUseCase(authRepository),
        //saveSession = SaveSessionUseCase(authRepository),
        //getSessionData = GetSessionDataUseCase(authRepository),
        //logout = LogoutUseCase(authRepository),
        //updateSession = UpdateSessionUseCase(authRepository),
    )
}