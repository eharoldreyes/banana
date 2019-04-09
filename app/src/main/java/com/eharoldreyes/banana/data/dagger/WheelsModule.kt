package com.eharoldreyes.banana.data.dagger

import com.eharoldreyes.banana.library.Rims
import com.eharoldreyes.banana.library.Tires
import com.eharoldreyes.banana.library.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }

}