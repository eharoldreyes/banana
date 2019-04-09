package com.eharoldreyes.banana.data.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("hp") val horsePower: Int,
    @Named("cc") val engineCapacity: Int
) : Engine {

    override fun startEngine() {
        Log.d(
            "PetrolEngine", "Engine started " +
                    "\nHorsepower: " + horsePower +
                    "\nEngine Capacity: " + engineCapacity
        )
    }
}