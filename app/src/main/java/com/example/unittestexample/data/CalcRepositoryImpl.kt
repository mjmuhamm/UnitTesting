package com.example.unittestexample.data

import com.example.unittestexample.domain.CalcRepository

class CalcRepositoryImpl : CalcRepository {
    override fun add(a: Int, b: Int) : Int {
        return a+b
    }

    override fun subtract(a: Int, b: Int): Int {
        return a-b
    }

}