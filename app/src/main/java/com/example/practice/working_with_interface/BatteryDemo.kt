package com.example.practice.working_with_interface

import android.util.Log
import javax.inject.Inject

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/15/21.
 */
class BatteryDemo @Inject constructor(): Battery {
    override fun getPower() {
        Log.i("MYTAG", "Hello world from Battery Demo class using interface")
    }
}