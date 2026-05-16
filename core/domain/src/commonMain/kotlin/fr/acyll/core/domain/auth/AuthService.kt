package fr.acyll.core.domain.auth

import fr.acyll.core.domain.EmptyResult
import fr.acyll.core.domain.Result
import fr.acyll.core.domain.util.DataError

interface AuthService {

    suspend fun login(
        email: String,
        password: String
    ): Result<AuthInfo, DataError.Remote>

    suspend fun register(
        email: String,
        username: String,
        password: String
    ): EmptyResult<DataError.Remote>

    suspend fun resendVerificationEmail(
        email: String
    ): EmptyResult<DataError.Remote>

    suspend fun verifyEmail(
        token: String
    ): EmptyResult<DataError.Remote>
}