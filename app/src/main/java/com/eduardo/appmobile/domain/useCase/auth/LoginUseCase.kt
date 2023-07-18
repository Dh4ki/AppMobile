package com.eduardo.appmobile.domain.useCase.auth

import com.eduardo.appmobile.domain.repository.AuthRepository

class LoginUseCase(private val  repository: AuthRepository) {

    suspend operator fun invoke(email: String, password: String) = repository.login(email, password )
}