package com.eharoldreyes.banana

import android.app.Application
import com.eharoldreyes.banana.data.dagger.CarComponent
import com.eharoldreyes.banana.data.dagger.DaggerCarComponent

class BananaApplication : Application() {

    private lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()

        carComponent = DaggerCarComponent.builder()
            //.dieselEngineModule(DieselEngineModule(100))
            .horsePower(150)
            .engineCapacity(1400)
            .build()

    }

    fun getCarComponent(): CarComponent {
        return carComponent
    }

}