package com.pfranccino.core.model

import android.net.Uri
import com.google.firebase.auth.FirebaseUser

data class UserDTO(val uuid : String?,val name: String?, val email: String?, val urlPhoto : Uri? )


fun FirebaseUser.toUserDTO(): UserDTO {
    return UserDTO(uuid = uid ?: "", name = this.displayName ?: "", email = this.email ?: "", urlPhoto = photoUrl?: Uri.EMPTY)
}