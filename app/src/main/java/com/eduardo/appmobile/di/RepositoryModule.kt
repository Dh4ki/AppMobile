package com.eduardo.appmobile.di

import com.eduardo.appmobile.data.repository.AuthRepositoryImpl
import com.eduardo.appmobile.data.repository.dataSource.AuthRemoteDataSource
import com.eduardo.appmobile.data.repository.dataSourceImpl.AuthRemoteDataSourceImpl
import com.eduardo.appmobile.data.service.AuthService
import com.eduardo.appmobile.domain.repository.AuthRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideAuthRepository(
        authRemoteDataSource: AuthRemoteDataSource,
        //authLocalDataSource: AuthLocalDataSource
    ): AuthRepository = AuthRepositoryImpl(authRemoteDataSource)
}