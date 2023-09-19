package com.fisher.cleanarchitecturetemplet.data.repository

import com.fisher.cleanarchitecturetemplet.data.datasource.LocalDataSource
import com.fisher.cleanarchitecturetemplet.data.datasource.RemoteDataSource
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : Repository {
    // 實現 Repository 接口的方法
}