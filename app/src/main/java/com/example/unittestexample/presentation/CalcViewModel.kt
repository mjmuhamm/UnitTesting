package com.example.unittestexample.presentation

import androidx.lifecycle.ViewModel
import com.example.unittestexample.domain.AddUseCase

class CalcViewModel constructor(private val addUseCase: AddUseCase): ViewModel() {
    fun add(a: Int, b: Int) = addUseCase(a,b)
}