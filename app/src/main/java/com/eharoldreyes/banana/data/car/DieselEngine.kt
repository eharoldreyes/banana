package com.eharoldreyes.banana.data.car

import android.util.Log
import javax.inject.Inject

class DieselEngine (val horsePower: Int) : Engine {

    override fun startEngine() {
        Log.d("DieselEngine", "Engine started horse power: " + horsePower)
    }
}