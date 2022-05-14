package com.pfranccino.pokemonapp.login

sealed class LoginViewState {
    object OnLoadingProcess : LoginViewState()
    object OnErrorGetUser : LoginViewState()
    object OnSuccessGetUser : LoginViewState()
}