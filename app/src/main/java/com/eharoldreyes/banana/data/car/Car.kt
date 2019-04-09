package com.eharoldreyes.banana.data.car

import android.util.Log
import com.eharoldreyes.banana.data.dagger.PerActivity
import com.eharoldreyes.banana.library.Wheels
import javax.inject.Inject


class Car @Inject constructor(
    val driver: Driver,
    val engine: Engine,
    val wheel: Wheels
) {

    @Inject
    fun setRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.startEngine()
        Log.d("Car", "Driver " + driver.hashCode() + " drives car " + this.hashCode())
    }
}