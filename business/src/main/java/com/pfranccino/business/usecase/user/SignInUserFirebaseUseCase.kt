package com.pfranccino.business.usecase.user

import com.google.firebase.auth.AuthCredential
import com.pfranccino.core.model.Response
import com.pfranccino.core.model.UserDTO

interface SignInUserFirebaseUseCase {
    operator fun invoke(auth: AuthCredential) : Response<UserDTO?,String?>
}