package fr.acyll.core.data.auth

import fr.acyll.core.data.dto.request.RegisterRequest
import fr.acyll.core.data.networking.post
import fr.acyll.core.domain.EmptyResult
import fr.acyll.core.domain.auth.AuthService
import fr.acyll.core.domain.util.DataError
import io.ktor.client.HttpClient

class KtorAuthService(
    private val httpClient: HttpClient
): AuthService {

    override suspend fun register(
        email: String,
        username: String,
        password: String
    ): EmptyResult<DataError.Remote> {
        return httpClient.post(
            route = "/auth/register",
            body = RegisterRequest(
                email = email,
                username = username,
                password = password
            )
        )
    }
}