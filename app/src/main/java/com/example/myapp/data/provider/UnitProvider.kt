package com.example.myapp.data.provider


import com.example.myapp.internal.UnitSystem


interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}