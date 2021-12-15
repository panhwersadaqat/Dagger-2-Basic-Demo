package com.example.practice

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {

    /*private lateinit var serviceProvider: ServiceProvider*/

    //Field Injection
    //public lateinit var serviceProvider: ServiceProvider

    init {
        Log.i("MYTAG","SIM Card Constructed")
    }
    //method Injection
    //fun setServiceProvider(serviceProvider: ServiceProvider){
    //     this.serviceProvider = serviceProvider
   // }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}