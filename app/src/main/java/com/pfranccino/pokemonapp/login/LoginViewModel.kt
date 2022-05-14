package com.pfranccino.pokemonapp.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pfranccino.business.usecase.user.SignInUserFirebaseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(signInUserFirebaseUseCase: SignInUserFirebaseUseCase) : ViewModel() {

    val state: MutableLiveData<LoginViewState> by lazy { MutableLiveData<LoginViewState>() }




}