package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice.module_example.MemoryCardModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
@Inject
lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//one of module is having parameter, Dagger will not allow to use "create() function"
/*        DaggerSmartPhoneComponent.create()
            .inject(this)
        smartPhone.makeACallWithRecording()*/

        (application as SmartPhoneApplication).smartPhoneComponent
            .inject(this)

    }
}