package com.eduardo.appmobile.di

import com.eduardo.appmobile.data.repository.dataSource.AuthRemoteDataSource
import com.eduardo.appmobile.data.repository.dataSourceImpl.AuthRemoteDataSourceImpl
import com.eduardo.appmobile.data.service.AuthService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    fun provideAuthRemoteDataSource(authService: AuthService): AuthRemoteDataSource = AuthRemoteDataSourceImpl(authService)

    //@Provides
    //fun provideUsersRemoteDataSource(usersService: UsersService): UsersRemoteDataSource = UsersRemoteDataSourceImpl(usersService)

    //@Provides
    //fun provideCategoriesRemoteDataSource(categoriesService: CategoriesService): CategoriesRemoteDataSource = CategoriesRemoteDataSourceImpl(categoriesService)

    //@Provides
    //fun provideProductsRemoteDataSource(productsService: ProductsService): ProductsRemoteDataSource = ProductsRemoteDataSourceImpl(productsService)

}