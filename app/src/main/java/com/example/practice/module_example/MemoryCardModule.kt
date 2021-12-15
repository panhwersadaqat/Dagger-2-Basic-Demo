package com.example.practice.module_example

import android.util.Log
import dagger.Module
import dagger.Provides

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/15/21.
 */
@Module
class MemoryCardModule (val memorySize: Int){
    //User Provides annotation so dagger can recognize
    @Provides
    fun providesMemoryCard(): MemoryCard {
        Log.i("MYTAG", "Memory size.....$memorySize")
        return MemoryCard()
    }
}