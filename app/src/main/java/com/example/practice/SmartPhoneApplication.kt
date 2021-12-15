package com.example.practice

import android.app.Application
import com.example.practice.module_example.MemoryCardModule

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/15/21.
 */
class SmartPhoneApplication : Application() {
    lateinit var smartPhoneComponent: SmartPhoneComponent
    override fun onCreate() {
        smartPhoneComponent = initDagger()
        super.onCreate()
    }

    fun initDagger() : SmartPhoneComponent =
        DaggerSmartPhoneComponent.builder()
            .memoryCardModule(MemoryCardModule(1000))
            .build()
}