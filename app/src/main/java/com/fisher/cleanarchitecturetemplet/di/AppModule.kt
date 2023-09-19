package com.fisher.cleanarchitecturetemplet.di

import com.fisher.cleanarchitecturetemplet.data.repository.Repository
import com.fisher.cleanarchitecturetemplet.data.repository.RepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    abstract fun bindRepository(repositoryImpl: RepositoryImpl): Repository
}