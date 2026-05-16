package fr.acyll.core.data.mappers

import fr.acyll.core.data.dto.AuthInfoSerializable
import fr.acyll.core.data.dto.UserSerializable
import fr.acyll.core.domain.auth.AuthInfo
import fr.acyll.core.domain.auth.User

fun AuthInfoSerializable.toDomain(): AuthInfo {
    return AuthInfo(
        accessToken =  accessToken,
        refreshToken = refreshToken,
        user = user.toDomain()
    )
}

fun UserSerializable.toDomain(): User {
    return User(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasVerifiedEmail,
        profilePictureUrl = profilePictureUrl
    )
}