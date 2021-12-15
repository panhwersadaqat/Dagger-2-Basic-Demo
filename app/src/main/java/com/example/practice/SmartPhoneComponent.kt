package com.example.practice

import com.example.practice.module_example.MemoryCardModule
import com.example.practice.working_with_interface.BatteryModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/15/21.
 */
@Singleton
@Component(modules = [MemoryCardModule::class, BatteryModule::class])
interface SmartPhoneComponent {
    fun inject(mainActivity: MainActivity)
}