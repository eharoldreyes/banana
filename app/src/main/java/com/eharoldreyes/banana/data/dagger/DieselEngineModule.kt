package com.eharoldreyes.banana.data.dagger

import com.eharoldreyes.banana.data.car.DieselEngine
import com.eharoldreyes.banana.data.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(val horsePower: Int) {

    @Provides
    fun provideHorsePower() : Int {
        return horsePower
    }

    @Provides
    fun provideEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }

}