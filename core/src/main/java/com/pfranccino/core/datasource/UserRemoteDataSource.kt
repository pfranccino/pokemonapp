package com.pfranccino.core.datasource

import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseAuth
import com.pfranccino.core.model.Response
import com.pfranccino.core.model.UserDTO
import com.pfranccino.core.model.toUserDTO
import javax.inject.Inject


class UserRemoteDataSource @Inject constructor(private val firebaseAuth: FirebaseAuth) {

    fun firebaseSignInWithGoogle(googleAuthCredential: AuthCredential): Response<UserDTO?, String?> {
        val response : Response<UserDTO?,String?> = Response(error = "Error al generar usuario")
        firebaseAuth.signInWithCredential(googleAuthCredential).addOnCompleteListener { task ->
            when {
                task.isSuccessful -> {
                    task.result.user?.let {
                        response.data = it.toUserDTO()
                    }
                }
                else -> {
                    response.error = "Error al generar usuario, reintente mas tarde"
                }
            }
        }
        return response
    }
}