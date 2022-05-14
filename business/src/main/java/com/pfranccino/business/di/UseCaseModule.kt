package com.pfranccino.business.di

import com.pfranccino.business.usecase.user.SignInUserFirebaseUseCase
import com.pfranccino.business.usecase.user.SignInUserFirebaseUseCaseImpl
import com.pfranccino.core.datasource.UserRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    internal fun provideGetServiceBillsUseCase(repo: UserRemoteDataSource): SignInUserFirebaseUseCase = SignInUserFirebaseUseCaseImpl(repo)
}