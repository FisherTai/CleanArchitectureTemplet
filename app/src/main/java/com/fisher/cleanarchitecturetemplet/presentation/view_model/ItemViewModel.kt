package com.fisher.cleanarchitecturetemplet.presentation.view_model

import androidx.lifecycle.ViewModel
import com.fisher.cleanarchitecturetemplet.domain.usecase.GetItemUseCase
import javax.inject.Inject

class ItemViewModel @Inject constructor(
    private val getItemUseCase: GetItemUseCase
) : ViewModel() {
    // 用於綁定 UI 和用例類的 ViewModel
}