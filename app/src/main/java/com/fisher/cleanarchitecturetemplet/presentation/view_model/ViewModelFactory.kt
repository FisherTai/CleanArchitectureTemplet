package com.fisher.cleanarchitecturetemplet.presentation.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fisher.cleanarchitecturetemplet.data.repository.Repository
import com.fisher.cleanarchitecturetemplet.domain.usecase.GetItemUseCase

class ViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(ItemViewModel::class.java) -> {
                ItemViewModel(GetItemUseCase(repository)) as T
            }
            else -> throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}