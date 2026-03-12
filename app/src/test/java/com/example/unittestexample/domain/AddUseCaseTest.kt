package com.example.unittestexample.domain

import com.example.unittestexample.data.CalcRepositoryImpl
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class AddUseCaseTest {

    /**
     * AAA in testing
     * Arrange -> setup everything required for the test
     * Act -> call the function under test
     * Assert -> assert the expectations
     */

    private lateinit var addUseCase: AddUseCase
    private val calcRepository = CalcRepositoryImpl()
    @Before
    fun setUp() {
        addUseCase = AddUseCase(calcRepository)
    }

    @Test
    fun `Test when a = 0 and b = -100` () {
        assertEquals(-100, addUseCase(a = 0 , b = -100))
    }

    @Test
    fun `Test with a = Integer Max and b = 1` () {
        assertNotEquals(Int.MAX_VALUE+ 1, addUseCase(a = Int.MAX_VALUE, b = 1))
    }

    @After
    fun tearDown() {

    }

}

//4 bytes -> 32 bits
//        1 bit -> polarity
//        total bits used to represent an int = 31