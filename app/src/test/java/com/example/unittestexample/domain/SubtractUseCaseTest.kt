package com.example.unittestexample.domain

import com.example.unittestexample.data.CalcRepositoryImpl
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class SubtractUseCaseTest {

    private lateinit var subtractUseCase: SubtractUseCase

    private val calcRepository = CalcRepositoryImpl()

    @Before
    fun setUp() {
        subtractUseCase = SubtractUseCase(calcRepository)
    }

    @Test
    fun `Test when a = 5 and b = 1` () {
        assertEquals(4, subtractUseCase(5,1))
    }

    @Test
    fun `Test when a = 1 and a = 5` () {
        assertEquals(4, subtractUseCase(1,5))
    }

    @After
    fun tearDown() {

    }

}