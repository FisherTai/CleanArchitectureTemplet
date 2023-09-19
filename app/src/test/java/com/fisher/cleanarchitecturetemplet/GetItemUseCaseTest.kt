package com.fisher.cleanarchitecturetemplet

import com.fisher.cleanarchitecturetemplet.data.repository.Repository
import com.fisher.cleanarchitecturetemplet.domain.usecase.GetItemUseCase
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class GetItemUseCaseTest {

    private lateinit var getItemUseCase: GetItemUseCase

    @Mock
    private lateinit var repository: Repository

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        getItemUseCase = GetItemUseCase(repository)
    }

    @Test
    fun testGetItemUseCase() {
        // 這裡你可以編寫具體的測試邏輯，例如驗證repository的某個方法是否被調用
    }
}