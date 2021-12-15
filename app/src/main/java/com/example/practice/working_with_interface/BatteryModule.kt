package com.example.practice.working_with_interface

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/15/21.
 */
@Module
abstract class BatteryModule {
    @Binds
    abstract fun providesBattery(batteryDemo: BatteryDemo) : Battery
}