package com.pfranccino.business.usecase.user

import com.google.firebase.auth.AuthCredential
import com.pfranccino.core.datasource.UserRemoteDataSource
import com.pfranccino.core.model.Response
import com.pfranccino.core.model.UserDTO
import javax.inject.Inject

class SignInUserFirebaseUseCaseImpl @Inject constructor(private val userRemoteDataSource: UserRemoteDataSource) : SignInUserFirebaseUseCase {
    override fun invoke(auth:AuthCredential): Response<UserDTO?, String?> {
        return userRemoteDataSource.firebaseSignInWithGoogle(auth)
    }
}