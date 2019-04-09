package com.eharoldreyes.banana.data.dagger

import com.eharoldreyes.banana.data.car.Engine
import com.eharoldreyes.banana.data.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine): Engine

}